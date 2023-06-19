package assignment2_000899156;

/**
 * This class represents and works like a vending machine.
 * The user has the option enter money, get change, vend an item
 * and quit.
 * It only contains 1 product item per machine and it always
 * returns the full report of the item.
 *
 * It contains the implementation of entering money, giving the change back
 * to the user and vending an item
 *
 *
 * @author Jhayvee Arai 000899156, June 3, 2023.
 */
public class VendingMachine {
    /**
     * The name of the product
     **/
    private String productName;
    /**
     * The price of the product
     **/
    private double productPrice;
    /**
     * The number of the product available
     **/
    private int productQuantity;
    /**
     * The unused credit
     **/
    private double totalCredit;
    /**
     * The total amount of money it has taken in
     **/
    private double totalBalance = 0.00;
    private double totalChange = 0.00;

    /**
     * Total of each accepted coins
     **/

    /**
     * getters and setters
     * @return value for each variables
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getTotalChange() {
        return totalChange;
    }

    /**
     * It accepts the input of the user but set it in a way
     * the user can only enter the following:
     * 2 - toonies
     * 1 - loonies
     * 0.25 - quarters
     * 0.10 - dimes
     * 0.05 - nickels
     * and adding each entered money to totalCredit
     * @param money user input value
     */
    public void enterMoney(double money) {
        if (money == 2) {
            totalCredit += 2;
        } else if (money == 1) {
            totalCredit++;
        } else if (money == 0.25) {
            totalCredit += 0.25;
        } else if (money == 0.10) {
            totalCredit += 0.10;
        } else if (money == 0.05) {
            totalCredit += 0.05;
        } else {
            System.out.println("The machine only accepts $0.05, $0.10, $0.25, $1, and $2");
        }
    }

    /**
     * it calculates the totalChange that the user
     * can get it back
     * @return sets the totalCredit to 0 as the change was taken back
     * by the user
     */
    public double changeBack() {
        if (totalCredit > 0.00) {
            totalChange = totalChange + totalCredit;
            System.out.println("*** GETTING CHANGE SUCCESS ***");
            System.out.println("Your change is " + totalChange + "\nPlease collect.");
        } else
            System.out.println("*** GETTING CHANGE FAILED: You don't have change. ***");
        return totalCredit = 0.00;
    }

    /**
     * computes the totalBalance, totalCredit and number of product
     * after the user vend an item. show an output if not enough credit
     * or no item available.
     */
    public void vendItem() {
        if (totalCredit >= productPrice && totalCredit != 0.00 && productQuantity > 0) {
            totalBalance += productPrice;
            totalCredit -= productPrice;
            productQuantity--;
            System.out.println("*** VEND SUCCESS: Please get your item ***");
        } else if (totalCredit < productPrice || totalCredit == 0.00) {
            System.out.println("*** VEND FAILED: Not Enough Credit ***");
        } else if (productQuantity == 0) {
            System.out.println("*** VEND FAILED: No Available Item ***");
        }
    }

    /**
     * This method allows displaying the object's instance variables values by just printing the object
     * @return returns the full report on every interaction made by the user to the vending machine
     */
    @Override
    public String toString() {
        return "VendingMachine: " + getProductQuantity() + " " + getProductName() + ", price:$" + +getProductPrice() + ", credit:$" + getTotalCredit() + ", balance:$" + getTotalBalance();
    }
}