package edu.tomer;

/**
 * Created by hackeru on 12/02/2017.
 */
public class Fruit {

    private String name;
    private double price;

    public Fruit(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
