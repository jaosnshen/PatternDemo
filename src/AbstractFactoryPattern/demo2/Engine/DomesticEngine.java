package AbstractFactoryPattern.demo2.Engine;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
