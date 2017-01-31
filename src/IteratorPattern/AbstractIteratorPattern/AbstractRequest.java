package IteratorPattern.AbstractIteratorPattern;

import java.util.Objects;

/**
 * Created by chenhangye on 2017/1/31.
 */
public abstract class AbstractRequest<T> {
    private T t;

    public AbstractRequest(T obj) {
        this.t = obj;
    }

    /**
     * 具体内容对象
     * @return
     */
    public T getContent(){
        return t;
    }

    /**
     * 获取请求级别
     * @return
     */
    public abstract int getRequstLevel();
}
