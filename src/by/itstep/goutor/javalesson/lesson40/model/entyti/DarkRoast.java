package by.itstep.goutor.javalesson.lesson40.model.entyti;

public class DarkRoast extends Beverage {
    private double cost;

    public DarkRoast() {
        description = "DarkRoast";
    }

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.65;
    }
}
