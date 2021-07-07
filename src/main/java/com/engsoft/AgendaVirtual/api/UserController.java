package com.engsoft.AgendaVirtual.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.engsoft.AgendaVirtual.model.User;
import com.engsoft.AgendaVirtual.service.UserRepository;

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
    
    //Listar os usuários
    @GetMapping("/user")
    public Iterable <User> listUsers(){
    	return repository.findAll();
    }
    
}
