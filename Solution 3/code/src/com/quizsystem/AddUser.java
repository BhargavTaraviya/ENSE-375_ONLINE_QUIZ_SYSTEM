package com.quizsystem;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddUser {
    private UserManager userManager;
    private Scanner scanner;
    private static final int MAX_LENGTH = 15;
    private static final int MIN_PASSWORD_LENGTH = 6;
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[^a-zA-Z0-9]");

    public AddUser(UserManager userManager, Scanner scanner) {
        this.userManager = userManager;
        this.scanner = scanner;
    }

    public void execute() {
        String username;
        while (true) {
            System.out.print("Enter new username: ");
            username = scanner.nextLine();

            if (username.length() > MAX_LENGTH) {
                System.out.println("Username cannot be longer than 15 characters.");
                continue;
            }

            if (SPECIAL_CHAR_PATTERN.matcher(username).find()) {
                System.out.println("Username cannot contain special characters.");
                continue;
            }

            // Check if a user with the given username already exists
            if (userManager.getUserByUsername(username) != null) {
                System.out.println("A user with this username already exists.");
                continue;
            }
            break;
        }
        
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        if (password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Password must be at least 6 characters long.");
            return;
        }

        if (password.length() > MAX_LENGTH) {
            System.out.println("Password cannot be longer than 15 characters.");
            return;
        }

        userManager.addUser(new User(username, password, false));
        System.out.println("User added successfully.");
    }
}
