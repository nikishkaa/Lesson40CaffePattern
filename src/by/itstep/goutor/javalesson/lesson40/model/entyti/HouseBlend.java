package by.itstep.goutor.javalesson.lesson40.model.entyti;

public class HouseBlend extends Beverage{
    private double cost;

    public HouseBlend() {
        description = "House blend";
    }

    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
