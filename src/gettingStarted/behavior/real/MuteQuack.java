package gettingStarted.behavior.real;

import gettingStarted.behavior.impl.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("silence!");
    }
}
