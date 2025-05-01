// package com.taskmanager;

public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public Task(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }

    public String toFileString() {
        return description + "|" + isCompleted;
    }

    public static Task fromFileString(String line) {
        String[] parts = line.split("\\|");
        return new Task(parts[0], Boolean.parseBoolean(parts[1]));
    }
}
