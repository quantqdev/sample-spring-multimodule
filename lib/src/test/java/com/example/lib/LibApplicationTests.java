package com.example.lib;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.lib.configuration.MyConfig;
import com.example.lib.service.GreetingService;
import com.example.lib.service.PostService;

@SpringBootTest
class LibApplicationTests {
	@Autowired
	MyConfig myConfig;

	@Autowired
	GreetingService greetingService;

	@Autowired
	PostService postService;

	@SpringBootApplication
	@EnableConfigurationProperties(MyConfig.class)
	static class TestConfiguration {
	}

	@Test
	void MyConfig_LoadCorrectly() {
		final var greetingMessage = myConfig.greetingMessage();
		Assertions.assertThat(greetingMessage).isEqualTo("hello from lib");
	}

	@Test
	void GreetingService_ReturnCorrectMessage() {
		Assertions.assertThat(greetingService.getGreetingMessage()).isEqualTo("hello from lib");
	}

	@Test
	void PostService_CreateAndFindCorrectly() {
		final var post = postService.createPost("post 1 title", "post 1 body");
		Assertions.assertThat(post.id()).isEqualTo(1);

		final var searchedPosts = postService.findPosts("1 TIT");
		Assertions.assertThat(searchedPosts).hasSize(1);
		Assertions.assertThat(searchedPosts.get(0).id()).isEqualTo(1);
	}
}
