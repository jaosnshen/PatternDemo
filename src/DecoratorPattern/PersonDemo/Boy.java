package DecoratorPattern.PersonDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class Boy extends Person {
    @Override
    public void dressed() {
        System.out.printf("穿了内衣内裤");
    }
}
