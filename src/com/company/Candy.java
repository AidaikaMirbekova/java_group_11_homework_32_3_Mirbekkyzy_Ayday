package com.company;

public class Candy extends Food{
    public Candy() {
    }

    @Override
    public String getName() {
        return "C3";
    }

    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("[%2.5s]  %13s  %11s",getName(),"Candy",getPrice()+" som");
    }
}
