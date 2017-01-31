package IteratorPattern.ConcreteIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public abstract class Handler<T> {
   protected Handler successor;

   public abstract void handleRequest(T t);

}
