package br.com.bagaggio.ms1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MicroServiceOneController {

    @GetMapping("/hello")
    public String findWorld() {
        return "Hello World!";
    }
}
