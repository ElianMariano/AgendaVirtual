package com.engsoft.AgendaVirtual.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // Altera os usuarios
    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return repository.findById(id)
            .map(user -> {
                user.setNome(newUser.getNome());
                user.setTelefone(newUser.getTelefone());
                user.setCidade(newUser.getCidade());
                user.setRua(newUser.getRua());
                user.setUf(newUser.getUf());
                user.setSenha(newUser.getSenha());
                user.setEmail(newUser.getEmail());
                user.setNascimento(newUser.getNascimento());
                return repository.save(user);
            })
            .orElseGet(() -> {
                newUser.setId(id);
                return repository.save(newUser);
            });
    }
    
    //Remover usuários
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
    	repository.deleteById(id);
    }
}
