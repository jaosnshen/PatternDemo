package AbstractFactoryPattern.demo;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class ConcreteFactory2  extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
