package IteratorPattern.AbstractIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.printf("Handler3 "+request.getRequstLevel());

    }
}
