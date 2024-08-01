package com.tests.unit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.quizsystem.*;

import java.util.ArrayList;
import java.util.List;

public class UnitTests {
    @Test
    public void testUserClass() {
        User user = new User("username", "password", true);
        assertEquals("username", user.getUsername());
        assertEquals("password", user.getPassword());
        assertTrue(user.isAdmin());
    }

    @Test
    public void testUserManager() {
        UserManager userManager = new UserManager();
        User user = new User("newUser", "newPass123", false);
        userManager.addUser(user);
        assertEquals(user, userManager.getUserByUsername("newUser"));
        assertTrue(userManager.removeUser("newUser"));
        assertNull(userManager.getUserByUsername("newUser"));
    }

    @Test
    public void testAuthentication() {
        Authentication authentication = new Authentication();
        UserManager userManager = new UserManager();
        userManager.addUser(new User("admin", "adminPass", true)); // Ensure the user exists
        assertTrue(authentication.login("admin", "adminPass", userManager));
        assertNotNull(authentication.getCurrentUser());
        authentication.logout();
        assertNull(authentication.getCurrentUser());
    }

    @Test
    public void testQuestionClass() {
        String[] options = {"Option1", "Option2", "Option3"};
        Question question = new Question("What is 2+2?", options, 0);
        assertEquals("What is 2+2?", question.getQuestionText());
        assertArrayEquals(options, question.getOptions());
        assertEquals(0, question.getCorrectAnswerIndex());
        assertTrue(question.isCorrectAnswer(0));
        assertFalse(question.isCorrectAnswer(1));
    }

    @Test
    public void testQuizClass() {
        List<Question> questions = new ArrayList<>();
        Question question = new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, 0);
        questions.add(question);
        Quiz quiz = new Quiz("Geography Quiz", questions);
        assertEquals("Geography Quiz", quiz.getTitle());
        assertEquals(1, quiz.getQuestions().size());
        quiz.setTitle("Advanced Geography Quiz");
        assertEquals("Advanced Geography Quiz", quiz.getTitle());
    }

    @Test
    public void testQuestionManager() {
        QuizManager quizManager = new QuizManager();
        QuestionManager questionManager = new QuestionManager();
        Quiz quiz = new Quiz("Geography Quiz", new ArrayList<>());
        quizManager.addQuiz(quiz);
        Question newQuestion = new Question("What is the capital of Italy?", new String[]{"Rome", "Milan", "Venice"}, 0);
        questionManager.addQuestion(quiz, newQuestion);
        assertEquals(1, quiz.getQuestions().size());
        Question editedQuestion = new Question("What is the capital of Spain?", new String[]{"Madrid", "Barcelona", "Seville"}, 0);
        questionManager.editQuestion(quiz, 0, editedQuestion);
        assertEquals("What is the capital of Spain?", quiz.getQuestions().get(0).getQuestionText());
        questionManager.deleteQuestion(quiz, 0);
        assertEquals(0, quiz.getQuestions().size());
    }
}
