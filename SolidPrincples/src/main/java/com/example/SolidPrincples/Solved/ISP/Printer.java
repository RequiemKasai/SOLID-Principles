//Solution: Split the Printer interface into smaller interfaces (Printer, Scanner, Faxer).
// Each implementation only includes the methods it requires.

package com.example.SolidPrincples.Solved.ISP;

public interface Printer {
    void print(String document);
}
