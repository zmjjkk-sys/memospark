package com.memospark.core.controller;

import com.memospark.core.dto.*;
import com.memospark.core.service.CardService;
import com.memospark.core.service.DeckService;
import com.memospark.core.service.SpacedRepetitionService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/decks")
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;
    private final CardService cardService;
    private final UserService userService;
    private final SpacedRepetitionService srsService;

    // ── Pool endpoints ──

    @GetMapping("/pool")
    public List<DeckSummaryDto> getPoolDecks() {
        return deckService.getPoolDecks();
    }

    @PostMapping("/pool")
    @ResponseStatus(HttpStatus.CREATED)
    public DeckSummaryDto createPoolDeck(@RequestBody CreateDeckRequest req,
                                          @AuthenticationPrincipal UserDetails userDetails) {
        var user = userService.getUserByUsername(userDetails.getUsername());
        return deckService.createPoolDeck(user, req);
    }

    @PostMapping("/pool/{id}/copy")
    @ResponseStatus(HttpStatus.CREATED)
    public DeckSummaryDto copyPoolDeck(@PathVariable Long id,
                                        @AuthenticationPrincipal UserDetails userDetails) {
        var user = userService.getUserByUsername(userDetails.getUsername());
        return deckService.copyPoolDeck(id, user, srsService);
    }

    @GetMapping
    public List<DeckSummaryDto> getAllDecks(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return deckService.getAllDecks(userId, isAdmin);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeckSummaryDto createDeck(@RequestBody CreateDeckRequest req,
                                      @AuthenticationPrincipal UserDetails userDetails) {
        var user = userService.getUserByUsername(userDetails.getUsername());
        return deckService.createDeck(user, req);
    }

    @PutMapping("/{id}")
    public DeckSummaryDto updateDeck(@PathVariable Long id, @RequestBody UpdateDeckRequest req,
                                      @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        var deck = deckService.getDeckOrThrow(id);
        deckService.verifyOwnership(deck, userId, isAdmin);
        return deckService.updateDeck(id, req);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDeck(@PathVariable Long id, @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        var deck = deckService.getDeckOrThrow(id);
        deckService.verifyOwnership(deck, userId, isAdmin);
        deckService.deleteDeck(id);
    }

    @GetMapping("/{id}/tags")
    public List<String> getTags(@PathVariable Long id, @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        var deck = deckService.getDeckOrThrow(id);
        deckService.verifyOwnership(deck, userId, isAdmin);
        return deckService.getDistinctTags(id);
    }

    // --- Card endpoints nested under deck ---

    @GetMapping("/{id}/cards")
    public List<ReviewCardDto> getCards(@PathVariable Long id,
                                         @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return cardService.getCardsByDeck(id, userId, isAdmin);
    }

    @PostMapping("/{id}/cards")
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewCardDto createCard(@PathVariable Long id, @RequestBody CreateCardRequest req,
                                     @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return cardService.createCard(id, req, userId, isAdmin);
    }

    @PutMapping("/{id}/cards/{cid}")
    public ReviewCardDto updateCard(@PathVariable Long id, @PathVariable Long cid,
                                     @RequestBody CreateCardRequest req,
                                     @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return cardService.updateCard(id, cid, req, userId, isAdmin);
    }

    @DeleteMapping("/{id}/cards/{cid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCard(@PathVariable Long id, @PathVariable Long cid,
                            @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        cardService.deleteCard(id, cid, userId, isAdmin);
    }

    @PostMapping("/{id}/cards/batch-delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void batchDeleteCards(@PathVariable Long id, @RequestBody BatchCardRequest req,
                                  @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        cardService.batchDelete(id, req.cardIds(), userId, isAdmin);
    }

    @PostMapping("/{id}/cards/batch-move")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void batchMoveCards(@PathVariable Long id, @RequestBody BatchCardRequest req,
                                @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        cardService.batchMove(id, req.targetDeckId(), req.cardIds(), userId, isAdmin);
    }
}
