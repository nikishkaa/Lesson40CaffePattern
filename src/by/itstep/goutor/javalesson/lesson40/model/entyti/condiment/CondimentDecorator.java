package by.itstep.goutor.javalesson.lesson40.model.entyti.condiment;

import by.itstep.goutor.javalesson.lesson40.model.entyti.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;


    @Override
    public abstract String getDescription();
}
