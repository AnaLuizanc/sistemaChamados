package com.analuizanc.atendimento.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ErrorResponseDto {
    private LocalDateTime timestamp;

    private Integer status;

    private String error;

    private String message;
}
