package VendingMachine;

import java.util.ArrayList;

public class VendingMachine{

    private ArrayList<Drink> drinks = new ArrayList<>();
    private VendingMachineItem[][][] vendingMachineItems;
    private int row;
    private int col;
    private int depth;

    public VendingMachine(int row, int col, int depth) {
        this.vendingMachineItems = new VendingMachineItem[row][col][depth];

        this.row = row - 1;
        this.col = col - 1;
        this.depth = depth - 1;
    }

    public void dispense (int row, int col) {
        if(!isFunctional(row, col)) {
            for (int i = 0; i < depth; i++) {

            }
        } else {
            System.out.println("Sorry, this slot is empty. " +
                    "Please try something else");
        }
    }

    public void refill (int row, int col, VendingMachineItem vendingMachineItem) {

    }

    public boolean isFunctional(int row, int col) {
        if (vendingMachineItems[row][col].length <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEmpty (int row, int col, int depth) {
        if (vendingMachineItems[row][col][depth] == null) {
            return true;
        } else {
            return false;
        }
    }
}
