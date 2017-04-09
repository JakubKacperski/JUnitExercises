package com.jakub;

/**
 * Created by Kacper on 08.03.2017.
 */
public class Box {

    public Box(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Box(int a){
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Box(){
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int a;
    private int b;
    private int c;

    public int calculateVolume () {

        return a*b*c;

    }




}
