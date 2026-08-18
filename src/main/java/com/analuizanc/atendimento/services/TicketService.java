package com.analuizanc.atendimento.services;

import com.analuizanc.atendimento.repositories.TicketRepository;
import com.analuizanc.atendimento.entities.Ticket;
import com.analuizanc.atendimento.entities.enums.TicketStatus;
import com.analuizanc.atendimento.entities.dtos.CreateTicketRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket createTicket(CreateTicketRequestDto request) {
        Ticket ticket = new Ticket();

        ticket.setTitle(request.getTitle());
        ticket.setDescription(request.getDescription());
        ticket.setCategory(request.getCategory());
        ticket.setPriority(request.getPriority());
        ticket.setStatus(TicketStatus.OPEN);

        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
