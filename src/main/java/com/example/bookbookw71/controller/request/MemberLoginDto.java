package com.example.bookbookw71.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginDto {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

}