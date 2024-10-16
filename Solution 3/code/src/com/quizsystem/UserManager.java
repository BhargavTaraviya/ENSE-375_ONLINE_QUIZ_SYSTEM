package com.quizsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }

    public boolean removeUser(String username) {
        return users.remove(username) != null;
    }
    
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());}
    
}
