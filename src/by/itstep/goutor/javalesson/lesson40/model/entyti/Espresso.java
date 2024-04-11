package by.itstep.goutor.javalesson.lesson40.model.entyti;

public class Espresso extends Beverage {
    private double cost;

    public Espresso() {
        description = "Espresso";
    }

    public Espresso(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.90;
    }
}
