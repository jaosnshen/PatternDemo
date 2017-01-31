package IteratorPattern.ConcreteIteratorPattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class ConcreteHandler1 extends Handler<String> {
    @Override
    public void handleRequest(String s) {
        if (s.equals("ConcreteHandler1")){
            System.out.println("s = [" + s + "]");
            return;
        }else{
            successor.handleRequest(s);
        }
    }
}
