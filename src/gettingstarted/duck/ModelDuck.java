package gettingstarted.duck;

import gettingstarted.behavior.real.FlyNoWay;
import gettingstarted.behavior.real.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("i'm a model duck!");
    }
}
