
package com.shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginServiceTest {

    @Test
    void testValidLogin() {

        LoginService service = new LoginService();

        String result = service.login("admin", "admin123");

        assertEquals("Login Successful", result);
    }

    @Test
    void testInvalidLogin() {

        LoginService service = new LoginService();

        String result = service.login("user", "wrong123");

        assertEquals("Invalid Credentials", result);
    }
}

