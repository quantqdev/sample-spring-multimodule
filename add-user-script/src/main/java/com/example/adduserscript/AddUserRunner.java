package com.example.adduserscript;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.lib.service.PostService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AddUserRunner implements ApplicationRunner {

    private final PostService postService;

    @Override
    public void run(@NonNull final ApplicationArguments args) throws Exception {
        final var savedPost = postService.createPost("post aus", "post created by add-user-runner");
        System.out.println(savedPost);
    }

}
