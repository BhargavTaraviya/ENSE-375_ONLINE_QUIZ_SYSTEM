package com.quizsystem;

import java.util.Scanner;

public class ShowUserMenu {
    private QuizManager quizManager;
    private Authentication auth;
    private Scanner scanner;

    public ShowUserMenu(QuizManager quizManager, Authentication auth, Scanner scanner) {
        this.quizManager = quizManager;
        this.auth = auth;
        this.scanner = scanner;
    }

    public void execute() {
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Take Quiz");
            System.out.println("2. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    new TakeQuiz(quizManager, scanner).execute();
                    break;
                case 2:
                    auth.logout();
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
