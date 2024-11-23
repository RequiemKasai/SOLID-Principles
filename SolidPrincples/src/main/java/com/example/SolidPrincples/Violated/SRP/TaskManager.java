// Violation: The TaskManager class handles multiple responsibilities: adding tasks, assigning tasks, and generating reports.
// This violates SRP as one class should only have one responsibility.

package com.example.SolidPrincples.Violated.SRP;

public class TaskManager {
    public void manageTask(String task, String user) {
        System.out.println("Task added: " + task);
        System.out.println("Task assigned to: " + user);
        System.out.println("Generating report for task: " + task);
    }
}
