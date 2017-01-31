package StatePattern;

/**
 * Created by chenhangye on 2017/1/31.
 */
public class TvController implements PowerController{

    TvState mTvState;

    public void setmTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机啦");

    }

    @Override
    public void powerOff() {
     setmTvState(new PowerOffState());
        System.out.println("关机啦");
    }


    public void nextChannel() {
        mTvState.nextChannel();
    }


    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
//    private static final int POWER_ON=1;
//    private static final int POWER_OFF=2;
//
//    private int mState=POWER_OFF;
//
//
//    public void powerOn(){
//        mState=POWER_ON;
//        if (mState==POWER_OFF){
//            System.out.println("开机啦");
//        }
//    }
//
//    public void powerOff(){
//        mState=POWER_OFF;
//        if (mState==POWER_ON){
//            System.out.printf("关机啦");
//        }
//    }
//
//    public void nextChannel(){
//    }

}
