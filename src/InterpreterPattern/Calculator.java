package InterpreterPattern;

import java.util.Stack;

/**
 * Created by chenhangye on 2017/2/1.
 */
public class Calculator {

    private Stack<ArithmeticExpression> mExpStack=new Stack<>();

    public Calculator(String expression){
        ArithmeticExpression exp1,exp2;

        String[] elements=MidExpress2behindeExpress(expression).toString().split(" ");

        for (int i = 0; i < elements.length; i++) {
            if (elements[i]==""){
                continue;
            }
            switch (elements[i].charAt(0)){
                case '+':
                    exp1=mExpStack.pop();
                    exp2=mExpStack.pop();
                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 最终计算结果
     * @return
     */
    public int calculate(){
        return mExpStack.pop().interpret();
    }


    /**
     * 中缀转后缀
     * @param expression
     * @return
     */

    public StringBuffer MidExpress2behindeExpress(String expression){
         Stack<String> numStack=new Stack<>();
         Stack<String> OpStack=new Stack<>();
         String[] elements=expression.split(" ");


        for (int i = 0; i < elements.length; i++) {
            char num=elements[i].charAt(0);
            if (num=='+'||num=='-'||num=='*'||num=='/'||num=='('||num==')'){
                if (num==')'){
                    String op=OpStack.pop();
                    while(op!="("){
                        numStack.push(op);
                        op=OpStack.pop();
                    }
                 }else{
                    OpStack.push(elements[i]);
                }
            }else{
               numStack.push(elements[i]);
            }
        }
        StringBuffer sb =new StringBuffer();
        while(!OpStack.empty()){
            numStack.push(OpStack.pop());
        }
        while(!numStack.empty()){
          //  System.out.printf(""+numStack.pop());
            sb.append(numStack.pop()+" ");
//            +=numStack.pop()+" ";
        }



        return sb.reverse();
    }
}
