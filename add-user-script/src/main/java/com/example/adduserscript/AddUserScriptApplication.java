package com.example.adduserscript;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import com.example.lib.configuration.MyConfig;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example")
@EnableJdbcRepositories(basePackages = "com.example")
@EnableConfigurationProperties(MyConfig.class)
public class AddUserScriptApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddUserScriptApplication.class, args);
	}

}
