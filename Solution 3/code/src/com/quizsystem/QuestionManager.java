package com.quizsystem;

import java.util.List;

public class QuestionManager {
    public void addQuestion(Quiz quiz, Question question) {
        quiz.getQuestions().add(question);
    }

    public void editQuestion(Quiz quiz, int questionIndex, Question newQuestion) {
        quiz.getQuestions().set(questionIndex, newQuestion);
    }

    public void deleteQuestion(Quiz quiz, int questionIndex) {
        quiz.getQuestions().remove(questionIndex);
    }
}
