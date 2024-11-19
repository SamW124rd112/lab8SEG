package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 10) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            else if (Character.isLowerCase(c)) hasLowerCase = true;
            else if (Character.isDigit(c)) hasNumber = true;

            // If all conditions are met, the password is valid
            if (hasUpperCase && hasLowerCase && hasNumber) return true;
        }

        // If we've gone through all characters and haven't returned true,
        // it means at least one condition is not met
        return false;
    }
}
