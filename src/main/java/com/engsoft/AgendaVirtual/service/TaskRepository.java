package com.engsoft.AgendaVirtual.service;

import com.engsoft.AgendaVirtual.model.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Tasks, Long>{
    
}
