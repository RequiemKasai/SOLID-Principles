//Violation: The ReportGenerator class uses if-else conditions to handle different report types (e.g., PDF, HTML).
// Adding a new report type (e.g., JSON) requires modifying this class.

package com.example.SolidPrincples.Violated.OCP;

public class ReportGenerator {
    public void generateReport(String type, String content) {
        if (type.equals("PDF")) {
            System.out.println("Generating PDF report: " + content);
        } else if (type.equals("HTML")) {
            System.out.println("Generating HTML report: " + content);
        } else {
            System.out.println("Unknown report type: " + type);
        }
    }
}
