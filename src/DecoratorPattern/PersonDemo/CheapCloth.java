package DecoratorPattern.PersonDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShorts(){
        System.out.printf("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
