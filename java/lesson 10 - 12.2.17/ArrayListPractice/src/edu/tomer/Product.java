package edu.tomer;

/**
 * Created by hackeru on 12/02/2017.
 */
public class Product {

    private String name;
    private double weight;

    public Product(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
