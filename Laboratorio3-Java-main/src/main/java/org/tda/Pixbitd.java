package org.tda;


//TDA pixbit-d
//Dom: X(int) X Y(int) X Bit(0 o 1) X Depth(int)
//Recorrido: Pixel de tipo pixbit-d

//Constructor Pixbitd
public class Pixbitd extends Pixeles{

    int bit;
    public Pixbitd(int x, int y, int d, int bit){
        super(x,y,d);
        this.bit = bit;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    @Override
    public String toString() {
        return "Pixbitd{" +
                "bit=" + bit +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }


    public boolean isABitmap(){
        if(bit == 0 || bit == 1){
            return true;
        }else{
            return false;
        }
    }
}