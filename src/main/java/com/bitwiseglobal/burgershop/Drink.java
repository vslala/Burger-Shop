package main.java.com.bitwiseglobal.burgershop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Drink {

    private String name;
    private Double price;
    private List<Additional> list = new ArrayList<Additional>();

    public Drink(){
        this.drinkList();
    }

    public Drink(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name+" "+this.price;
    }


    private void drinkList() {
        String availableDrinks[] = {
                "Extra cheese ",
                "French Fries",
                "Extra Patti"
        };

        Double price[] = {
                25.00,
                80.00,
                40.00

        };

        for(int i=0;i<availableDrinks.length;i++){
            getList().add(new Additional(availableDrinks[i],price[i]));
        }
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

    public List<Additional> getList() {
        return list;
    }

    public void setList(List<Additional> list) {
        this.list = list;
    }
}
