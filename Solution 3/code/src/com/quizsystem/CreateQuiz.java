package com.quizsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateQuiz {
    private QuizManager quizManager;
    private Scanner scanner;
    private static final int MAX_OPTIONS = 4;
    private static final int MAX_QUESTIONS = 20; // Maximum number of questions per quiz

    public CreateQuiz(QuizManager quizManager, Scanner scanner) {
        this.quizManager = quizManager;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter quiz title: ");
        String title = scanner.nextLine();

        List<Question> questions = new ArrayList<>();
        int questionCount = 0;
        while (questionCount < 1 || questionCount > MAX_QUESTIONS) {
            System.out.print("How many questions do you want to add? (1 to " + MAX_QUESTIONS + "): ");
            questionCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (questionCount < 1 || questionCount > MAX_QUESTIONS) {
                System.out.println("Please enter a valid number of questions (1 to " + MAX_QUESTIONS + ").");
            }
        }

        for (int i = 0; i < questionCount; i++) {
            System.out.print("Enter question: ");
            String questionText = scanner.nextLine();

            int optionCount = 0;
            while (optionCount < 1 || optionCount > MAX_OPTIONS) {
                System.out.print("How many options do you want to add? (1 to " + MAX_OPTIONS + "): ");
                optionCount = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (optionCount < 1 || optionCount > MAX_OPTIONS) {
                    System.out.println("Please enter a valid number of options (1 to " + MAX_OPTIONS + ").");
                }
            }

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
