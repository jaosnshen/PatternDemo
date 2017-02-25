package CommandPattern.NormalTemplate;

/**
 * Created by chenhangye on 2017/2/2.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
