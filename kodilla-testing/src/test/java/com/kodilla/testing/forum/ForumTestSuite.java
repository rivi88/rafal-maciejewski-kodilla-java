package com.kodilla.testing.forum;                             // [1]

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ForumTestSuite {                                         // [5]

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )
    @Test
        // [6]
    void testCaseUsername() {                                   // [7]
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");  // [8]

        //When
        String result = simpleUser.getUserName();                // [9]

        String expectedResult = "theForumUser";                  // [10]

        //Then
        Assertions.assertEquals(expectedResult, result);         // [11]
    }
}