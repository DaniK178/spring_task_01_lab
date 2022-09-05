package com.example.task_01.controllers;

import com.example.task_01.models.Reply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/greeting")

    public class GreetingController {

        @GetMapping
        public Reply greeting(){
            Reply newgreeting = new Reply("Good afternoon", "Colin");
            return newgreeting;
        }

    }


//    public String greeting(@RequestParam(value = "name") String name){
//        // the value can actually be anything - if we put "batman" it will still work, but it is good convention to do
//        //return "Hello World!";
//        return "Hello " + name;
//        // we get the name through the URL
//        // we get this through the annotation RequestParam


