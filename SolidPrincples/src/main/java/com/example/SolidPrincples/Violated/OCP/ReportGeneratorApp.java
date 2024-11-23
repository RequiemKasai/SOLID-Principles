//Violation: The ReportGenerator class uses if-else conditions to handle different report types (e.g., PDF, HTML).
// Adding a new report type (e.g., JSON) requires modifying this class.

package com.example.SolidPrincples.Violated.OCP;

public class ReportGeneratorApp {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport("PDF", "Project status update");
        generator.generateReport("HTML", "Task completion summary");
    }
}
