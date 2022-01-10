package com.company;

import java.util.List;

public class Printer {
    public static void printHeader(){
        System.out.printf("%1$5.5s + %1$10.10s + %1$10.10s +%n", "--------------");
        System.out.printf("%5.5s | %10.10s | %10.10s |%n", "Code", "Food name", "Price");
        System.out.printf("%1$5.5s + %1$10.10s + %1$10.10s +%n", "--------------");
    }

    private static final void printFood(Food food) {
        System.out.println(food.toString());
        System.out.println(String.format("---------------------------------"));
    }

    public static final void print(List<Food> food) {
        printHeader();
        food.forEach(Printer::printFood);
        System.out.println();
    }
}
