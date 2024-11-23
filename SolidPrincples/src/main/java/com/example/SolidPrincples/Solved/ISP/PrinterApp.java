//Solution: Split the Printer interface into smaller interfaces (Printer, Scanner, Faxer).
// Each implementation only includes the methods it requires.

package com.example.SolidPrincples.Solved.ISP;

public class PrinterApp {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print("Document1.pdf");
    }
}
