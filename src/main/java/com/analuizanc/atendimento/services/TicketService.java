package com.analuizanc.atendimento.services;

import com.analuizanc.atendimento.entities.Ticket;
import com.analuizanc.atendimento.entities.User;
import com.analuizanc.atendimento.entities.dtos.CreateTicketRequestDto;
import com.analuizanc.atendimento.entities.enums.TicketStatus;
import com.analuizanc.atendimento.repositories.TicketRepository;
import com.analuizanc.atendimento.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

    public Ticket createTicket(CreateTicketRequestDto request) {
        User userRequester = userRepository.findById(request.getRequesterId()).orElseThrow(() -> new IllegalArgumentException("Requester not found with id: " + request.getRequesterId()));

        Ticket ticket = new Ticket();
        ticket.setTitle(request.getTitle());
        ticket.setDescription(request.getDescription());
        ticket.setCategory(request.getCategory());
        ticket.setPriority(request.getPriority());
        ticket.setStatus(TicketStatus.OPEN);
        ticket.setCreatedBy(userRequester);

        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
