CPRO2221 Assignment 2: SOLID Principles

Overview:

This project demonstrates violations and solutions for three SOLID principles:

Single Responsibility Principle (SRP)

Open/Closed Principle (OCP)

Interface Segregation Principle (ISP)

The project includes examples of how these principles are violated and their refactored solutions, 
showcasing the importance of following SOLID principles in software design.

Folder Structure

Violated/: Contains examples of code violating the principles.

Solved/: Contains refactored code adhering to the principles.

Each folder is divided into subdirectories for:

SRP/ (Single Responsibility Principle)
OCP/ (Open/Closed Principle)
ISP/ (Interface Segregation Principle)

Use Case:

Single Responsibility Principle (SRP)

What It Stands For:
A class should have only one responsibility and one reason to change, ensuring cohesion and simplicity.

Violated:

The TaskManager class performs multiple unrelated tasks:

Adding tasks.
Assigning tasks to users.
Generating reports.

This violates SRP as one class should not handle unrelated responsibilities.

Fix in Solved:
The responsibilities are separated into three distinct classes:

TaskManager: Handles task creation.

AssignmentManager: Handles task assignments.

ReportGenerator: Handles report generation.


Open/Closed Principle (OCP)
What It Stands For:
Software entities should be open for extension but closed for modification. New features should be added without changing existing code.

Reason Violated:

The ReportGenerator class uses if-else conditions to generate reports for different formats (e.g., PDF, HTML).
Adding a new format requires modifying the existing ReportGenerator class, which violates OCP.

Fix in Solved:

Introduced a Report interface with specific implementations:

PDFReport: Handles PDF format.

HTMLReport: Handles HTML format.

New formats (e.g., JSONReport) can be added by creating new classes that implement the Report interface, without modifying existing code.


Interface Segregation Principle (ISP)

What It Stands For:
Classes should only depend on methods they actually use. Large interfaces should be split into smaller, focused ones.

Reason Violated:
The Printer interface includes unrelated methods:

print()
scan()
fax()
The SimplePrinter class, which only requires printing, is forced to implement unused methods like scan() and fax(), violating ISP.

Fix in Solved:

Split the Printer interface into smaller interfaces:

Printer: For printing functionality.

Scanner: For scanning functionality.

Faxer: For faxing functionality.

The SimplePrinter class implements only the Printer interface, adhering to ISP.


Conclusion
This project illustrates the importance of adhering to SOLID principles in software development:

SRP ensures that each class has a single responsibility, improving cohesion.

OCP allows the addition of new features without modifying existing code.

ISP ensures that classes only depend on methods they use, promoting modularity.

By applying SOLID principles, the project highlights how software can be made more:

Maintainable

Scalable

Flexible

Adhering to SOLID principles creates a foundation for developing robust and high-quality software systems.