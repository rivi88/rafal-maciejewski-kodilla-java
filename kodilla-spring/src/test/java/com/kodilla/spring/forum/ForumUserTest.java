package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ForumUserTestSuite {

    @Autowired
    private ForumUser forumUser;

    @Test
    public void testGetUsername() {
        String username = forumUser.getUserName();
        assertEquals("John Smith", username);
    }

}