package com.todowithreactspringboot;

import com.todowithreactspringboot.pojo.Todo;
import com.todowithreactspringboot.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TodoResource {

    @Autowired
    private TodoService todoService;

    @GetMapping("users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable("username") String username){
        return todoService.findAll();
    }

    @GetMapping("users/{username}/todos/{id}")
    public Todo getTodos(@PathVariable("username") String username, @PathVariable long id){
        return todoService.findById(id);
    }


    /*Delete Method*/
//    Delete method returns no content
//    When it's not successful it will show not found
    @DeleteMapping("users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){

        Todo todo = todoService.deleteById(id);

        if(todo != null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    //update
//    update request will return ok status and the content(updated resources)
    @PutMapping("users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
        Todo todoUpdate = todoService.save(todo);
        return new ResponseEntity<Todo>(todo,HttpStatus.OK);
    }

//    create
//    will return uri of the created resources
    @PostMapping("users/{username}/todos")
    public ResponseEntity<Void> addTodo(@PathVariable String username, @RequestBody Todo todo){
        Todo todoAdded = todoService.save(todo);

        //location of the todo

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(todoAdded.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
