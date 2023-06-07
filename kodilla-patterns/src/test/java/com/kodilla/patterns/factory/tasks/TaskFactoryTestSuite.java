package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaskFactoryTestSuite {

    @Test
    public void testCreateShoppingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task shoppingTask = factory.createTask(TaskType.SHOPPING, "Buy groceries", "Milk", "2");

        // then
        assertEquals("Buy groceries", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testCreatePaintingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task paintingTask = factory.createTask(TaskType.PAINTING, "Paint the room", "Blue", "Walls");

        // then
        assertEquals("Paint the room", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testCreateDrivingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task drivingTask = factory.createTask(TaskType.DRIVING, "Go to work", "Office", "Car");

        // then
        assertEquals("Go to work", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
    }
}
