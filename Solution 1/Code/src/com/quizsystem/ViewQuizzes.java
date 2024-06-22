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
        }
    }
}
