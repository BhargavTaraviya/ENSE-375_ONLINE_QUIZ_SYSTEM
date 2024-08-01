package com.tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.quizsystem.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseCaseTests {
    @Test
    public void testCompleteQuizWorkflow() {
        UserManager userManager = new UserManager();
        QuizManager quizManager = new QuizManager();
        Authentication authentication = new Authentication();

        userManager.addUser(new User("user", "pass", false));
        authentication.login("user", "pass", userManager);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is 2+2?", new String[]{"4", "3", "2", "1"}, 0));
        Quiz quiz = new Quiz("Math Quiz", questions);
        quizManager.addQuiz(quiz);

        String input = "1\n0\n"; // First quiz, correct answer
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        TakeQuiz takeQuiz = new TakeQuiz(quizManager, scanner);
        takeQuiz.execute();

        // Additional checks can be added based on TakeQuiz.execute() behavior
    }
}
