package com.tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.quizsystem.*;

public class BoundaryValueTests {
    @Test
    public void testUsernameBoundaryValues() {
        UserManager userManager = new UserManager();
        User user1 = new User("abc", "password", false);
        User user2 = new User("ab", "password", false);
        User user3 = new User("a".repeat(20), "password", false);
        User user4 = new User("a".repeat(21), "password", false);
        
        // Directly check the condition instead of returning boolean
        boolean result1 = false;
        try {
            userManager.addUser(user1);
            result1 = true;
        } catch (Exception e) {
            result1 = false;
        }

        boolean result2 = false;
        try {
            userManager.addUser(user2);
            result2 = true;
        } catch (Exception e) {
            result2 = false;
        }

        boolean result3 = false;
        try {
            userManager.addUser(user3);
            result3 = true;
        } catch (Exception e) {
            result3 = false;
        }

        boolean result4 = false;
        try {
            userManager.addUser(user4);
            result4 = true;
        } catch (Exception e) {
            result4 = false;
        }
        
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
        assertFalse(result4);
    }

    @Test
    public void testPasswordBoundaryValues() {
        UserManager userManager = new UserManager();
        User user1 = new User("user1", "abcdef", false);
        User user2 = new User("user2", "abcde", false);
        User user3 = new User("user3", "a".repeat(30), false);
        User user4 = new User("user4", "a".repeat(31), false);
        
        // Directly check the condition instead of returning boolean
        boolean result1 = false;
        try {
            userManager.addUser(user1);
            result1 = true;
        } catch (Exception e) {
            result1 = false;
        }

        boolean result2 = false;
        try {
            userManager.addUser(user2);
            result2 = true;
        } catch (Exception e) {
            result2 = false;
        }

        boolean result3 = false;
        try {
            userManager.addUser(user3);
            result3 = true;
        } catch (Exception e) {
            result3 = false;
        }

        boolean result4 = false;
        try {
            userManager.addUser(user4);
            result4 = true;
        } catch (Exception e) {
            result4 = false;
        }
        
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
        assertFalse(result4);
    }
}
