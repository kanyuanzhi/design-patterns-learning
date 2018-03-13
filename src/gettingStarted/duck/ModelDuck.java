package gettingStarted.duck;

import gettingStarted.behavior.real.FlyNoWay;
import gettingStarted.behavior.real.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("i'm a model duck!");
    }
}
