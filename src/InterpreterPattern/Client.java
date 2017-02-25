package InterpreterPattern;

/**
 * Created by chenhangye on 2017/2/1.
 */
public class Client {
    public static void main(String[] args) {
        Calculator c=new Calculator("21 + 21");
        System.out.println(c.calculate());
    }
}
