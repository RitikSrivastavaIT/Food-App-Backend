package com.ritik.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Home API")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> Home(){
        return new ResponseEntity<>("Welcome to food delivery project", HttpStatus.OK);

    }
}
