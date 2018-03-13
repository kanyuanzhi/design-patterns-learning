package gettingstarted.behavior.real;

import gettingstarted.behavior.impl.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}
