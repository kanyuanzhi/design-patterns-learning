package gettingstarted.main;

import gettingstarted.behavior.real.FlyRocketPowered;
import gettingstarted.duck.Duck;
import gettingstarted.duck.MallardDuck;
import gettingstarted.duck.ModelDuck;

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
