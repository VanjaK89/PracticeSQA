package DemoTestPackage;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {

    //this test case does  not show the fault
    @Test
    public void whenNullThrowException()throws NullPointerException{
        int[]arrayZero = {};
        Assert.assertEquals(-1, FaultTwo.findLast(arrayZero, 0));
    }
    //this test case does  not show the fault
    @Test
    public void testIfNumberIsAtTheLastPos(){
        int[]array = {1, 2, 3, 4, 5};
        Assert.assertEquals(4, FaultTwo.findLast(array, 5));
    }
    //this test case shows the fault
    @Test
    public void testIfNumberAtFirstPos(){
        int[]array = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(0, FaultTwo.findLast(array, 1));
    }
    @Test
    public void testNumberIntheMiddle(){
        int[]array = {1, 2, 3, 4, 5};
        Assert.assertEquals(2, FaultTwo.findLast(array, 3));
    }

    @Test
    public void testIfItThrowsExceptionForNull(){
        int[]array = {1, 2, 0, 3, 4, 5};
        Assert.assertEquals(2, FaultTwo.findLast(array, 0));
    }
    @Test
    public void testTheNegativeNumbers(){
        int[]array = {-1, -2, -3, -5};
        Assert.assertEquals(1, FaultTwo.findLast(array, -2));
    }
}
