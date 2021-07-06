package com.engsoft.AgendaVirtual.api;

import com.engsoft.AgendaVirtual.service.UserRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.engsoft.AgendaVirtual.model.User;

@RestController
public class UserController {
    private UserRepository repository;

    public UserController(UserRepository repository){
        this.repository = repository;
    }

    // Cria o usuário
    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return repository.save(user);
    }
}
