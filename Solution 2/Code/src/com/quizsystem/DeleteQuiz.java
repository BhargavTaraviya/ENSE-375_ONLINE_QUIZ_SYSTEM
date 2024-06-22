package com.quizsystem;

import java.util.Scanner;

public class DeleteQuiz {
    private QuizManager quizManager;
    private Scanner scanner;

    public DeleteQuiz(QuizManager quizManager, Scanner scanner) {
        this.quizManager = quizManager;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter the title of the quiz to delete: ");
        String title = scanner.nextLine();
        Quiz quiz = quizManager.getQuizByTitle(title);

        if (quiz == null) {
            System.out.println("Quiz not found.");
            return;
        }

        quizManager.removeQuiz(quiz);
        System.out.println("Quiz deleted successfully.");
    }
}
