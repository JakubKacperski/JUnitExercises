package com.jakub;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kacper on 08.03.2017.
 */
public class TestBox {

    @Test
    public void calculateVolueTest() {
        Box box = new Box();
        box.setA(2);
        box.setB(2);
        box.setC(6);
        int result = box.calculateVolume();

        Assert.assertEquals(24, result);

    }

    @Test
    public void calculateVolueByConstructorTest() {
        Box box = new Box(2,2,6);

        int result = box.calculateVolume();

        Assert.assertEquals(24, result);

    }

    @Test
    public void calculateVolueByConstrutorBoxTest() {
        Box box = new Box(2);

        int result = box.calculateVolume();

        Assert.assertEquals(8, result);

    }

}
