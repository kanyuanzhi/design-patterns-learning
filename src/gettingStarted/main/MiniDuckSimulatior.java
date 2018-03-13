package gettingStarted.main;

import gettingStarted.behavior.real.FlyRocketPowered;
import gettingStarted.duck.Duck;
import gettingStarted.duck.MallardDuck;
import gettingStarted.duck.ModelDuck;

public class MiniDuckSimulatior {
    public static void main(String args[]) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
