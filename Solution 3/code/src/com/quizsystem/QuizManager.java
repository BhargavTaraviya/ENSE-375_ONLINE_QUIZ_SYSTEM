package com.quizsystem;

import java.util.ArrayList;
import java.util.List;

public class QuizManager {
    private List<Quiz> quizzes;

    public QuizManager() {
        this.quizzes = new ArrayList<>();
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public Quiz getQuizByTitle(String title) {
        for (Quiz quiz : quizzes) {
            if (quiz.getTitle().equals(title)) {
                return quiz;
            }
        }
        return null;
    }

    public void removeQuiz(Quiz quiz) {
        quizzes.remove(quiz);
    }

    public void clearQuizzes() {
        quizzes.clear();
    }

    public void updateQuiz(Quiz oldQuiz, Quiz newQuiz) {
        int index = quizzes.indexOf(oldQuiz);
        if (index != -1) {
            quizzes.set(index, newQuiz);
        }
    }
}
