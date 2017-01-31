package PatternBuilder;

/**
 * Created by chenhangye on 2017/1/30.
 */
public abstract class Computer {
   protected String mBoard;
   protected String mDisplay;
   protected String mOs;

    public Computer() {
    }


    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOs();


    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
