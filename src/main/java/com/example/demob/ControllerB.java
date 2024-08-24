package com.example.demob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @GetMapping("/api/b")
    public String handleRequest(@RequestParam String message) {
        return "Received message: ------" + message;
    }
}
