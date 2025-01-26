public class Car {
    // Attributes
    private String name;
    private String model;
    private String color;
    private int year;

    // No-argument constructor (Default values)
    public Car() {
        this.name = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0; 
    }

    // Parameterized constructor (Custom Values)
    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}