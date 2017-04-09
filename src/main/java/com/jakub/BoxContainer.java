package com.jakub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kacper on 08.03.2017.
 */
public class BoxContainer {

    private List<Box> boxes = new ArrayList<Box>();

    public void addBox (Box box) {

        boxes.add(box);

    }

    public int sumBoxVolume()  {

        int result = 0;

        for (Box box : boxes) {
            result += box.calculateVolume();
        }

        return result;


    }




}
