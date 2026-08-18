package com.analuizanc.atendimento.controllers;

import com.analuizanc.atendimento.services.TicketService;
import com.analuizanc.atendimento.entities.Ticket;
import com.analuizanc.atendimento.entities.dtos.CreateTicketRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody @Valid CreateTicketRequestDto request) {
        Ticket ticket = ticketService.createTicket(request);

        return ResponseEntity.ok(ticket);
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        return ResponseEntity.ok(ticketService.getAllTickets());
    }
}
