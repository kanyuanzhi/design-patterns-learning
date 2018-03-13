package gettingStarted.duck;

import gettingStarted.behavior.impl.FlyBehavior;
import gettingStarted.behavior.impl.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void swim(){
        System.out.println("all ducks float, even decoys!");
    }
}
