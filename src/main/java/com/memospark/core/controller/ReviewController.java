package com.memospark.core.controller;

import com.memospark.core.dto.ReviewCardDto;
import com.memospark.core.dto.ReviewRequest;
import com.memospark.core.service.ReviewService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;
    private final UserService userService;

    @GetMapping("/today")
    public List<ReviewCardDto> getTodaysDueCards(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return reviewService.getTodaysDueCards(userId);
    }

    @GetMapping("/deck/{deckId}")
    public List<ReviewCardDto> getDueCardsByDeck(@PathVariable Long deckId,
                                                  @RequestParam(required = false) List<String> tags,
                                                  @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return reviewService.getDueCardsByDeck(deckId, tags, userId, isAdmin);
    }

    @PostMapping("/{cardId}")
    public ReviewCardDto submitReview(@PathVariable Long cardId,
                                      @RequestBody ReviewRequest req,
                                      @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return reviewService.submitReview(cardId, req, userId);
    }

    @GetMapping("/hard")
    public List<ReviewCardDto> getHardCards(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return reviewService.getHardCards(userId);
    }

    @PostMapping("/{cardId}/undo")
    public ReviewCardDto undoLastReview(@PathVariable Long cardId,
                                        @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return reviewService.undoLastReview(cardId, userId);
    }
}
