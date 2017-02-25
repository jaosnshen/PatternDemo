package DecoratorPattern.NormalDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("随便做");
    }
}
