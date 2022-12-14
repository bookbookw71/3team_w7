package com.example.bookbookw71.model;


import com.example.bookbookw71.dto.PostRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private int bookPage;

    @Column(nullable = false)
    private int star;

    @Column(nullable = false)
    private String readStart;

    @Column(nullable = false)
    private String readEnd;


    public Post(String title, String content, String username, String imageUrl, int bookPage) {
        this.title = title;
        this.content =content;
        this.imageUrl = imageUrl;
        this.username = username;
        this.bookPage = bookPage;
    };

    public Post(String title, String username, String content, String imageUrl, int bookPage, int star, String readStart, String readEnd) {
        this.title = title;
        this.content =content;
        this.username = username;
        this.imageUrl = imageUrl;
        this.bookPage = bookPage;
        this.star = star;
        this.readStart = readStart;
        this.readEnd = readEnd;
    };

    public Post(int star, String content, String readStart, String readEnd) {
        this.star = star;
        this.content =content;
        this.readStart = readStart;
        this.readEnd = readEnd;

    };

    public void update(PostRequestDto postRequestDto) {
        this.title = postRequestDto.getTitle();
        this.star = postRequestDto.getStar();
        this.content =postRequestDto.getContent();
        this.readStart = postRequestDto.getReadStart();
        this.readEnd = postRequestDto.getReadEnd();
    }

    public boolean validateMember(Member member) {
        return !this.getUsername().equals(member.getUsername());
    }
}