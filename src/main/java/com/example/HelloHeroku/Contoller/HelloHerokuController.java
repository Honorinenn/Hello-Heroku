package com.example.HelloHeroku.Contoller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHerokuController {
    // @RequestMapping(value="/hello", method = RequestMethod.GET)
    @GetMapping(value="/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "hello";
    }
}


