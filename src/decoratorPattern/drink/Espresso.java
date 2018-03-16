package decoratorPattern.drink;

import decoratorPattern.Beverage;

public class Espresso extends Beverage {
    public Espresso(int size) {
        setSize(size);
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99 + getSize() * 0.05 + 0.10;
    }


}
