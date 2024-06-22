package com.quizsystem;

import java.util.Scanner;

public class ShowAdminMenu {
    private QuizManager quizManager;
    private Authentication auth;
    private UserManager userManager;
    private Scanner scanner;

    public ShowAdminMenu(QuizManager quizManager, Authentication auth, UserManager userManager, Scanner scanner) {
        this.quizManager = quizManager;
        this.auth = auth;
        this.userManager = userManager;
        this.scanner = scanner;
    }

    public void execute() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Create Quiz");
            System.out.println("2. Edit Quiz");
            System.out.println("3. Delete Quiz");
            System.out.println("4. View All Quizzes");
            System.out.println("5. Add User");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    new CreateQuiz(quizManager, scanner).execute();
                    break;
                case 2:
                    new EditQuiz(quizManager, scanner).execute();
                    break;
                case 3:
                    new DeleteQuiz(quizManager, scanner).execute();
                    break;
                case 4:
                    new ViewQuizzes(quizManager).execute();
                    break;
                case 5:
                    new AddUser(userManager, scanner).execute();
                    break;
                case 6:
                    auth.logout();
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
