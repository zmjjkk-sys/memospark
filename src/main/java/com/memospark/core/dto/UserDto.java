package com.memospark.core.dto;

import com.memospark.core.domain.UserRole;

public record UserDto(Long id, String username, UserRole role) {}
