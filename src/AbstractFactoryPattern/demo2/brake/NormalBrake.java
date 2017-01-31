package AbstractFactoryPattern.demo2.brake;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.printf("普通制动");
    }
}
