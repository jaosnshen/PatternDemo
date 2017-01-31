package AbstractFactoryPattern.demo2.Engine;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
