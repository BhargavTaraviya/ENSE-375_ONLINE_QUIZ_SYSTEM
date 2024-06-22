package com.quizsystem;

import java.util.Scanner;

public class CreateQuiz {
    private QuizManager quizManager;
    private Scanner scanner;

    public CreateQuiz(QuizManager quizManager, Scanner scanner) {
        this.quizManager = quizManager;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter quiz title: ");
        String title = scanner.nextLine();
        Quiz quiz = new Quiz(title);
        quizManager.addQuiz(quiz);
        System.out.println("Quiz created successfully.");
    }
}
