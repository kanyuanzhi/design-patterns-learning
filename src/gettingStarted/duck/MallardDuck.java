package gettingStarted.duck;

import gettingStarted.behavior.real.FlyWithWings;
import gettingStarted.behavior.real.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("i'm a real Mallard duck!");
    }
}
