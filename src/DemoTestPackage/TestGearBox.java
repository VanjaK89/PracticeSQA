package DemoTestPackage;

import org.junit.Assert;
import org.junit.Test;

public class TestGearBox {

    @Test
    public void testShiftUpWhenHighRPM(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;

        //execute
        gearBox.shiftGear(2500);

        //validate
        Assert.assertEquals(4, gearBox.gear);
    }
    @Test
    public void testShiftDownWhenHighRPM(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;

        //execute
        gearBox.shiftGear(400);

        //validate
        Assert.assertEquals(2, gearBox.gear);
    }
    @Test
    public void testNoShiftDownInGearOne(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 1;

        //execute
        gearBox.shiftGear(400);

        //validate
        Assert.assertEquals(1, gearBox.gear);
    }
    @Test
    public void testNoShiftUpInGearSix(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 6;

        //execute
        gearBox.shiftGear(2500);

        //validate
        Assert.assertEquals(6, gearBox.gear);
    }
    @Test
    public void testRemainInNeutral(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 0;

        //execute
        gearBox.shiftGear(2500);

        //validate
        Assert.assertEquals(0, gearBox.gear);
    }

    @Test
    public void testRemainInCurrentGear(){
        //setup
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;

        //execute
        gearBox.shiftGear(1500);

        //validate
        Assert.assertEquals(3, gearBox.gear);
    }


}
