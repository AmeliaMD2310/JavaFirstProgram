/*
Amelia MacDonald
W0467922
January 26, 2025
Object Oriented Programming
Exercise 3
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I Love Cars!");

        // Using the no-argument constructor
        Car carOne = new Car();
        System.out.println("---No-Argument Constructor---");
        System.out.println("Car One Details:");
        System.out.println("Name: " + carOne.getName());
        System.out.println("Model: " + carOne.getModel());
        System.out.println("Color: " + carOne.getColor());
        System.out.println("Year: " + carOne.getYear());

        // Setting values using setters
        carOne.setName("Dodge Challenger");
        carOne.setModel("Hellcat");
        carOne.setColor("Purple");
        carOne.setYear(2023);

        System.out.println("Updated Car One Details:");
        System.out.println("Name: " + carOne.getName());
        System.out.println("Model: " + carOne.getModel());
        System.out.println("Color: " + carOne.getColor());
        System.out.println("Year: " + carOne.getYear());

        // Using the parameterized constructor
        Car carTwo = new Car("Mitsubishi Lancer", "SE", "Blue", 2016);
        System.out.println("---Parameterized Constructor---");
        System.out.println("Car Two Details:");
        System.out.println("Name: " + carTwo.getName());
        System.out.println("Model: " + carTwo.getModel());
        System.out.println("Color: " + carTwo.getColor());
        System.out.println("Year: " + carTwo.getYear());

    }
}