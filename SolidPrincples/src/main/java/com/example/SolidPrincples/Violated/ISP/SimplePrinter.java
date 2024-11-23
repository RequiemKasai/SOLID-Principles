//Violation: The Printer interface forces all implementations to include methods for printing, scanning, and faxing.
// This is problematic for SimplePrinter, which does not need scan() or fax().

package com.example.SolidPrincples.Violated.ISP;

public class SimplePrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    public void scan(String document) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax(String document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
