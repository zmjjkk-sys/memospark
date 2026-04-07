package com.memospark.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "decks")
@Getter
@Setter
@NoArgsConstructor
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private DeckType type = DeckType.CUSTOM;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private Integer dailyReviewLimit; // null = no limit

    @Column
    private Integer dailyNewCardLimit; // null = no limit, e.g. 20 new cards/day

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public Deck(String name, String description, DeckType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public Deck(String name, String description, DeckType type, User user) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.user = user;
    }
}
