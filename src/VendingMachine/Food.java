package VendingMachine;

public class Food extends VendingMachine {

    private String name;
    private int quantity;
    private double price;

    public Food(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}