package main.java.com.bitwiseglobal.burgershop;

import java.util.Scanner;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Menu {

    Burger burger = new Burger();
    Additional additional = new Additional();
    Drink drink = new Drink();
    Cart cart = new Cart();
    private int ch;
    Scanner in;

    public Menu () {

        do {
            this.categories ();
            this.getUserInput();
            this.doAction(this.ch);
        } while (this.ch != 0);
    }

    private void categories() {
        System.out.println("1. Burgers");
        System.out.println("2. Additionals");
        System.out.println("3. Drinks");
        System.out.println("4. Cart Status");
        System.out.println("5. Total Price for orders");
    }

    public int getUserInput () {
        in = new Scanner (System.in);
        this.ch = Integer.parseInt(in.nextLine());
        return this.ch;
    }

    public void doAction (int ch) {
        switch (ch) {
            case 1:
                this.printBurgerList ();
                cart.addToCart(burger.getList().get(this.getUserInput() - 1));
                break;
            case 2:
                this.printAdditionals();
                cart.addToCart(burger.getList().get(this.getUserInput() - 1));
                break;
            case 3:
                this.printAvailableDrinksList();
                cart.addToCart(burger.getList().get(this.getUserInput() - 1));
                break;
            case 4:
                this.printCartItems ();
                break;
            case 5:
                System.out.println(cart.calculateTotalPrice());
                break;
            case 0:
                System.exit(0);
                break;
            default:

                break;
        }
    }

    private void printCartItems() {
        cart.printCartProducts();
    }

    private void printAvailableDrinksList() {
        System.out.println ("Printing the list of available drinks");
        Utility.printList(drink.getList());
    }

    private void printAdditionals() {
        System.out.println("Printing Additionals List...");
        Utility.printList(additional.getList());
    }

    private void printBurgerList() {
        System.out.println("Printing Available Burgers List");
        Utility.printList(burger.getList());
    }


}
