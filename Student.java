/*
Assignment 1 - Object Oriented Programming
Amelia MacDonald
W0467922
February 28, 2025
*/

public class Student extends Person {
    private static int idCounter = 1000; 
    private String studentId;
    private String major;
    private double GPA;
    
    // Default constructor with default values
    public Student() {
        super("Unknown", 0, "Unknown");
        this.studentId = generateStudentId();
        this.major = "Undeclared";
        this.GPA = 0.0;
    }
    
    // Parameterized constructor to initialize student attributes
    public Student(String name, int age, String address, String major, double GPA) {
        super(name, age, address);
        this.studentId = generateStudentId();
        this.major = major;
        this.GPA = GPA;
    }
    
    // Static method to generate unique student IDs
    private static String generateStudentId() {
        return "S" + (idCounter++);
    }
    
    // Getter and Setter methods
    public String getStudentId() { return studentId; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    
    public double getGPA() { return GPA; }
    public void setGPA(double GPA) { this.GPA = GPA; }
    
    // Override displayDetails method to include student-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId + ", Major: " + major + ", GPA: " + GPA);
    }
}