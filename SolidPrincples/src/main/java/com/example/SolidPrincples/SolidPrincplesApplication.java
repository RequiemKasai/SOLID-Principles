package com.example.SolidPrincples;

import java.util.Scanner;

public class SolidPrincplesApplication {
	public static void main(String[] args) {
		System.out.println("Main application is running!");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a principle to test:");
		System.out.println("1. Single Responsibility Principle (SRP)");
		System.out.println("2. Open/Closed Principle (OCP)");
		System.out.println("3. Interface Segregation Principle (ISP)");
		System.out.print("Enter your choice (1/2/3): ");
		int principleChoice = scanner.nextInt();

		System.out.println("Choose implementation type:");
		System.out.println("1. Violated");
		System.out.println("2. Solved");
		System.out.print("Enter your choice (1/2): ");
		int implementationChoice = scanner.nextInt();

		if (principleChoice == 1) {
			if (implementationChoice == 1) {
				System.out.println("Running Violated SRP...");
				com.example.SolidPrincples.Violated.SRP.TaskManagerApp.main(args);
			} else {
				System.out.println("Running Solved SRP...");
				com.example.SolidPrincples.Solved.SRP.TaskManagerApp.main(args);
			}
		} else if (principleChoice == 2) {
			if (implementationChoice == 1) {
				System.out.println("Running Violated OCP...");
				com.example.SolidPrincples.Violated.OCP.ReportGeneratorApp.main(args);
			} else {
				System.out.println("Running Solved OCP...");
				com.example.SolidPrincples.Solved.OCP.ReportGeneratorApp.main(args);
			}
		} else if (principleChoice == 3) {
			if (implementationChoice == 1) {
				System.out.println("Running Violated ISP...");
				com.example.SolidPrincples.Violated.ISP.PrinterApp.main(args);
			} else {
				System.out.println("Running Solved ISP...");
				com.example.SolidPrincples.Solved.ISP.PrinterApp.main(args);
			}
		} else {
			System.out.println("Invalid choice!");
		}

		scanner.close();
	}
}
