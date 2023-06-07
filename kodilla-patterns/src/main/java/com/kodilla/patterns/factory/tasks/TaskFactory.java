package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static Task createTask(TaskType type, String taskName, String... parameters) {
        switch (type) {
            case SHOPPING:
                return new ShoppingTask(taskName, parameters[0], Double.parseDouble(parameters[1]));
            case PAINTING:
                return new PaintingTask(taskName, parameters[0], parameters[1]);
            case DRIVING:
                return new DrivingTask(taskName, parameters[0], parameters[1]);
            default:
                throw new IllegalArgumentException("Unknown task type: " + type);
        }
    }
}
