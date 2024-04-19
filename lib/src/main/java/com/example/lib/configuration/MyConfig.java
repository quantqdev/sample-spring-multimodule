package com.example.lib.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "myconfig")
public record MyConfig(
        String greetingMessage) {
}
