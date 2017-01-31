package Singleton;

/**
 new实例化对象的时候 并不是原子操作 可能会出错
 * Created by chenhangye on 2017/1/30.

 */

public class DCLSingleton {
    private volatile static DCLSingleton singleton=null;

    public DCLSingleton() {
    }

    public static DCLSingleton getSingleton(){
        if (singleton==null){
            synchronized (DCLSingleton.class){
                if (singleton==null){
                    singleton=new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
