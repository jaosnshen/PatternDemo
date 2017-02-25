package DecoratorPattern.PersonDemo;

/**
 * Created by chenhangye on 2017/2/25.
 */
public class Main {
    public static void main(String[] args){
        Person person=new Boy();

        //然后为他穿上便宜的衣服，比如爱哥这样的boy
        PersonCloth clothCheap=new CheapCloth(person);
        clothCheap.dressed();

        PersonCloth clothExpensive=new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
