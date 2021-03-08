package com.knoldus;
import org.junit.Assert;
import org.junit.Test;

public class MaxOfTwoElementsTest {

    @Test
    public void getMaxOfTwoElementsTest(){
    int actualOutput1 = MaxOfTwoElements.getMaxOfTwoElements(0,1);
    Assert.assertEquals(1,actualOutput1);

        int actualOutput2 = MaxOfTwoElements.getMaxOfTwoElements(25,75);
        Assert.assertEquals(75,actualOutput2);

        int actualOutput3 = MaxOfTwoElements.getMaxOfTwoElements(123456789,1);
        Assert.assertEquals(123456789,actualOutput3);

        int actualOutput4 = MaxOfTwoElements.getMaxOfTwoElements(0,0);
        Assert.assertEquals(0,actualOutput4);
    }
}