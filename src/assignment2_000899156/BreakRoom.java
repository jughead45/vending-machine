package assignment2_000899156;

/**
 *  This class represents as a menu option that
 *  the user can interact with and it works as a break room.
 *
 *  It contains the implementation of the menu option that the user can input,
 *  initialization of the machines, and output of the vending machine.
 *
 *  @author Jhayvee Arai 000899156, June 3, 2023.
 */

import java.util.Scanner;

public class BreakRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachine machine1 = new VendingMachine(); //the machine to do the first test
        /**
         * test product name, product quantity,
         * product price, credit and balance setting
         */
        machine1.setProductName("potato chips");
        machine1.setProductQuantity(5);
        machine1.setProductPrice(3.99);
        machine1.setTotalCredit(4.50);
        machine1.setTotalBalance(45.25);

        VendingMachine machine2 = new VendingMachine(); //the machine to do the second test
        machine2.setProductName("soda");
        machine2.setProductQuantity(2);
        machine2.setProductPrice(1.99);
        machine2.setTotalCredit(0.00);
        machine2.setTotalBalance(0.00);

        /** Display the initial balance, credit, quantity of the product **/
        System.out.println("Welcome to the Break Room!\n");
        System.out.println("Choose from the two vending machines available here:");
        System.out.println("1. " + machine1);
        System.out.println("2. " + machine2);
        System.out.println();

        /**
         * Display menu
         */
        System.out.print("What would you like to do?\n" + "1. Enter money\n2. Get change back\n3. Vend an item\n4. Leave the break room\nYour choice? ");
        int flag = 0;
        int selection = sc.nextInt();

        while (flag != 1) {
            switch (selection) {
                case 1:
                    System.out.println("*** ENTER MONEY ***");

                    System.out.println("Which machine 1 or 2? (press '3' to go back)");
                    int vm = sc.nextInt();
                    while (vm < 3) {
                        switch (vm) {
                            case 1:
                                System.out.println("*** VM 1 ***");
                                System.out.println("Enter amount(only accepts $0.05, $0.10, $0.25, $1, and $2): ");
                                double insertedMoney = sc.nextDouble();
                                machine1.enterMoney(insertedMoney); // calling the class
                                System.out.println("Total Credit:" + machine1.getTotalCredit()); // calling the getters for credit
                                break;
                            case 2:
                                System.out.println("*** VM 2 ***");
                                System.out.println("Enter amount(only accepts $0.05, $0.10, $0.25, $1, and $2): ");
                                insertedMoney = sc.nextDouble();
                                machine2.enterMoney(insertedMoney);
                                System.out.println("Total Credit:" + machine2.getTotalCredit());
                                break;
                        }
                        System.out.println("Which machine 1 or 2? (press '3' to go back)");
                        vm = sc.nextInt();
                    }

                    break;
                case 2:
                    System.out.println("*** GET CHANGE ***");

                    System.out.println("Which machine 1 or 2? (press '3' to go back)");
                    vm = sc.nextInt();
                    while (vm < 3) {
                        switch (vm) {
                            case 1:
                                System.out.println("*** VM 1 ***");
                                machine1.changeBack();
                                break;
                            case 2:
                                System.out.println("*** VM 2 ***");
                                machine2.changeBack();
                                break;
                        }
                        System.out.println("Which machine 1 or 2? (press '3' to go back)");
                        vm = sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("*** VEND AN ITEM ***");

                    System.out.println("Which machine 1 or 2? (press '3' to go back)");
                    vm = sc.nextInt();
                    while (vm < 3) {
                        switch (vm) {
                            case 1:
                                System.out.println("*** VM 1 ***");
                                machine1.vendItem();
                                break;
                            case 2:
                                System.out.println("*** VM 2 ***");
                                machine2.vendItem();
                                break;
                        }
                        System.out.println("Which machine 1 or 2? (press '3' to go back)");
                        vm = sc.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    flag = 1;
                    break;
                default:
                    System.out.println("Incorrect option!");
            }
            if (flag == 1) break;

            /**
             * Re display menu to choose again until decided to choose exit/quit
             */
            System.out.println("Welcome to the Break Room!\n");
            System.out.println("Choose from the two vending machines available here:");
            System.out.println("1. " + machine1);
            System.out.println("2. " + machine2);
            System.out.println();

            System.out.print("What would you like to do?\n" + "1. Enter money\n2. Get change back\n3. Vend an item\n4. Leave the break room\nYour choice? ");
            selection = sc.nextInt();
        }
    }
}

