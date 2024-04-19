package com.example.lib.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.lib.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    public List<Post> findByTitleContainingIgnoreCase(String title);
}
