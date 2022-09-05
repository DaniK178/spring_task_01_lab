package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
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
            Reply newgreeting = new Reply("Good afternoon", "Colin!");
            return newgreeting;
        }

//    @GetMapping
//    public Reply greeting(@RequestParam(value = "timeOfDay) String timeOfDay){
//        Reply newgreeting = new Reply("Good afternoon", "Colin!");
//
//    }


    @GetMapping(value ="/christmas")
        public Celebration celebrations(){
        Celebration christmas = new Celebration("Merry Christmas");
        return christmas;

    }
}



