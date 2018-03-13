package gettingStarted.behavior.real;

import gettingStarted.behavior.impl.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}
