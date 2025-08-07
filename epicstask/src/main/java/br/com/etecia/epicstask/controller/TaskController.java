package br.com.etecia.epicstask.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController{

@GetMapping


    public String listTasks(){
        System.out.println("listar tarefas...");
        return "tasks";
    }
}
