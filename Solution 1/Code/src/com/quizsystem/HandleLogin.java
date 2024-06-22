package com.quizsystem;

import java.util.Scanner;

public class HandleLogin {
    private Authentication auth;
    private Scanner scanner;

    public HandleLogin(Authentication auth, Scanner scanner) {
        this.auth = auth;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (auth.login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
