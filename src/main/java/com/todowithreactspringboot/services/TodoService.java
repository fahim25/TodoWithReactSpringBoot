package com.todowithreactspringboot.services;

import com.todowithreactspringboot.pojo.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int idCounter = 0;


    static {
        todos.add(new Todo(++idCounter, "username","Todo Testing One", new Date(), false));
        todos.add(new Todo(++idCounter, "username","Todo Testing Two", new Date(), false));
        todos.add(new Todo(++idCounter, "username","Todo Testing Three", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }

}