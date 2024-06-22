package com.quizsystem;

import java.util.Scanner;

public class ShowAdminMenu {
    private QuizManager quizManager;
    private Authentication auth;
    private Scanner scanner;

    public ShowAdminMenu(QuizManager quizManager, Authentication auth, Scanner scanner) {
        this.quizManager = quizManager;
        this.auth = auth;
        this.scanner = scanner;
    }

    public void execute() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Create Quiz");
            System.out.println("2. Delete Quiz");
            System.out.println("3. View All Quizzes");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    new CreateQuiz(quizManager, scanner).execute();
                    break;
                case 2:
                    new DeleteQuiz(quizManager, scanner).execute();
                    break;
                case 3:
                    new ViewQuizzes(quizManager).execute();
                    break;
                case 4:
                    auth.logout();
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
