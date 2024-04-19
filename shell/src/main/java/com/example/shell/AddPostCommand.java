package com.example.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.lib.service.PostService;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;

@ShellComponent
@RequiredArgsConstructor
public class AddPostCommand {

    private final PostService postService;

    @ShellMethod(key = "add-post")
    public String addPost(
            @Size(min = 1, max = 200) final String title,
            @NotEmpty final String body) {

        final var savedPost = postService.createPost(title, body);

        return savedPost.toString();
    }

}
