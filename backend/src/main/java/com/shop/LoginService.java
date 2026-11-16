package com.shop;

public class LoginService {

    public String login(String username, String password) {

        if (username.equals("admin") &&
            password.equals("admin123")) {

            return "Login Successful";
        }

        return "Invalid Credentials";
    }

    public static void main(String[] args) {

        LoginService service = new LoginService();

        System.out.println(
            service.login("admin", "admin123")
        );
    }
}
