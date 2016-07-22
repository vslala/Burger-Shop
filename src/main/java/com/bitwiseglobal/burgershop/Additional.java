package main.java.com.bitwiseglobal.burgershop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Additional {

    private String name;
    private Double price;
    private List<Additional> list = new ArrayList<Additional>();

    public Additional(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Additional(){
        this.optionsList();
    }

    @Override
    public String toString() {
        return this.name+" "+this.price;
    }


    private void optionsList() {
        String availableOptions[] = {
                "Extra cheese ",
                "French Fries",
                "Extra Patti"
        };


        Double price[] = {
                25.00,
                80.00,
                40.00

        };





        for(int i=0;i<availableOptions.length;i++){
            getList().add(new Additional(availableOptions[i],price[i]));
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
