package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String userOrderSize = "";
        while(!valid) {
            System.out.println("Enter a Size (Small,Medium,Large)");
            userOrderSize = input.next();
            if(userOrderSize.equals("Small") || userOrderSize.equals("Medium") || userOrderSize.equals("Large")){
                valid = true;
            }else{
                System.out.println("Enter a valid size");
            }
        }
        Order userOrder = new Order(userOrderSize);
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList(
                "Pepperoni", "Mushrooms", "Beef", "Chilli Peppers", "Peppers"
        ));
        System.out.println("Available Toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i));
        }
        while(true){
            System.out.println("Would you like a topping? (Y/N)");
            String toppingDecision = input.next();
            if(!toppingDecision.toUpperCase(Locale.ROOT).equals("Y") || !toppingDecision.toUpperCase(Locale.ROOT).equals("N") ){
                System.out.println("Please Enter Y/N");
            }
            if(toppingDecision.toUpperCase(Locale.ROOT).equals("Y")){
                System.out.println("Which topping(list above): ");
                String userTopping = input.next();
                userOrder.addTopping(userTopping);
            }
            if(toppingDecision.toUpperCase(Locale.ROOT).equals("N")){
                break;
            }
        }
        float price = 0;
        if(userOrder.getPizzaSize().equals("Small")){
            price += 7.99;
        }
        if(userOrder.getPizzaSize().equals("Medium")){
            price += 10.99;
        }
        if(userOrder.getPizzaSize().equals("Large")){
            price += 13.99;
        }
        if(userOrder.getToppings().size() > 2){
            price += (userOrder.getToppings().size()-2)*1.25;
        }
        System.out.println("Order:");
        System.out.println("Size: " + userOrder.getPizzaSize());
        System.out.println("Toppings:");
        for (int i = 0; i < userOrder.getToppings().size(); i++) {
            System.out.println(userOrder.getToppings());
        }
    }
}
