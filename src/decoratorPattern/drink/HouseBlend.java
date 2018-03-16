package decoratorPattern.drink;

import decoratorPattern.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(int size){
        setSize(size);
        description = "House Blend Coffee";
    }

    @Override
    public double cost(){
        return 0.89+ getSize() * 0.05 + 0.10;
    }
}
