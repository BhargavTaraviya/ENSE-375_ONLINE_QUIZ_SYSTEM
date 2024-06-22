package com.quizsystem;

import java.util.ArrayList;
import java.util.List;
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

        List<Question> questions = new ArrayList<>();
        System.out.print("How many questions do you want to add? ");
        int questionCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < questionCount; i++) {
            System.out.print("Enter question: ");
            String questionText = scanner.nextLine();

            System.out.print("How many options do you want to add? ");
            int optionCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String[] options = new String[optionCount];

            for (int j = 0; j < optionCount; j++) {
                System.out.print("Enter option " + (j + 1) + ": ");
                options[j] = scanner.nextLine();
            }

            System.out.print("Enter the correct option index (0 to " + (optionCount - 1) + "): ");
            int correctAnswerIndex = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Question question = new Question(questionText, options, correctAnswerIndex);
            questions.add(question);
        }

        Quiz quiz = new Quiz(title, questions);
        quizManager.addQuiz(quiz);
        System.out.println("Quiz created successfully.");
    }
}