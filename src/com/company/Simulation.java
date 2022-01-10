package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Simulation {
    static  Scanner sc = new Scanner(System.in);

    public static void show(List<Food> foods, FoodMachine machine) {
        payPal(foods,machine);
    }

    public static void payPal(List<Food> foods,FoodMachine machine) {
        addMoney(foods, machine);
        for (int i = 0; i < foods.size(); i++) {
            var sum=foods.stream()
                    .min(Comparator.comparingDouble(Food::getPrice)).get().getPrice();
            if (machine.getTotalPrice() < sum) {
                System.out.println("You can't buy anything, please add money");
                choiceAgainAddMoney(foods,machine);
            } else {
                choiceAgainAddMoney(foods,machine);
                choiceFood(foods,machine);
            }
        }
    }

    public static void choiceAgainAddMoney(List <Food> foods,FoodMachine machine){
        System.out.println("Do you want to add more money? Write yes or no");
        String add = sc.next();
        if (add.equalsIgnoreCase("yes")) {
            addMoney(foods, machine);
        } else if (add.equalsIgnoreCase("no")) {
            var food = foods.stream()
                    .filter(f -> f.getPrice() <= machine.getTotalPrice())
                    .collect(Collectors.toList());
            System.out.println("You can buy:");
            Printer.print(food);
            choiceFood(foods,machine);
        }
    }

    public static void addMoney(List <Food> foods,FoodMachine machine){
        System.out.println("Enter money: ");
        machine.setTotalPrice(sc.nextDouble());
        System.out.printf("You deposited money in the amount of %s soms\n", machine.getTotalPrice());
        System.out.println("You can buy:");
        var food=foods.stream()
                .filter(f->f.getPrice()< machine.getTotalPrice())
                .collect(Collectors.toList());
        Printer.print(food);
    }



    public static void choiceFood(List<Food> foods,FoodMachine machine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the food code you want to buy: ");
        String code = sc.next();
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().equalsIgnoreCase(code)){
                var food=foods.stream()
                        .filter(f->f.getName().equalsIgnoreCase(code))
                        .collect(Collectors.toList());
                System.out.println("You select to buy: ");
                Printer.print(food);
                machine.setTotalPrice(machine.getTotalPrice()-foods.get(i).getPrice());
                System.out.printf("You have %s som\n",machine.getTotalPrice());
                var foodm=foods.stream()
                        .filter(f->f.getPrice()< machine.getTotalPrice())
                        .collect(Collectors.toList());
                Printer.print(foodm);

            }
        }
    }
}
