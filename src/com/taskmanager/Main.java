// package com.taskmanager;

import java.util.Scanner;

public class Main {
    @Override
    public String toString() {
        return "Main []";
    }

    public static void main(final String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Task Manager");

        while (true) {
            System.out.println("\nOptions: add | list | done | delete | exit");
            System.out.print("Enter command: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "add":
                    System.out.print("Enter task description: ");
                    final String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case "list":
                    manager.listTasks();
                    break;
                case "done":
                    System.out.print("Enter task number to mark as done: ");
                    final int doneIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.markTaskCompleted(doneIndex);
                    break;
                case "delete":
                    System.out.print("Enter task number to delete: ");
                    final int delIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.deleteTask(delIndex);
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
