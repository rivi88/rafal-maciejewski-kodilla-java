package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @BeforeEach
    public void setUp() {
        TaskList taskList1 = new TaskList("List 1", "Description 1");
        TaskList taskList2 = new TaskList("List 2", "Description 2");

        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
    }

    @AfterEach
    public void tearDown() {
        taskListDao.deleteAll();
    }

    @Test
    @Transactional
    public void testFindByListName() {
        List<TaskList> foundLists = taskListDao.findByListName("List 1");

        assertEquals(1, foundLists.size());
        assertEquals("List 1", foundLists.get(0).getListName());
        assertEquals("Description 1", foundLists.get(0).getDescription());
    }
}
