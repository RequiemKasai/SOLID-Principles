//Violation: The Printer interface forces all implementations to include methods for printing, scanning, and faxing.
// This is problematic for SimplePrinter, which does not need scan() or fax().

package com.example.SolidPrincples.Violated.ISP;

public class PrinterApp {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print("Document1.pdf");
        printer.scan("Document1.pdf"); // Throws exception
    }
}
