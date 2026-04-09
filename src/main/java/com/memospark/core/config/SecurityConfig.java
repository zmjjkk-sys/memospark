package com.memospark.core.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Map;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(UserService userService, PasswordEncoder encoder) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userService);
        provider.setPasswordEncoder(encoder);
        return new ProviderManager(provider);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, ObjectMapper objectMapper) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**").permitAll()
                .requestMatchers("/login.html", "/style.css", "/app.js", "/i18n-builtin.js", "/i18n-problems.js").permitAll()
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .requestMatchers(org.springframework.http.HttpMethod.POST, "/api/practice/problems").hasRole("ADMIN")
                .requestMatchers(org.springframework.http.HttpMethod.PUT, "/api/practice/problems/*").hasRole("ADMIN")
                .requestMatchers(org.springframework.http.HttpMethod.DELETE, "/api/practice/problems/*").hasRole("ADMIN")
                .requestMatchers(org.springframework.http.HttpMethod.POST, "/api/decks/pool").hasRole("ADMIN")
                .requestMatchers("/api/**").authenticated()
                .anyRequest().permitAll()
            )
            .exceptionHandling(ex -> ex
                .authenticationEntryPoint((request, response, authException) -> {
                    response.setStatus(HttpStatus.UNAUTHORIZED.value());
                    response.setContentType("application/json;charset=UTF-8");
                    objectMapper.writeValue(response.getOutputStream(),
                            Map.of("error", "Not authenticated"));
                })
            )
            .logout(logout -> logout
                .logoutUrl("/api/auth/logout")
                .logoutSuccessHandler((request, response, authentication) -> {
                    response.setStatus(HttpStatus.OK.value());
                    response.setContentType("application/json;charset=UTF-8");
                    objectMapper.writeValue(response.getOutputStream(),
                            Map.of("message", "Logged out"));
                })
            );
        return http.build();
    }
}
