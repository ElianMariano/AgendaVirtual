package com.engsoft.AgendaVirtual.service;

import org.springframework.data.repository.CrudRepository;
import com.engsoft.AgendaVirtual.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
