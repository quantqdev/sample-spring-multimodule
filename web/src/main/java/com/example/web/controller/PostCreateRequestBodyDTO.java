package com.example.web.controller;

import jakarta.validation.constraints.NotEmpty;

public record PostCreateRequestBodyDTO(
        @NotEmpty String title,
        @NotEmpty String body) {
}
