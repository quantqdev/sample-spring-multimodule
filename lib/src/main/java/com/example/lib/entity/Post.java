package com.example.lib.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;

@Builder(toBuilder = true)
@Table("posts")
public record Post(
        @Id @Column("id") Long id,
        @Column("title") String title,
        @Column("body") String body) {
}
