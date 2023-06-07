package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User millenials = new Millenials("MillenialsUser");
        User yGeneration = new YGeneration("YGenerationUser");
        User zGeneration = new ZGeneration("ZGenerationUser");

        // When & Then
        assertEquals("Sharing on Facebook", millenials.sharePost());
        assertEquals("Sharing on Twitter", yGeneration.sharePost());
        assertEquals("Sharing on Snapchat", zGeneration.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User millenials = new Millenials("MillenialsUser");

        // When
        millenials.setSocialPublisher(new SnapchatPublisher());

        // Then
        assertEquals("Sharing on Snapchat", millenials.sharePost());
    }
}
