package StragetyPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal=km-10;
        int extraFactor=extraTotal/5;
        int fraction=extraTotal%5;
        int price=1+extraFactor*1;
        return fraction>0?++price:price;
    }
}
