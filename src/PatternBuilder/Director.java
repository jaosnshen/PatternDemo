package PatternBuilder;

/**
 * Created by chenhangye on 2017/1/30.
 */
public class Director {
    Builder builder=null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOS();
    }
}
