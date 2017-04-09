package com.jakub;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kacper on 08.03.2017.
 */
public class TestBoxContainer {

    @Test
    public void addBoxTest(){
        BoxContainer boxContainer = new BoxContainer();
        Box box = new Box(2);
        boxContainer.addBox(box);
        int result = boxContainer.sumBoxVolume();
        Assert.assertEquals(8, result);
    }


}
