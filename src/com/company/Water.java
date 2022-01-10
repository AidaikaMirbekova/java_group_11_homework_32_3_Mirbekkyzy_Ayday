package com.company;

public class Water extends Food{
    public Water() {
    }

    @Override
    public String getName() {
        return "W2";
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("[%2.5s]  %13s  %11s",getName(),"Water",getPrice()+" som");
    }

}
