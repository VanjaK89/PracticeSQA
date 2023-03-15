package DemoTestPackage;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultOne {

    @Test
    public void testHowManyZeroAreThere(){
        int[]arrayzero = {1, 0, 2, 0, 3, 5, 0};

        Assert.assertEquals(3, FaultOne.numZero(arrayzero) );
    }

    @Test
    public void testIfNoZeroAppear(){
        int[]arrayzero = {1, 2, 3, 4, 5, 6};

        Assert.assertEquals(0, FaultOne.numZero(arrayzero));
    }
    @Test
    public void testIfZeroAtLastPos(){
        int[]arrayZero = {1, 2, 3, 4, 5, 0};

        Assert.assertEquals(1, FaultOne.numZero(arrayZero));
    }

    @Test
    public void testIfZeroAtFirstPos(){
        int[]arrayZero = {0, 1, 2, 3, 4, 5};

        Assert.assertEquals(1, FaultOne.numZero(arrayZero));
    }
    @Test
    public void testIfEmptyArray()throws NullPointerException{
        int[]arrayZero = {};

        Assert.assertEquals(0, FaultOne.numZero(arrayZero));
    }
}
