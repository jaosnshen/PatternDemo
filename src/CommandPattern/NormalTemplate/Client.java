package CommandPattern.NormalTemplate;

/**
 * Created by chenhangye on 2017/2/2.
 */
public class Client {
    public static void main(String[] args){
        Receiver receiver=new Receiver();

        Command command=new ConcreteCommand(receiver);

        Invoker invoker=new Invoker(command);

        invoker.action();

    }
}
