package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTest {

    private final SecondChallenge secondChallenge = new SecondChallenge();

    @Test
    public void testProbablyIWillThrowExceptionWithValidArguments() throws Exception {
        // given
        double x = 1.5;
        double y = 1.0;

        // when
        String expected = "Done!";
        String actual = secondChallenge.probablyIWillThrowException(x, y);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testProbablyIWillThrowExceptionWithInvalidXArgument() {
        // given
        double x = 2.1;
        double y = 1.0;

        // when
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(x, y);
        });
    }

    @Test
    public void testProbablyIWillThrowExceptionWithInvalidYArgument() {
        // given
        double x = 1.0;
        double y = 1.5;

        // when
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(x, y);
        });
    }

    @Test
    public void testProbablyIWillThrowExceptionWithInvalidBothArguments() {
        // given
        double x = 2.0;
        double y = 1.5;

        // when
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(x, y);
        });
    }
}