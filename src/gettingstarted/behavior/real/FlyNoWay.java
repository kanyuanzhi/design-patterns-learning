package gettingstarted.behavior.real;

import gettingstarted.behavior.impl.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("i can't fly!");
    }
}
