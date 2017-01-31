package FactoryPattern;

/**
 * Created by chenhangye on 2017/1/30.
 */
public abstract class Factory {
   public abstract <T extends Product> T createProduct(Class<T> clz);
}
