package com.example.lib.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lib.entity.Post;
import com.example.lib.repository.PostRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(@NonNull final String title, @NonNull final String body) {
        return postRepository.save(
                Post.builder().title(title).body(body).build());
    }

    public List<Post> findPosts(final String title) {
        return postRepository.findByTitleContainingIgnoreCase(title == null ? "" : title);
    }
}
