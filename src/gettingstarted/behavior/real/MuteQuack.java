package gettingstarted.behavior.real;

import gettingstarted.behavior.impl.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("silence!");
    }
}
