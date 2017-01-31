package AbstractFactoryPattern.demo2.brake;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
