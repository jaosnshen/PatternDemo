package DecoratorPattern.NormalDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
