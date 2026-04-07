package com.memospark.core.init;

import com.memospark.core.domain.*;
import com.memospark.core.repository.CardProgressRepository;
import com.memospark.core.repository.CardRepository;
import com.memospark.core.repository.DeckRepository;
import com.memospark.core.repository.UserRepository;
import com.memospark.core.service.SpacedRepetitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Slf4j
@Order(0)
public class AdminInitializer implements ApplicationRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final DeckRepository deckRepository;
    private final CardRepository cardRepository;
    private final CardProgressRepository cardProgressRepository;
    private final SpacedRepetitionService srsService;

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        if (userRepository.findByUsername("admin").isEmpty()) {
            User admin = new User("admin", passwordEncoder.encode("admin123"), UserRole.ADMIN);
            admin = userRepository.save(admin);

            // Copy builtin decks for admin
            for (var template : BuiltinDataInitializer.getTemplates()) {
                Deck deck = new Deck(template.name(), template.description(), DeckType.BUILTIN, admin);
                deck = deckRepository.save(deck);
                for (String[] qa : template.cards()) {
                    Card card = new Card(deck, qa[0], qa[1], qa.length > 2 ? qa[2] : "");
                    card = cardRepository.save(card);
                    CardProgress progress = new CardProgress(card);
                    srsService.initProgress(progress, admin.getId());
                    cardProgressRepository.save(progress);
                }
            }
            log.info("Created default admin account: admin / admin123");
        }
    }
}
