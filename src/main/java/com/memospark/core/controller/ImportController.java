package com.memospark.core.controller;

import com.memospark.core.dto.ImportResultDto;
import com.memospark.core.service.ImportService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/import")
@RequiredArgsConstructor
public class ImportController {

    private final ImportService importService;
    private final UserService userService;

    @PostMapping("/json")
    public ImportResultDto importJson(@RequestParam Long deckId,
                                      @RequestParam("file") MultipartFile file,
                                      @AuthenticationPrincipal UserDetails userDetails) throws IOException {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return importService.importJson(deckId, file, userId, isAdmin);
    }

    @PostMapping("/csv")
    public ImportResultDto importCsv(@RequestParam Long deckId,
                                     @RequestParam("file") MultipartFile file,
                                     @AuthenticationPrincipal UserDetails userDetails) throws IOException {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        return importService.importCsv(deckId, file, userId, isAdmin);
    }
}
