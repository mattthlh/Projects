package VendingMachine;

public class Food implements VendingMachineItem{

    private String name;
    private int quantity;
    private double price;

    public Food(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getAmmount() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
}