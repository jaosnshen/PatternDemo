package Singleton;

/**
 * 静态内部类单例模式
 *
 * Created by chenhangye on 2017/1/30.
 */
public class StaticSingleton {
    private StaticSingleton(){}
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.sInstance;
    }

    private static class StaticSingletonHolder{
        private static final StaticSingleton sInstance=new StaticSingleton();
    }

}
