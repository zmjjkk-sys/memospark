package com.memospark.core.repository;

import com.memospark.core.domain.SrsSettings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SrsSettingsRepository extends JpaRepository<SrsSettings, Long> {
    Optional<SrsSettings> findByUserId(Long userId);
}
