package DecoratorPattern.NormalDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class Client {
    public static void main(String[] args){
        Component component=new ConcreteComponent();

        Decorator decorator=new ConcreteDecoratorA(component);

        decorator.operate();



    }
}
