package com.analuizanc.atendimento.entities.dtos;

import com.analuizanc.atendimento.entities.enums.UserRole;

import java.util.UUID;

public record UserResponseDto(
        UUID id,
        String name,
        String email,
        UserRole role
) {

}
