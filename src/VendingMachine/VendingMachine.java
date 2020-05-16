package VendingMachine;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Food> foods = new ArrayList<>();
    private int row = 3;
    private int col = 4;
    private int size = row * col;

    public VendingMachine() {

    }

    public VendingMachine(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void addDrink(Drink drink) {
        if (drinks.size() <= size) {
            drinks.add(drink);
        }
    }

    public void addFood(Food food) {
        if (foods.size() <= size) {
            foods.add(food);
        }
    }

    public void removeDrink(Drink drink) {
        drinks.remove(drink);
    }

    public void removeFood(Food food) {
        foods.remove(food);
    }

    public void clearVendingMachine() {
        foods.clear();
        drinks.clear();
    }

    public void changeSize(int size) {

    }
}
