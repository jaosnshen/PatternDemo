package CommandPattern.NormalTemplate;

/**
 * Created by chenhangye on 2017/2/2.
 */
public class Receiver {

    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action(){
        System.out.printf("执行具体操作");
    }
}
