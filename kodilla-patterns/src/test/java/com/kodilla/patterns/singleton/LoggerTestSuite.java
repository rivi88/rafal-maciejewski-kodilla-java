package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        // Given
        String logMessage = "Sample log message";
        Logger logger = Logger.getInstance();

        // When
        logger.log(logMessage);
        String lastLog = logger.getLastLog();

        // Then
        Assertions.assertEquals(logMessage, lastLog);
    }
}
