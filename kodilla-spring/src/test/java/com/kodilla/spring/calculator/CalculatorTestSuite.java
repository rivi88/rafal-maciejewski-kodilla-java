package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        Calculator calculator = new Calculator(new Display());

        calculator.add(2.5, 3.5);
        Assertions.assertEquals(6.0, calculator.add(2.5, 3.5));

        calculator.sub(5, 2);
        Assertions.assertEquals(3.0, calculator.sub(5, 2));

        calculator.mul(4.5, 2);
        Assertions.assertEquals(9.0, calculator.mul(4.5, 2));

        calculator.div(10, 4);
        Assertions.assertEquals(2.5, calculator.div(10, 4));
    }
}
