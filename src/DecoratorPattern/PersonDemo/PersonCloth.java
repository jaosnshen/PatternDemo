package DecoratorPattern.PersonDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public abstract class PersonCloth extends Person {
    protected Person mPerson;


    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }


    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
