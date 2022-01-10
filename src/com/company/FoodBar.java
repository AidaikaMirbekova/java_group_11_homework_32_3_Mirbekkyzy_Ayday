package com.company;

public class FoodBar extends Food{
    public FoodBar() {
    }

    @Override
    public String getName() {
        return "F4";
    }

    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("[%2.5s]  %13s  %11s",getName(),"Nutbar",getPrice()+" som");
    }
}
