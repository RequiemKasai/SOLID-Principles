//Solution: The responsibilities are divided into three classes: TaskManager (for task creation),
// AssignmentManager (for task assignment), and ReportGenerator (for report generation).

package com.example.SolidPrincples.Solved.SRP;

public class TaskManager {
    public void addTask(String task) {
        System.out.println("Task added: " + task);
    }
}
