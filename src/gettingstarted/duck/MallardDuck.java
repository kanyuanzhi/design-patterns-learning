package gettingstarted.duck;

import gettingstarted.behavior.real.FlyWithWings;
import gettingstarted.behavior.real.Quack;

import java.util.Map;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("i'm a real Mallard duck!");
    }
}
