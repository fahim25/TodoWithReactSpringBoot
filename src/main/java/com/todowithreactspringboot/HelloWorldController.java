package com.todowithreactspringboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean!");
//        throw new RuntimeException("Somthing Went Wrong!");
    }

    @GetMapping("/helloWorldBean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable("name") String name){
//        return new HelloWorldBean("Hello! " + name);
        return new HelloWorldBean(String.format("Hello %s !", name));
    }

}
