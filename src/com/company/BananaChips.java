package com.company;

public class BananaChips extends Food{

    public BananaChips() {
    }

    @Override
    public String getName() {
        return "B7";
    }

    @Override
    public double getPrice() {
        return 70;
    }

    @Override
    public String toString() {
       return String.format("[%1.5s]  %13s  %11s",getName(),"Bananachips",getPrice()+" som");
    }
}
