package com.tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import com.quizsystem.*;

public class DecisionTableTests {
    @Test
    public void testQuizCreation() {
        QuizManager quizManager = new QuizManager();
        assertDoesNotThrow(() -> quizManager.addQuiz(new Quiz("Valid Quiz", new ArrayList<>())));

        assertThrows(IllegalArgumentException.class, () -> quizManager.addQuiz(new Quiz("", new ArrayList<>())));

        assertThrows(IllegalArgumentException.class, () -> quizManager.addQuiz(new Quiz("Null Questions Quiz", null)));

        assertThrows(IllegalArgumentException.class, () -> quizManager.addQuiz(new Quiz("a".repeat(101), new ArrayList<>()))); // Assuming 100 is max length
    }
}
