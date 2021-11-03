package com.company;

import java.util.ArrayList;

public class Order {
    private String pizzaSize;
    private ArrayList<String> toppings = new ArrayList<>();

    public Order(String pizzaSize) {
        this.pizzaSize = pizzaSize;

    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }
}
