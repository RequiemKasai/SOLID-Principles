//Solution: The responsibilities are divided into three classes: TaskManager (for task creation),
// AssignmentManager (for task assignment), and ReportGenerator (for report generation).

package com.example.SolidPrincples.Solved.SRP;

public class AssignmentManager {
    public void assignTask(String task, String user) {
        System.out.println("Task assigned to: " + user);
    }
}
