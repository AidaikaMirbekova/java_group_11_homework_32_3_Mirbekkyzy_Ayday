package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        FoodMachine machine=new FoodMachine();
        foods.add(new BananaChips());
        foods.add(new Candy());
        foods.add(new Chocolate());
        foods.add(new FoodBar());
        foods.add(new Water());
        Printer.print(foods);
       Simulation.show(foods,machine);
    }
}
