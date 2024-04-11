package by.itstep.goutor.javalesson.lesson40.model.entyti;

public class Decaf extends Beverage {
    private double cost;

    public Decaf() {
        description = "Decaf";
    }

    public Decaf(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.7;
    }
}
