package Section7;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    public Car(String make, String color, Double price, int year) {
        this.make = make;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }
}