package com.engsoft.AgendaVirtual.api;


import com.engsoft.AgendaVirtual.model.Tasks;
import com.engsoft.AgendaVirtual.service.TaskRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {
    private TaskRepository repository;

    public TasksController(TaskRepository repository){
        this.repository = repository;
    }
    
    // Cria a tarefa
    @PostMapping("/task")
    public Tasks createTask(@RequestBody Tasks task){
        return repository.save(task);
        
    }
    //Listar tarefas
    @GetMapping("/task")
    public Iterable <Tasks> listTasks(){
    	return repository.findAll();
    }
    
   
   
}
