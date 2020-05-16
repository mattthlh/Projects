package VendingMachine;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String userInput;
    static VendingMachine vendingMachine = new VendingMachine();
    static String user = "";

    public static void main(String[] args) {

        System.out.println("Welcome " + user + "to the VENDING MACHINE. " +
                "What would you like to do?");

        System.out.println("================================== ");

        System.out.println("1 >>> Start Story");
        System.out.println();
        System.out.println("2 >>> Customize Vending Machine");
        System.out.println();
        System.out.println("3 >>> Customize your character" +
                " even though it doesn't really matter.");
        System.out.println();
        System.out.println("4 >>> Went into the wrong game and want to leave.");

        System.out.println("================================== ");

        userInput = sc.nextLine();

        switch (userInput) {
            case "1":
                System.out.println("Starting story...");
                System.out.println("Encrypting...");
                System.out.println("Loading...");
                System.out.println("Starting...");
                System.out.println();
                break;

            case "2":
                vendingMachineMenu();
                break;

            case "3":
                System.out.println("Case3: Value is: " + 3);
                break;


            case "4":
                System.out.println("Sad to see you go :( Hope you come again :)");
                System.exit(0);

            default:
                System.out.println("Type one of the numbers please.");
        }

        //Story
        System.out.println("This is the story of the Vending Machine. " +
                "(Press \"ENTER\" to continue)");

        userInput = sc.nextLine();
        confirmEnter();

        //More story stuff
        System.out.println("After a long day at work, you stumble across a Vending Machine. " +
                "(Press \"ENTER\" to continue)");

        userInput = sc.nextLine();
        confirmEnter();

        //Vending Machine Layout
        System.out.println("What would you like to do? \n" +
                "Type the number of your choosing.");

        System.out.println("================================== ");

        System.out.println("1 >>> BUY");
        System.out.println();
        System.out.println("2 >>> RESTOCK (Should I include this, IDK)");
        System.out.println();
        System.out.println("3 >>> CHECK PRICES");
        System.out.println();
        System.out.println("4 >>> CHECK AMOUNT");
        System.out.println();
        System.out.println("5 >>> LEAVE");

        System.out.println("================================= ");

        //User enters what action they want to do
        userInput = sc.nextLine();

        //As long as the choice he makes is not Leave, we will keep looping.
        while(!userInput.equalsIgnoreCase("5")) {
            //Here is the interesting part.
            //We start checking what choices the user made
            switch (userInput) {
                case "1":
                    System.out.println("Case1: Value is: " + 1);
                    break;

                case "2":
                    System.out.println("Case2: Value is: " + 2);
                    break;

                case "3":
                    System.out.println("Case3: Value is: " + 3);
                    break;


                case "4":
                    System.out.println("Case3: Value is: " + 4);
                    break;


                default:
                    System.out.println("Type one of the numbers please.");
            }
            userInput = sc.nextLine();
        }

        System.out.println("You left the Vending Machine and went home. Hopefully feeling refreshed.");
    }

    //Checks whether the user pressed enter. If so, continue the story
    public static void confirmEnter() {
        while(!userInput.equals("")) {
            System.out.println("Please press \"ENTER\" to continue.");

            userInput = sc.nextLine();
        }
    }

    public static void vendingMachineMenu() {
        switch (userInput) {

            case "1":

            case "2":

            case "3":

            case "4":

            case "5":


            default:
                System.out.println("Please choose one of the following numbers.");
        }
    }

}
