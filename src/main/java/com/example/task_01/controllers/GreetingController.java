package com.example.task_01.controllers;

import com.example.task_01.models.Reply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class GreetingController {

    @RestController

    public class GreetiingController{

        @GetMapping("/greeting")
        public Reply greeting(){

        }

    }

}
