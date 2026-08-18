package com.analuizanc.atendimento.ticket.dto;

import com.analuizanc.atendimento.ticket.TicketCategory;
import com.analuizanc.atendimento.ticket.TicketPriority;
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
