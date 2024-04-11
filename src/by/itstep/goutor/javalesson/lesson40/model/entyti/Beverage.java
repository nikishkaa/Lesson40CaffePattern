package by.itstep.goutor.javalesson.lesson40.model.entyti;

public abstract class Beverage {
    protected String description;

    public Beverage() {
        description = "no description";
    }

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return description;
    }
}
