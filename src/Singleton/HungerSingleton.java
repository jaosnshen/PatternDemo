package Singleton;

/**
 * Created by chenhangye on 2017/1/30.
 */
public class HungerSingleton {
    private static final HungerSingleton CEO=new HungerSingleton();

    public static HungerSingleton getHungerSingleton(){
        return CEO;
    }

}
