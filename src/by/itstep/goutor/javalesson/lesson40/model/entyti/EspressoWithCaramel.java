package by.itstep.goutor.javalesson.lesson40.model.entyti;

public class EspressoWithCaramel extends Espresso {
    public EspressoWithCaramel() {
    }

    public EspressoWithCaramel(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return super.cost() + 0.20;
    }
}
