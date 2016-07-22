package main.java.com.bitwiseglobal.burgershop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Cart {

    public final List userOrders = new ArrayList();

    public void printCartProducts () {
        System.out.println("Printing your cart products...");
        Utility.printList(userOrders);
    }

    public void addToCart (Object o) {
        this.userOrders.add(o);
    }

    public void getUserInfo(){

    }
}
