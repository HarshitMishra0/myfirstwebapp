package com.studying.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
@Controller
public class ToDoController {
    public ToDoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;

    //list-todos
    @RequestMapping("list-todos")
    public String listAllTodos(){
        return "listTodos";
    }


}
