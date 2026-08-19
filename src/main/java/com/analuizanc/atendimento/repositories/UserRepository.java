package com.analuizanc.atendimento.repositories;

import com.analuizanc.atendimento.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
