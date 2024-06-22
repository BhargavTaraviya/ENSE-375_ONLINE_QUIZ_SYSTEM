package com.quizsystem;

public class Authentication {
    private User currentUser;

    public boolean login(String username, String password, UserManager userManager) {
        User user = userManager.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}