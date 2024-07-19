package com.quizsystem;

import java.util.List;

public class ViewQuizzes {
    private QuizManager quizManager;

    public ViewQuizzes(QuizManager quizManager) {
        this.quizManager = quizManager;
    }

    public void execute() {
        List<Quiz> quizzes = quizManager.getQuizzes();
        if (quizzes.isEmpty()) {
            System.out.println("No quizzes available.");
            return;
        }

        for (Quiz quiz : quizzes) {
            System.out.println("Quiz Title: " + quiz.getTitle());
            List<Question> questions = quiz.getQuestions();
            for (Question question : questions) {
                System.out.println("  Question: " + question.getQuestionText());
                String[] options = question.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println("    Option " + i + ": " + options[i]);
                }
                System.out.println("    Correct Answer Index: " + question.getCorrectAnswerIndex());
            }
        }
    }
}
