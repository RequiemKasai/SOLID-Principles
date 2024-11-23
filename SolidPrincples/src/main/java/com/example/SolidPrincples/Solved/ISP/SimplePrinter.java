//Solution: Split the Printer interface into smaller interfaces (Printer, Scanner, Faxer).
// Each implementation only includes the methods it requires.

package com.example.SolidPrincples.Solved.ISP;

public class SimplePrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
