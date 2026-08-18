package com.analuizanc.atendimento.repositories;

import com.analuizanc.atendimento.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
