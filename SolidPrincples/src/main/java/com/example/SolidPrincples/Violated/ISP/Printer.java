//Violation: The Printer interface forces all implementations to include methods for printing, scanning, and faxing.
// This is problematic for SimplePrinter, which does not need scan() or fax().

package com.example.SolidPrincples.Violated.ISP;

public interface Printer {
    void print(String document);
    void scan(String document);
    void fax(String document);
}
