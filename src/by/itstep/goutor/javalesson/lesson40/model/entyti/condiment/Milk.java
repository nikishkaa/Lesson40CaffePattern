package by.itstep.goutor.javalesson.lesson40.model.entyti.condiment;

import by.itstep.goutor.javalesson.lesson40.model.entyti.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }
}
