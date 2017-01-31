package IteratorPattern.AbstractIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class Request3 extends AbstractRequest<String> {

    public Request3(String obj) {
        super(obj);
    }

    @Override
    public int getRequstLevel() {
        return 3;
    }
}
