package PatternBuilder;

/**
 * Created by chenhangye on 2017/1/30.
 */
public class MacbookBuilder extends Builder {

    private Computer computer=null;

    public MacbookBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public MacbookBuilder buildBoard(String board) {
     computer.setmBoard(board);
     return this;
    }

    @Override
    public MacbookBuilder buildDisplay(String display) {
    computer.setmDisplay(display);
        return this;
    }

    @Override
    public MacbookBuilder buildOS() {
      computer.setmOs();
        return this;
    }

    @Override
    public Computer creater() {
        return computer;
    }

}
