package com.korit.main;

import com.korit.controller.UserController;
import com.korit.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl userService2 = new UserServiceImpl();
        UserController userController = new UserController();
        userController.signup();
        userController.signIn();
        UserController.setUserService(userService);
    }
}
