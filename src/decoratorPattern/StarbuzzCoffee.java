package decoratorPattern;

import decoratorPattern.condiment.Mocha;
import decoratorPattern.condiment.Soy;
import decoratorPattern.condiment.Whip;
import decoratorPattern.drink.Espresso;
import decoratorPattern.drink.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso(1);
        beverage.printInfo();

        Beverage beverage1 = new HouseBlend(0);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1.printInfo();

        Beverage beverage3 = new HouseBlend(1);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3.printInfo();

        Beverage beverage2 = new HouseBlend(0);
        beverage2 = new Soy(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2.printInfo();
    }
}
