package com.devribeiro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devribeiro.enuns.Status;
import com.devribeiro.models.Task;

public class Kanban {
    List<Task> tasks;
    
    public Kanban(){
        this.tasks =new ArrayList<>();
        
    }

    public void createTask(String nome){
        int id=tasks.size()+1;
        Task register = new Task(id, nome, Status.PARA_FAZER);

        this.tasks.add(register);
         System.out.println("Tarefa criada com Sucesso!");
        System.out.println("\n");

    }
    public void createTask(String nome, Status status){
        int id=tasks.size()+1;
        Task register = new Task(id, nome, status);

        this.tasks.add(register);
        System.out.println("Tarefa criada com Sucesso!");
        System.out.println("\n");

    }

    public void listAllTasks(){

        for (Task t: this.tasks){
            System.out.println("================");
            System.out.println(t.getId());
            System.out.println(t.getNome());
            System.out.println(t.getStatus());
            System.out.println("\n");
        }
    
    }

    public void listTaskid(int id){
         List<Task> filteredTasks =this.tasks.stream()
        .filter(task -> task.getId() == id)
        .collect(Collectors.toList());

        for (Task t: filteredTasks){
            System.out.println("================");
            System.out.println(t.getId());
            System.out.println(t.getNome());
            System.out.println(t.getStatus());
            System.out.println("\n");
        }
   
    }

    public void listTaskStatus(Status filter){
        List<Task> filteredTasks =this.tasks.stream()
        .filter(task -> task.getStatus() == filter)
        .collect(Collectors.toList());

        for (Task t: filteredTasks){
            System.out.println("================");
            System.out.println(t.getId());
            System.out.println(t.getNome());
            System.out.println(t.getStatus());
            System.out.println("\n");
        }
        
    }

    public void upStatusTaskid(int id,Status status){
         List<Task> filteredTasks =this.tasks.stream()
        .filter(task -> task.getId() == id)
        .collect(Collectors.toList());

        for (Task t: filteredTasks){
             t.setId(t.getId());  
             t.setNome(t.getNome());  
             t.setStatus(status);

        }
   
    }

    public void updateTaskStatus(int id, Status newStatus){
        List<Task> updateTaskList = this.tasks.stream()
        .map(task->{
            if(task.getId()==id){
                task.setStatus(newStatus);
            }
            return task;
        }) .collect(Collectors.toList());
        this.tasks =updateTaskList;
    }
  
    
}
