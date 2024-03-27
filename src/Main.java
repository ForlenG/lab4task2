import java.util.Scanner;

class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void sell(int soldQuantity) {
        if (soldQuantity <= quantity) {
            quantity -= soldQuantity;
            System.out.println("Sold " + soldQuantity + " cars.");
        } else {
            System.out.println("Not enough cars in stock.");
        }
    }

    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity in stock: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Civic", "Honda", 2022, 25000.0, "Red", 10);

        System.out.println("Car details:");
        car.printDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity to sell: ");
        int quantityToSell = scanner.nextInt();
        car.sell(quantityToSell);

        System.out.println("\nUpdated car details:");
        car.printDetails();
    }
}
