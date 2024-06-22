package com.quizsystem;

import java.util.List;
import java.util.Scanner;

public class TakeQuiz {
    private QuizManager quizManager;
    private Scanner scanner;

    public TakeQuiz(QuizManager quizManager, Scanner scanner) {
        this.quizManager = quizManager;
        this.scanner = scanner;
    }

    public void execute() {
        List<Quiz> quizzes = quizManager.getQuizzes();
        if (quizzes.isEmpty()) {
            System.out.println("No quizzes available.");
            return;
        }

        System.out.println("Available Quizzes:");
        for (int i = 0; i < quizzes.size(); i++) {
            System.out.println((i + 1) + ". " + quizzes.get(i).getTitle());
        }

        System.out.print("Enter the number of the quiz to take: ");
        int quizNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quizNumber < 1 || quizNumber > quizzes.size()) {
            System.out.println("Invalid quiz number.");
            return;
        }

        Quiz quiz = quizzes.get(quizNumber - 1);
        int score = 0;
        List<Question> questions = quiz.getQuestions();
        for (Question question : questions) {
            System.out.println("Question: " + question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println("  " + i + ": " + options[i]);
            }

            System.out.print("Enter your answer: ");
            int answer = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (question.isCorrectAnswer(answer)) {
                score++;
            }
        }

        System.out.println("You scored " + score + " out of " + questions.size());
    }
}