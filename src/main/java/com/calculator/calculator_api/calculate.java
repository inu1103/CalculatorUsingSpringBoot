package com.calculator.calculator_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculate {
    
    @GetMapping("/sum/{a}/{b}")
    public JsonOutput sum(@PathVariable double a, @PathVariable double b){
        return new JsonOutput(a, b, a+b);
    }
    @GetMapping("/difference/{a}/{b}")
    public JsonOutput difference(@PathVariable double a, @PathVariable double b){
        return new JsonOutput(a, b, a-b);
    }
    @GetMapping("/product/{a}/{b}")
    public JsonOutput product(@PathVariable double a, @PathVariable double b){
        return new JsonOutput(a, b, a*b);
    }
    @GetMapping("/division/{a}/{b}")
    public JsonOutput division(@PathVariable double a, @PathVariable double b){
        return new JsonOutput(a, b, a/b);
    }

}