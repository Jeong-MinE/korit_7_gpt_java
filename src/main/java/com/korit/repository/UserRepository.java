package com.korit.repository;

import com.korit.entity.User;

import java.util.ArrayList;
import java.util.List;

// final - 초기화가 무조건 한 번 필요
public class UserRepository {
    private static UserRepository instance;
    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<>();
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
        }

        public void addUser(User user) {
            userList.add(user);
        }

}
