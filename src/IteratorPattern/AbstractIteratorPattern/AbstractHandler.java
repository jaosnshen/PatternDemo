package IteratorPattern.AbstractIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    /**
     * 处理请求  final
     * @param request
     */
    public final void handlerRequest(AbstractRequest request){
        if (getHandlerLevel()==request.getRequstLevel()){
            handle(request);
        }else{
            if (nextHandler!=null){
                nextHandler.handle(request);
            }else{
                System.out.println("abstractHandler = [" + request + "]");
            }
        }
    }
    /**
     * 获取处理者对象
     * @return
     */
    protected abstract int getHandlerLevel();
    /**
     * 请求
     * @param request
     */

    protected abstract void  handle(AbstractRequest request);
}
