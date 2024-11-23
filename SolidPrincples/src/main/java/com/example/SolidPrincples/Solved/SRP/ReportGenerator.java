//Solution: The responsibilities are divided into three classes: TaskManager (for task creation),
// AssignmentManager (for task assignment), and ReportGenerator (for report generation).

package com.example.SolidPrincples.Solved.SRP;

public class ReportGenerator {
    public void generateReport(String task) {
        System.out.println("Generating report for task: " + task);
    }
}
