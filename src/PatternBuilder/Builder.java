package PatternBuilder;

/**
 * Created by chenhangye on 2017/1/30.
 */
public abstract class Builder {
    public abstract MacbookBuilder buildBoard(String board);
    public abstract MacbookBuilder buildDisplay(String display);
    public abstract MacbookBuilder buildOS();
    public abstract Computer creater();
}
