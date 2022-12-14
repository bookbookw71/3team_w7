package com.example.bookbookw71.dto;

import com.example.bookbookw71.model.Member;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class PostResponse {
    private long id;

    private String username;

    private String title;

    private String content;

    private String imageUrl;

    private int bookPage;

    private int star;

    private String readStart;

    private String readEnd;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
}
