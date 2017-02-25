package InterpreterPattern;

/**
 * Created by chenhangye on 2017/2/1.
 */
public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret()+exp2.interpret();
    }
}
