// Solution: Create a Report interface and separate implementations for each report type (PDFReport, HTMLReport).
// Adding new report types is now achieved by creating new classes without modifying existing ones.

package com.example.SolidPrincples.Solved.OCP;

public class ReportGeneratorApp {
    public static void main(String[] args) {
        Report pdfReport = new PDFReport();
        Report htmlReport = new HTMLReport();

        pdfReport.generate("Project status update");
        htmlReport.generate("Task completion summary");
    }
}
