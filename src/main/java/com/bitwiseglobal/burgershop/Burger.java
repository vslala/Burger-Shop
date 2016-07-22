package main.java.com.bitwiseglobal.burgershop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Burger {
    private String name;
    private Double price;
    private final List<Burger> list = new ArrayList<Burger>();


    public Burger(){
        this.burgerList();
    }

    Burger(String name, Double price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return this.name+" "+this.price;
    }

    private void burgerList(){

       String availableBurgers[] = {
           "Mc aloo tikki",
               "Mc veggie",
               "Mc spicy paneer",
               "Mc chicken",
               "Extra-long cheese burger",
               "chicken mcgrill",
               "mc egg burger"
       };


       Double burgerPrice[] = {
               122.33,
               142.94,
               152.53,
               170.00,
               220.75,
               122.33,
               102.12

       };

       for(int i=0;i<availableBurgers.length;i++){
           getList().add(new Burger(availableBurgers[i],burgerPrice[i]));
       }
    }

    public List<Burger> getList() {
        return list;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
