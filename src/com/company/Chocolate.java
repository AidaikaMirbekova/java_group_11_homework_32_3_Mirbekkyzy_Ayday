package com.company;

public class Chocolate extends Food{
    public Chocolate() {
    }

    @Override
    public String getName() {
        return "C5";
    }

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("[%2.5s]  %13s  %11s",getName(),"Chocolate",getPrice()+" som");
    }
}
