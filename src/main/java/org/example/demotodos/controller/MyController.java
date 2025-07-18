package org.example.demotodos.controller;

import org.example.demotodos.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class MyController {

    @RequestMapping("/todo")
    @ResponseBody
    public Todo getTodo() {
        Todo listodo = Todo.builder().id(1).name("lire").description("livre sur la programmation").done(true).build();
        return listodo;
    }
}
