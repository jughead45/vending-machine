# vending-machine

It is a Java prorgram that will create two classes to simulate a “break room” containing two vending machines.

This is not a graphical application. In this assignment, the vending machine class is the model and the break room class implements a “view” that consists of a text-based conversation with the user.

A vending machine contains a single type of product. The product has a name and price and there is a limited quantity available. A vending machine tracks its current unused credit and the total amount of money it has taken in since it was switched on. The product name, price, and quantity can be set when the vending machine object is created, or the object can be created with default values for some or all these attributes.

A user can put loonies, toonies, quarters, nickels, and dimes into the machine. Coins must be entered one at a time. The machine does not accept bills or pennies. The user presses a button to vend the product and will expect a response (either something vends or it doesn’t).

Vending should be denied if there is not enough credit in the machine, or if there is no product left. It is up to you how to handle the user’s change. The machine might automatically return it when the vend button is pressed, or it might just deduct the price and leave it as credit. Either way, there should also be a coin return button that will return all the current credit to the user.

When the machine is first turned on, it is initialized with the name, price, and quantity of the product it contains. There are no restrictions on how the user can use the machine. They can insert their money before they press buttons, after they press buttons, or while pressing buttons.

note: UML class diagram also was included to represent a vending machine

One possibility is shown in the example dialog below.

Welcome to the Break Room!
There are two vending machines here:
1. VendingMachine: 8 chocolate, $1.99, $4.50, $45.25
2. VendingMachine: 1 iPad mini, $199.99, $0.00, $0.00
What would you like to do?
1. Enter money
2. Get change back
3. Vend an item
4. Leave the break room
Your Choice? 3
*** VEND AN ITEM ***
Which machine? 2
*** VEND FAILED: Not Enough Credit ***
Welcome to the Break Room. There are two vending machines here:
1. VendingMachine: 8 chocolate, $1.99, $4.50, $45.25
2. VendingMachine: 1 iPad mini, $199.99, $0.00, $0.00
What would you like to do?
1. Enter money
2. Get change back
3. Vend an item
4. Leave the break room
Your Choice? 4
Goodbye!
