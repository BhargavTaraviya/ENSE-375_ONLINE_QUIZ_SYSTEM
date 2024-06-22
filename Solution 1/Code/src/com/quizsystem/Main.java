package com.quizsystem;

import java.util.Scanner;

public class Main {
    private static QuizManager quizManager = new QuizManager();
    private static Authentication auth = new Authentication();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        auth.addUser(new User("admin", "admin", true)); // Add default admin user

        while (true) {
            System.out.println("Quiz System Menu:");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    new HandleLogin(auth, scanner).execute();
                    if (auth.getCurrentUser() != null) {
                        new ShowAdminMenu(quizManager, auth, scanner).execute();
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
