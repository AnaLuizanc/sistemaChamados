package com.analuizanc.atendimento.entities.dtos;

import com.analuizanc.atendimento.entities.enums.TicketCategory;
import com.analuizanc.atendimento.entities.enums.TicketPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTicketRequestDto {

    @NotBlank
    @Size(min = 10, max = 100)
    private String title;

    @NotBlank
    @Size(min = 20, max = 500)
    private String description;

    @NotNull
    private TicketCategory category;

    @NotNull
    private TicketPriority priority;
}
