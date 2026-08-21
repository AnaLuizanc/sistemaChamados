package com.analuizanc.atendimento.controllers;

import com.analuizanc.atendimento.entities.User;
import com.analuizanc.atendimento.entities.dtos.UserRequestDto;
import com.analuizanc.atendimento.entities.dtos.UserResponseDto;
import com.analuizanc.atendimento.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto data) {
        return userService.save(data);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }
}
