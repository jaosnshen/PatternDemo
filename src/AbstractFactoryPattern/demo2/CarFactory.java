package AbstractFactoryPattern.demo2;

import AbstractFactoryPattern.demo2.Engine.IEngine;
import AbstractFactoryPattern.demo2.brake.IBrake;
import AbstractFactoryPattern.demo2.tire.ITire;

/**
 * Created by chenhangye on 2017/1/31.
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     */

    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     * @return
     */

    public abstract IBrake createBrake();


}
