package by.itstep.goutor.javalesson.lesson40.controller;

import by.itstep.goutor.javalesson.lesson40.model.entyti.Beverage;
import by.itstep.goutor.javalesson.lesson40.model.entyti.Espresso;
import by.itstep.goutor.javalesson.lesson40.model.entyti.HouseBlend;
import by.itstep.goutor.javalesson.lesson40.model.entyti.condiment.Milk;
import by.itstep.goutor.javalesson.lesson40.model.entyti.condiment.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage;

        System.out.println("\nTest 01: ");
        beverage = new Espresso();
        print(beverage);


        System.out.println("\nTest 02: ");
        beverage = new Milk(beverage);
        print(beverage);

        System.out.println("\nTest 03: ");
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        print(beverage);


        System.out.println("\nTest 04: ");
        Beverage coffee = new Mocha(new Mocha(new Mocha(new Milk(new HouseBlend()))));
        print(coffee);
    }

    public static void print(Beverage beverage) {
        System.out.println("Cost is " + beverage.cost());
        System.out.println(beverage);

    }
}
