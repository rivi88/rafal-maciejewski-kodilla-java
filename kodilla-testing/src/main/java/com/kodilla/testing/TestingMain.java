package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }


        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 7);
        checkThat(result1, 12);
        int result2 = calculator.subtract(5, 7);
        checkThat(result2, -2);


        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
    }

    private static void checkThat(int result, int expected) {
        if (result == expected) {
            System.out.println(result + " is ok");
        } else {
            System.out.println("Error");
        }
    }
}
