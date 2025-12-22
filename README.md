# Manual Testing QA Mini Project - Bug Tracking System

Java
Testing
Repository: https://github.com/FathiHeelo/Manual_Testing_QA_mini_project.git
Project Overview
This repository contains my practical implementation of a simple Bug Tracking and Issue Management System developed as a mini project for a Manual Testing and Quality Assurance course.
The application simulates a real-world bug tracking tool where users can create, view, update, assign, and track software defects/issues. It serves as a hands-on platform to practice manual testing techniques, including test case design, exploratory testing, bug reporting, severity/priority assessment, and test documentation.
I designed the system with common features found in tools like Jira or Bugzilla, but kept it lightweight to focus on effective manual QA practices rather than automation.
Key Features

Issue Creation: Add new bugs with title, description, steps to reproduce, severity, priority, assignee, and status
Issue Management: View all issues, search/filter by status/severity/assignee, update status (New → In Progress → Resolved → Closed)
User Roles Simulation: Basic support for Tester, Developer, and Manager perspectives
Reporting: List issues by status, generate simple summary reports
Data Persistence: Issues saved to a file (JSON or text) for persistence between runs
Validation: Input checks and error handling for better testability

Technologies Used

Language: Java 17+
Framework: Console-based application (Swing GUI optional if implemented)
Data Handling: File I/O for persistence (e.g., JSON via Gson or simple text serialization)
Design: Object-oriented structure with clear separation (Issue, User, Tracker classes)

Manual Testing Artifacts Included
This project was used to practice and demonstrate core manual testing skills:

Test Case Design Documents (in /docs or Markdown):
Functional test cases (positive/negative)
Boundary value analysis
Equivalence partitioning
Exploratory testing notes

Bug Reports:
Detailed defect reports with steps to reproduce, actual vs expected results, screenshots (if GUI), environment details
Severity and priority classification

Test Execution Evidence:
Test logs and results
Traceability matrix (linking requirements to test cases)

Summary Report:
Test coverage overview
Defect trends and recommendations



How to Run
Bashgit clone https://github.com/FathiHeelo/Manual_Testing_QA_mini_project.git
cd Manual_Testing_QA_mini_project

Compile and run the main class (e.g., BugTrackerApp.java)
Interact via console menu to create/view/update issues
Use the system to practice manual testing workflows

What I Learned

Writing clear, reusable, and comprehensive manual test cases
Effective bug reporting with reproducible steps and proper classification
Applying testing techniques: equivalence partitioning, boundary analysis, state transition testing
Importance of traceability between requirements, test cases, and defects
How manual testing complements automated testing in real projects
Professional documentation and communication in QA processes

Possible Enhancements (Ideas)

Add a simple Swing or JavaFX GUI for better usability
Implement user authentication
Export reports to PDF/Excel
Add comments and attachments to issues
Integration with automated tests (as a future step)

Developed & Tested by: Fathi Heelo 🚀
Course Context: Manual Testing in Software Quality Assurance
License: MIT - Feel free to use for learning or testing practice!
