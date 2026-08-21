package com.analuizanc.atendimento.services;

import com.analuizanc.atendimento.entities.User;
import com.analuizanc.atendimento.entities.dtos.UserRequestDto;
import com.analuizanc.atendimento.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(UserRequestDto data) {
        User user = new User();

        user.setName(data.name());
        user.setEmail(data.email());

        String encryptedPassword = passwordEncoder.encode(data.password());
        user.setPassword(encryptedPassword);

        user.setRole(data.role());

        return userRepository.save(user);
    }
}
