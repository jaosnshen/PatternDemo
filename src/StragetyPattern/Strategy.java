package StragetyPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class Strategy {
    private CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }


    public int calculatePrice(int km){
        return calculateStrategy.calculatePrice(km);
    }
}
