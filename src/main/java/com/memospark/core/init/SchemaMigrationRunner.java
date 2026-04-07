package com.memospark.core.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * One-time schema migration to fix srs_settings table from singleton (id=1)
 * to per-user auto-increment after adding multi-user support.
 */
@Component
@RequiredArgsConstructor
@Slf4j
@Order(0) // run before everything else
public class SchemaMigrationRunner implements ApplicationRunner {

    private final JdbcTemplate jdbc;

    @Override
    public void run(ApplicationArguments args) {
        try {
            // Check if srs_settings.id is AUTO_INCREMENT
            var rows = jdbc.queryForList(
                "SELECT EXTRA FROM information_schema.COLUMNS " +
                "WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = 'srs_settings' AND COLUMN_NAME = 'id'");

            if (!rows.isEmpty()) {
                String extra = String.valueOf(rows.get(0).get("EXTRA"));
                if (!extra.toLowerCase().contains("auto_increment")) {
                    log.info("Migrating srs_settings table: adding AUTO_INCREMENT to id column");
                    // Delete old singleton row and add auto_increment
                    jdbc.execute("DELETE FROM srs_settings");
                    jdbc.execute("ALTER TABLE srs_settings MODIFY id BIGINT NOT NULL AUTO_INCREMENT");
                    log.info("srs_settings migration complete");
                }
            }
        } catch (Exception e) {
            log.warn("srs_settings migration skipped (table may not exist yet): {}", e.getMessage());
        }
    }
}
