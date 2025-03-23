package com.tandat.springboot.demo.myapp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FunRestController {
@GetMapping("/")
public String sayHello() {
    return "Hello!!2";
}
@GetMapping("/workout")
public String getDailyWorkout() {
    return "run 5km!";
}

@GetMapping("/fortune")
public String getDailyFortune() {
    return "Today is your lucky day2";
}


}
