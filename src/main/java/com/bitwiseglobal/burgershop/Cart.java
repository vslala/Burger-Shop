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

    public double calculateTotalPrice () {
        double sum = 0;

        for (int i=0; i < this.userOrders.size(); i++) {
            if (this.userOrders.get(i) instanceof Burger)
                sum = sum + ((Burger) this.userOrders.get(i)).getPrice();
            if (this.userOrders.get(i) instanceof Additional)
                sum = sum + (((Additional) this.userOrders.get(i)).getPrice());
            if (this.userOrders.get(i) instanceof Drink)
                sum = sum + ((Drink) this.userOrders.get(i)).getPrice();
        }

        sum = (sum + sum*0.15) + (sum + sum*0.10);
        return sum;

    }
}
