package edu.ib.networktechnologies;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorld{


    @GetMapping("/helloWorld")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/hello")
    public String helloSomeone(@RequestParam String name, @RequestParam String surname){
        return "Hello " + name + " " +surname;
    }

    @GetMapping("/anotherHello/{name}")
    public String otherHello(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam int number1, @RequestParam int number2){
        int sum = number1 + number2;
        return "The sum is: " + sum;
    }
}