package com.yk1;

public class Validator {
    public static boolean valid(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPassException {

        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*") || !confirmPassword.equals(password)) {
            throw new WrongPassException();
        }

        return true;
    }
}
