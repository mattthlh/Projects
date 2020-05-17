package VendingMachine;

public class Drink extends VendingMachine {

    private String name;
    private int quantity;
    private double price;

    public Drink(String name, int quantity, double price) {
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

    public void removeOne() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("We are out of stock. Please buy another drink.");
        }
    }
}
