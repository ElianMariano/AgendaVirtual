package com.engsoft.AgendaVirtual.api;


import com.engsoft.AgendaVirtual.model.Tasks;
import com.engsoft.AgendaVirtual.service.TaskRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    //Remover tarefas
    @DeleteMapping("/task/{id}")
    public void deleteTasks(@PathVariable Long id){
    	repository.deleteById(id);
    }
   
   
}
