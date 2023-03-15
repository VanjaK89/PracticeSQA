package DemoTestPackage;

public class GearBox {

    final int max_rpm = 2000;
    final int min_rpm = 500;
    final int rpm = 0;
    final int neutral_gear = 0;
    int gear = neutral_gear;
    final int max_gear = 6;
    final int min_gear = 1;


    public void shiftGear(int rpm) {
        if (gear <= neutral_gear) {
            return;
        }
        if(rpmTooHigh(rpm) && shouldShiftUp()){
            gear++;
        }
        if(shouldShiftDown(rpm)){
            gear--;
        }


    }
    private boolean shouldShiftDown(int rpm){
        return rpm < min_rpm && gear > min_gear;
    }
    private boolean shouldShiftUp(){
        return gear < max_gear;
    }
    private boolean rpmTooHigh(int rpm){
        return rpm > max_rpm;
    }
}
