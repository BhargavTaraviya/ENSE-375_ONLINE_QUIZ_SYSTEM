package com.tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.quizsystem.*;

public class StateTransitionTests {
    @Test
    public void testLoginLogout() {
        UserManager userManager = new UserManager();
        Authentication authentication = new Authentication();
        userManager.addUser(new User("user", "pass", false));

        assertTrue(authentication.login("user", "pass", userManager));
        assertNotNull(authentication.getCurrentUser());

        authentication.logout();
        assertNull(authentication.getCurrentUser());
    }
}
