package com.example.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lib.service.PostService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostResponseDTO createPost(@Valid @RequestBody final PostCreateRequestBodyDTO body) {
        final var post = postService.createPost(body.title(), body.body());
        return PostResponseDTO.fromPost(post);
    }

    @GetMapping
    public List<PostResponseDTO> findPosts(final String title) {
        final var posts = postService.findPosts(title);
        return posts.stream().map(PostResponseDTO::fromPost).toList();
    }
}
