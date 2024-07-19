package com.quizsystem;

import java.util.Scanner;

public class HandleLogin {
    private Authentication auth;
    private UserManager userManager;
    private Scanner scanner;

    public HandleLogin(Authentication auth, UserManager userManager, Scanner scanner) {
        this.auth = auth;
        this.userManager = userManager;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (auth.login(username, password, userManager)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
