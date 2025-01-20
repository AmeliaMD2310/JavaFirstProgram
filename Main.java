/*
Amelia MacDonald
W0467922
January 15, 2025
Exercise 2 
*/
public class Main {
    public static void main(String[] args) {
System.out.println("Hello, World!");
System.out.println("I Love Cars!");

    Car carOne = new Car();
    System.out.println(carOne.getName () );

    carOne.setName("Dodge Challenger");
    System.out.println(carOne.getName () );

    carOne.setName("Mitsubishi Lancer")  ;
    System.out.println(carOne.getName ());

    carOne.setModel(2018)  ;
    System.out.println(carOne.getModel () );

    carOne.setColor ("Purple")  ;
    System.out.println(carOne.getColor () );
    
    }
}