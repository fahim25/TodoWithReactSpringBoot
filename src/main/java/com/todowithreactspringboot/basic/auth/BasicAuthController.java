/*package com.todowithreactspringboot.basic.auth;

import com.todowithreactspringboot.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BasicAuthController {

*//*    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloWorldBean")
    public AuthenticationBean helloWorldBean(){
        return new AuthenticationBean("Hello World Bean!");
//        throw new RuntimeException("Somthing Went Wrong!");
    }*//*

   *//* @GetMapping("/helloWorldBean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable("name") String name){
//        return new HelloWorldBean("Hello! " + name);
        return new HelloWorldBean(String.format("Hello %s !", name));
    }

    }*//*

    @GetMapping("/basicAuth")
    public AuthenticationBean authenticationBean(){
//        return new AuthenticationBean("Hello! " + name);
        return new AuthenticationBean("You Are Authenticated");
    }

}*/
