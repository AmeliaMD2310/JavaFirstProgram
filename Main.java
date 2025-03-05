/*
Assignment 1 - Object Oriented Programming
Amelia MacDonald
W0467922
February 28, 2025
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>(); // List to store students
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            // Display menu options
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    addStudent(); // Call method to add a new student
                    break;
                case 2:
                    displayAllStudents(); // Call method to display all students
                    break;
                case 3:
                    searchStudentById(); // Call method to search for a student
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
    // Method to add a new student to the list
    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        double GPA = scanner.nextDouble();
        scanner.nextLine(); 
        
        students.add(new Student(name, age, address, major, GPA)); 
        System.out.println("Student added successfully!");
    }
    
    // Method to display all students
    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayDetails(); 
                System.out.println("----------------------");
            }
        }
    }
    
    // Method to search for a student by ID
    private static void searchStudentById() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                student.displayDetails(); 
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
