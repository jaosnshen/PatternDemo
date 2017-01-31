package StatePattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public interface TvState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
