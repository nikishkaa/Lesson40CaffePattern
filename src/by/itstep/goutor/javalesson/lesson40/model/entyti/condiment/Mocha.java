package by.itstep.goutor.javalesson.lesson40.model.entyti.condiment;

import by.itstep.goutor.javalesson.lesson40.model.entyti.Beverage;

public  class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
}
