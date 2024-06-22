package com.quizsystem;

import java.util.Scanner;

public class AddUser {
    private UserManager userManager;
    private Scanner scanner;

    public AddUser(UserManager userManager, Scanner scanner) {
        this.userManager = userManager;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();
        userManager.addUser(new User(username, password, false));
        System.out.println("User added successfully.");
    }
}