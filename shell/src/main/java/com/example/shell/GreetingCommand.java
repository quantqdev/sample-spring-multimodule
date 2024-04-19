package com.example.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.lib.configuration.MyConfig;

import lombok.RequiredArgsConstructor;

@ShellComponent
@RequiredArgsConstructor
public class GreetingCommand {

    private final MyConfig myConfig;

    @ShellMethod(key = "hello")
    public String hello() {
        return myConfig.greetingMessage();
    }
}
