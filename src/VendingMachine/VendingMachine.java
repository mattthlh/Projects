package VendingMachine;

import java.util.Stack;

public class VendingMachine{

    private Stack<VendingMachineItem>[][] vendingMachineItems;
    private int row;
    private int col;
    private int depth;

    public VendingMachine(int row, int col,int depth) {
        this.vendingMachineItems = new Stack[row][col];

        this.row = row - 1;
        this.col = col - 1;
        this.depth = depth - 1;
    }

    public void dispense (int row, int col) {
        if(!isEmpty(row, col)) {
            VendingMachineItem purchased = vendingMachineItems[row][col].get(0);
            vendingMachineItems[row][col].pop();

            System.out.println("You bought a " + purchased.getName() + "!");
        } else {
            System.out.println("Sorry, this slot is empty. " +
                    "Please try something else");
        }
    }

    public void refill (int row, int col, VendingMachineItem vendingMachineItem) {

    }

    public boolean isEmpty (int row, int col) {
        if (vendingMachineItems[row][col].size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}