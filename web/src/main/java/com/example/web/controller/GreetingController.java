package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lib.configuration.MyConfig;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private final MyConfig myConfig;

    @GetMapping("greeting")
    public String greeting() {
        return myConfig.greetingMessage();
    }

}
