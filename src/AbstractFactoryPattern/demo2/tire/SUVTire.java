package AbstractFactoryPattern.demo2.tire;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class SUVTire implements ITire{
    @Override
    public void tire() {
        System.out.printf("越野轮胎");
    }
}
