package IteratorPattern.AbstractIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.printf("Handler2 "+request.getRequstLevel());
    }
}
