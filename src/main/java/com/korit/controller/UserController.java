package com.korit.controller;

import com.korit.entity.User;
import com.korit.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
// @RequiredArgsConstructor final 절대 바뀌지 않을 때 사용
public class UserController {

    @Setter
    private static UserService userService;

    public void signIn() {

    }

    public void signup() {
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        userService.add(user);
    }

}
