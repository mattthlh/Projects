package VendingMachine;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String userInput;
    static VendingMachine vendingMachine = new VendingMachine();
    static MainCharacter mainCharacter = new MainCharacter();
    static String userName;

    public static void main(String[] args) throws InterruptedException {
        printStringSlowly("Before we start, what is your name?");

        userName = sc.nextLine();

        if(userName.equalsIgnoreCase("")) {
            userName = "[Blank]";
        }

        System.out.println("Welcome " + userName + ", to the VENDING MACHINE game. " +
                "What would you like to do?");

        System.out.println("================================== ");

        System.out.println("1 >>> Start Story");
        System.out.println();
        System.out.println("2 >>> Customize Vending Machine");
        System.out.println();
        System.out.println("3 >>> Customize your character");
        System.out.println();
        System.out.println("4 >>> Went into the wrong game and want to leave.");

        System.out.println("================================== ");

        userInput = sc.nextLine();

        while (!userInput.equalsIgnoreCase("1")) {
            switch (userInput) {
                case "2":
                    vendingMachineMenu();
                    break;

                case "3":
                    characterMenu();
                    break;

                case "4":
                    System.out.println("Are you sure you want to exit? [Y/N]");
                    userInput = sc.nextLine();
                    if (userInput.equalsIgnoreCase("Y")) {
                        System.out.println("Are you really really sure?");
                        Thread.sleep(1500);
                        System.out.println("Just kidding, Im not that kind of " +
                                "guy. Hope you come back :)");
                        System.exit(0);
                    }

                default:
                    System.out.println("Type one of the numbers please.");
            }

            userInput = sc.nextLine();
        }

        System.out.println("Starting story...");
        System.out.println("Encrypting...");
        System.out.println("Loading...");
        System.out.println("Starting...");
        System.out.println();

        //Story
        System.out.println("This is the story of the Vending Machine. " +
                "(Press \"ENTER\" to continue)");


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
                    System.out.println("Invalid option, Please choose one of the following numbers.");
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

        while (true) {
            System.out.println("What would you like to do? \n" +
                    "Type the number of your choosing.");
            System.out.println("The ones you don't change are chosen by default.");
            System.out.println();

            System.out.println("================================== ");
            System.out.println();
            System.out.println("1 >>> REFILL VENDING MACHINE");
            System.out.println();
            System.out.println("2 >>> SHOW CONTENTS");
            System.out.println();
            System.out.println("3 >>> GO BACK TO MAIN MENU");
            System.out.println();
            System.out.println("================================= ");

            userInput = sc.nextLine();

            switch (userInput) {

                case "1":

                case "2":

                case "3":
                    return;

                default:
                    System.out.println("Invalid option, Please choose one of the following numbers.");
            }
        }
    }

    public static void characterMenu() {
        userInput = "";

        while (true) {

            System.out.println("What would you like to change?");

            System.out.println("================================== ");

            System.out.println("1 >>> CHANGE NAME");
            System.out.println();
            System.out.println("2 >>> CHANGE AGE");
            System.out.println();
            System.out.println("3 >>> CHANGE OCCUPATION");
            System.out.println();
            System.out.println("4 >>> CHANGE BALANCE");
            System.out.println();
            System.out.println("5 >>> GO BACK TO MAIN MENU");

            System.out.println("================================= ");

            userInput = sc.nextLine();

            switch (userInput) {

                case "1":
                    System.out.println("What will be your character's NAME?");

                    userInput = sc.nextLine();
                    mainCharacter.setName(userInput);

                    break;

                case "2":
                    System.out.println("What will be your character's AGE?");

                    userInput = sc.nextLine();
                    mainCharacter.setAge(Integer.parseInt(userInput));

                    break;

                case "3":
                    System.out.println("What will be your character OCCUPATION?");

                    userInput = sc.nextLine();
                    mainCharacter.setOccupation(userInput);

                    break;

                case "4":
                    System.out.println("What will be your character BALANCE?");

                    userInput = sc.nextLine();
                    mainCharacter.setMoney(Integer.parseInt(userInput));

                    break;

                case "5":
                    return;

                default:
                    System.out.println("Invalid option, Please choose one of the following numbers.");
            }
        }
    }

    public static void printStringSlowly(String message) throws InterruptedException {
        for(int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(50);
        }
        System.out.println();
    }
}
