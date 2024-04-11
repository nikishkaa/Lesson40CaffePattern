package by.itstep.goutor.javalesson.lesson40.model.entyti.condiment;

import by.itstep.goutor.javalesson.lesson40.model.entyti.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
