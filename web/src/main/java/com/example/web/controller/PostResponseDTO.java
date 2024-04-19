package com.example.web.controller;

import com.example.lib.entity.Post;

import lombok.Builder;

@Builder(toBuilder = true)
public record PostResponseDTO(
        Long id,
        String title,
        String body) {
    public static PostResponseDTO fromPost(Post post) {
        return builder()
                .id(post.id())
                .title(post.title())
                .body(post.body())
                .build();
    }
}
