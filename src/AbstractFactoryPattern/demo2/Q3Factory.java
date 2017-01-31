package AbstractFactoryPattern.demo2;

import AbstractFactoryPattern.demo2.Engine.DomesticEngine;
import AbstractFactoryPattern.demo2.Engine.IEngine;
import AbstractFactoryPattern.demo2.brake.IBrake;
import AbstractFactoryPattern.demo2.brake.NormalBrake;
import AbstractFactoryPattern.demo2.tire.ITire;
import AbstractFactoryPattern.demo2.tire.NormalTire;


/**
 * Created by chenhangye on 2017/1/31.
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
