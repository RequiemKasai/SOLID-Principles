// Violation: The TaskManager class handles multiple responsibilities: adding tasks, assigning tasks, and generating reports.
// This violates SRP as one class should only have one responsibility.

package com.example.SolidPrincples.Violated.SRP;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.manageTask("Complete project report", "John Doe");
    }
}
