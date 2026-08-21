package com.analuizanc.atendimento.entities.dtos;

import com.analuizanc.atendimento.entities.enums.UserRole;

public record UserRequestDto(
        String name,
        String email,
        String password,
        UserRole role
) {}
