/*
Assignment 1 - Object Oriented Programming
Amelia MacDonald
W0467922
February 28, 2025
*/

public class Person {
    private String name;
    private int age;
    private String address;
    
    // Constructor to initialize Person attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Getter and Setter methods for encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}