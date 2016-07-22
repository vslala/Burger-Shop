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

    public void getUserInput () {
        in = new Scanner (System.in);
        this.ch = Integer.parseInt(in.nextLine());

    }

    public void doAction (int ch) {
        this.addToList(this.burger.getList().get(ch-1));
    }

    public void addToList (Object o) {
        this.cart.userOrders.add(o);
    }

    public void showBurgers () {
        Utility.printList(burger.getList());
        this.getUserInput();
        this.doAction(this.ch);
        this.cart.printCartProducts();
    }


}
