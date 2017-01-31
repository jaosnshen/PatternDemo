package AbstractFactoryPattern.demo;

/**
 * Created by chenhangye on 2017/1/31.
 */
public abstract class AbstractFactory {
    /**
     *
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     *
     * @return
     */

    public abstract AbstractProductB createProductB();

}
