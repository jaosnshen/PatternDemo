package DecoratorPattern.NormalDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();

        super.operate();

        operateB();
    }

    private void operateB() {
        System.out.println("BBB");
    }

    private void operateA() {
        System.out.println("AAA");
    }
}
