package InterpreterPattern;

/**
 * Created by chenhangye on 2017/2/1.
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * 具体的解析逻辑由子类实现
     * @return  解析得到具体的值
     */
   public abstract int interpret();
}
