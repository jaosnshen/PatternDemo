package IteratorPattern.AbstractIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class Request2 extends AbstractRequest<String> {

    public Request2(String obj) {
        super(obj);
    }

    @Override
    public int getRequstLevel() {
        return 2;
    }
}
