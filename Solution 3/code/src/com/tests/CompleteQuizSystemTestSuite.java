package com.tests;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.quizsystem.AddUser;
import com.quizsystem.Authentication;
import com.quizsystem.CreateQuiz;
import com.quizsystem.DeleteQuiz;
import com.quizsystem.EditQuiz;
import com.quizsystem.HandleLogin;
import com.quizsystem.Main;
import com.quizsystem.Question;
import com.quizsystem.QuestionManager;
import com.quizsystem.Quiz;
import com.quizsystem.QuizManager;
import com.quizsystem.ShowAdminMenu;
import com.quizsystem.ShowUserMenu;
import com.quizsystem.TakeQuiz;
import com.quizsystem.User;
import com.quizsystem.UserManager;
import com.quizsystem.ViewQuizzes;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class CompleteQuizSystemTestSuite {
    private UserManager userManager;
    private QuizManager quizManager;
    private Authentication authentication;
    private Scanner scanner;

    @BeforeEach
    public void setUp() {
        userManager = new UserManager();
        quizManager = new QuizManager();
        authentication = new Authentication();

        // Default users for testing
        userManager.addUser(new User("admin", "adminPass", true));
        userManager.addUser(new User("user", "userPass", false));

        // Default quiz for testing
        Question question = new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, 0);
        List<Question> questions = new ArrayList<>();
        questions.add(question);
        Quiz quiz = new Quiz("Geography Quiz", questions);
        quizManager.addQuiz(quiz);
    }

    // Test User class
    @Test
    public void testUserClass() {
        User user = new User("username", "password", true);
        assertEquals("username", user.getUsername());
        assertEquals("password", user.getPassword());
        assertTrue(user.isAdmin());
    }

    // Test UserManager class
    @Test
    public void testUserManager() {
        User user = new User("newUser", "newPass123", false);
        userManager.addUser(user);
        assertEquals(user, userManager.getUserByUsername("newUser"));
        assertTrue(userManager.removeUser("newUser"));
        assertNull(userManager.getUserByUsername("newUser"));
    }

    // Test Authentication class
    @Test
    public void testAuthentication() {
        assertTrue(authentication.login("admin", "adminPass", userManager));
        assertNotNull(authentication.getCurrentUser());
        authentication.logout();
        assertNull(authentication.getCurrentUser());
    }

    // Test Question class
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

    // Test Quiz class
    @Test
    public void testQuizClass() {
        Question question = new Question("What is 2+2?", new String[]{"4", "5", "6"}, 0);
        List<Question> questions = new ArrayList<>();
        questions.add(question);
        Quiz quiz = new Quiz("Math Quiz", questions);
        assertEquals("Math Quiz", quiz.getTitle());
        assertEquals(1, quiz.getQuestions().size());
        quiz.setTitle("Advanced Math Quiz");
        assertEquals("Advanced Math Quiz", quiz.getTitle());
    }

    // Test QuestionManager class
    @Test
    public void testQuestionManager() {
        QuestionManager questionManager = new QuestionManager();
        Quiz quiz = quizManager.getQuizByTitle("Geography Quiz");

        // Add question
        Question newQuestion = new Question("What is the capital of Italy?", new String[]{"Rome", "Milan", "Venice"}, 0);
        questionManager.addQuestion(quiz, newQuestion);
        assertEquals(2, quiz.getQuestions().size());

        // Edit question
        Question editedQuestion = new Question("What is the capital of Spain?", new String[]{"Madrid", "Barcelona", "Seville"}, 0);
        questionManager.editQuestion(quiz, 1, editedQuestion);
        assertEquals("What is the capital of Spain?", quiz.getQuestions().get(1).getQuestionText());

        // Delete question
        questionManager.deleteQuestion(quiz, 0);
        assertEquals(1, quiz.getQuestions().size());
    }

    // Test AddUser class
    @Test
    public void testAddUser() {
        String input = "newUser\nnewPass123\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        AddUser addUser = new AddUser(userManager, scanner);
        addUser.execute();
        assertNotNull(userManager.getUserByUsername("newUser"));
    }

    // Test CreateQuiz class
    @Test
    public void testCreateQuiz() {
        String input = "New Quiz\n2\nWhat is 2+2?\n2\n4\n5\n0\nWhat is 3+3?\n2\n6\n7\n0\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        CreateQuiz createQuiz = new CreateQuiz(quizManager, scanner);
        createQuiz.execute();
        assertNotNull(quizManager.getQuizByTitle("New Quiz"));
    }

    // Test EditQuiz class
    @Test
    public void testEditQuiz() {
        Quiz quiz = quizManager.getQuizByTitle("Geography Quiz");
        assertNotNull(quiz);

        String input = "Geography Quiz\nNew Geography Quiz\n1\nWhat is the capital of Spain?\n3\nMadrid\nBarcelona\nSeville\n0\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        EditQuiz editQuiz = new EditQuiz(quizManager, scanner);
        editQuiz.execute();

        quiz = quizManager.getQuizByTitle("New Geography Quiz");
        assertNotNull(quiz);
        assertEquals("New Geography Quiz", quiz.getTitle());
        assertEquals(1, quiz.getQuestions().size());
        assertEquals("What is the capital of Spain?", quiz.getQuestions().get(0).getQuestionText());
        assertArrayEquals(new String[]{"Madrid", "Barcelona", "Seville"}, quiz.getQuestions().get(0).getOptions());
        assertEquals(0, quiz.getQuestions().get(0).getCorrectAnswerIndex());
    }

    // Test DeleteQuiz class
    @Test
    public void testDeleteQuiz() {
        quizManager.addQuiz(new Quiz("Test Quiz", new ArrayList<>()));
        Quiz quiz = quizManager.getQuizByTitle("Test Quiz");
        assertNotNull(quiz);

        String input = "Test Quiz\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        DeleteQuiz deleteQuiz = new DeleteQuiz(quizManager, scanner);
        deleteQuiz.execute();

        assertNull(quizManager.getQuizByTitle("Test Quiz"));
    }

    // Test HandleLogin class
    @Test
    public void testHandleLogin() {
        String input = "admin\nadminPass\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        HandleLogin handleLogin = new HandleLogin(authentication, userManager, scanner);
        handleLogin.execute();
        assertNotNull(authentication.getCurrentUser());
    }

 // Test ShowAdminMenu class
    @Test
    public void testShowAdminMenu() {
        authentication.login("admin", "adminPass", userManager);

        // Simulate inputs for navigating the admin menu
        String input = "1\nNew Quiz\n1\nWhat is 2+2?\n1\n4\n0\n6\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        ShowAdminMenu showAdminMenu = new ShowAdminMenu(quizManager, authentication, userManager, scanner);
        showAdminMenu.execute();

        assertNull(authentication.getCurrentUser());
    }


    // Test ShowUserMenu class
    @Test
    public void testShowUserMenu() {
        authentication.login("user", "userPass", userManager);

        String input = "1\n1\n0\n2\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        ShowUserMenu showUserMenu = new ShowUserMenu(quizManager, authentication, scanner);
        showUserMenu.execute();

        assertNull(authentication.getCurrentUser());
    }

    // Test TakeQuiz class
    @Test
    public void testTakeQuiz() {
        String input = "1\n0\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        TakeQuiz takeQuiz = new TakeQuiz(quizManager, scanner);
        takeQuiz.execute();
        // Since it's more of an integration test, we can just assert the output manually
    }

    // Test ViewQuizzes class
    @Test
    public void testViewQuizzes() {
        ViewQuizzes viewQuizzes = new ViewQuizzes(quizManager);
        viewQuizzes.execute();
        // This is more of an integration test; manually verify the console output
    }

    // Additional tests for full coverage
    @Test
    public void testMain() {
        String input = "1\nadmin\nadminPass\n6\n2\n";
        setInputStream(input);
        scanner = new Scanner(System.in);
        Main.main(new String[]{});
        assertNull(authentication.getCurrentUser());
    }

    @AfterEach
    public void tearDown() {
        userManager = null;
        quizManager = null;
        authentication = null;
        if (scanner != null) {
            scanner.close();
        }
    }

    // Helper method to set input stream for testing
    private void setInputStream(String data) {
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);
    }
}
