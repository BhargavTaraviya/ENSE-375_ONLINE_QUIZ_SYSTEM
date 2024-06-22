package com.quizsystem;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
    private User currentUser;
    private List<User> users = new ArrayList<>();

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
