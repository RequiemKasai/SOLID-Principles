//Solution: The responsibilities are divided into three classes: TaskManager (for task creation),
// AssignmentManager (for task assignment), and ReportGenerator (for report generation).

package com.example.SolidPrincples.Solved.SRP;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        AssignmentManager assignmentManager = new AssignmentManager();
        ReportGenerator reportGenerator = new ReportGenerator();

        String task = "Complete project report";
        String user = "John Doe";

        taskManager.addTask(task);
        assignmentManager.assignTask(task, user);
        reportGenerator.generateReport(task);
    }
}
