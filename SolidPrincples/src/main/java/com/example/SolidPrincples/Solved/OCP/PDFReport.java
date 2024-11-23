// Solution: Create a Report interface and separate implementations for each report type (PDFReport, HTMLReport).
// Adding new report types is now achieved by creating new classes without modifying existing ones.

package com.example.SolidPrincples.Solved.OCP;

public class PDFReport implements Report {
    public void generate(String content) {
        System.out.println("Generating PDF report: " + content);
    }
}
