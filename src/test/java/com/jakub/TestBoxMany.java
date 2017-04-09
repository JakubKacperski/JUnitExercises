package com.jakub;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Kacper on 08.03.2017.
 */


@RunWith(Parameterized.class)




public class TestBoxMany {

    @Parameterized.Parameter(value = 0)
    public int a;
    @Parameterized.Parameter(value = 1)
    public int b;
    @Parameterized.Parameter(value = 2)
    public int c;





    @Test
    public void calculateVolumeTest() {
        Box box = new Box();
        box.setA(a);
        box.setB(b);
        box.setC(c);
        int result = box.calculateVolume();

        Assert.assertEquals(a*b*c, result);

    }

    @Test
    public void calculateVolueByConstructorTest() {
        Box box = new Box(a,b,c);

        int result = box.calculateVolume();

        Assert.assertEquals(a*b*c, result);

    }

    @Test
    public void calculateVolueByConstrutorBoxTest() {
        Box box = new Box(a);

        int result = box.calculateVolume();

        Assert.assertEquals(a*a*a, result);

    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2, 4 }, { 5, 3, 8 }, { 121, 4, 23 }, {20, 45, 82 } };
        return Arrays.asList(data);
    }

}
