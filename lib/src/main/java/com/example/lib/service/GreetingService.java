package com.example.lib.service;

import org.springframework.stereotype.Service;

import com.example.lib.configuration.MyConfig;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GreetingService {
    private final MyConfig myConfig;

    public String getGreetingMessage() {
        return myConfig.greetingMessage();
    }
}
