package org.example.demotodos.controller;

import org.example.demotodos.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class TodoController {

    @RequestMapping("/todo")
    @ResponseBody
    public Todo getTodo() {
        Todo listodo = Todo.builder().id(1).name("lire").description("livre sur la programmation").done(true).build();
        return listodo;
    }

    @RequestMapping("/liste-todos")
    @ResponseBody
    public List<Todo> getListeTodos() {
        List<Todo> todos = Arrays.asList(
                Todo.builder().id(1).name("lire").description("livre sur la programmation").done(true).build(),
                Todo.builder().id(2).name("coder").description("faire un exo Spring Boot").done(false).build(),
                Todo.builder().id(3).name("courir").description("faire un footing").done(false).build()
        );
        return todos;
    }
}
