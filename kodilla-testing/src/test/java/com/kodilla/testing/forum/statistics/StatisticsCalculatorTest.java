package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTest {

    @Mock
    private Statistics statisticsMock;
    private StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

    private static final List<String> users100 = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            users100.add("User" + i);
        }
    }

    @Test
    @DisplayName("Test calculateAdvStatistics when Posts are 0, Comments are 0, Users count is 0")
    public void testCalculateAdvStatisticsWhenAllDataReturnZero() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(List.of());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerPost());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerUser());
    }

    @Test
    @DisplayName("Test calculateAdvStatistics when Posts are 1000, Comments are 0, Users count is 100")
    public void testCalculateAdvStatisticsWhenUsersIs100AndPostCountIs1000() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(users100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        // should return 0 because class does not allow division by 0
        assertEquals(10, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerPost());
        assertEquals(0, statisticsCalculator.getAvgCommentsPerUser());
    }

    @Test
    @DisplayName("Test calculateAdvStatistics when Posts are 100, Comments are 200, Users count is 100")
    public void testCalculateAdvStatisticsWhenUsersIs100AndCommentsCountIsBiggerThanPostsCount() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(users100);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        // When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        // Then
        // should return 0 because class does not allow division by 0
        assertEquals(1, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(2.0, statisticsCalculator.getAvgCommentsPerPost());
        assertEquals(2.0, statisticsCalculator.getAvgCommentsPerUser());
    }

    @Test
    @DisplayName("Test calculateAdvStatistics when Posts are 300, Comments are 200, Users count is 100")
    public void testCalculateAdvStatisticsWhenUsersIs100AndCommentsCountIsSmallerThanPostsCount() {
        // Given
        when(statisticsMock.usersNames()).thenReturn(users100);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(200);
        // When

        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double delta = 0.1d;
        // Then
        // should return 0 because class does not allow division by 0
        assertEquals(3, statisticsCalculator.getAvgPostsPerUser());
        assertEquals(0.6, statisticsCalculator.getAvgCommentsPerPost(), delta);
        assertEquals(2.0, statisticsCalculator.getAvgCommentsPerUser(), delta);
    }


}