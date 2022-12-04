package org.tda;


//TDA pixbit-d
//Dom: X(int) X Y(int) X Bit(0 o 1) X Depth(int)
//Recorrido: Pixel de tipo pixbit-d

//Constructor Pixbitd
public class TDA_Pixbitd_MelladoAlex_19684813 extends TDA_Pixel_MelladoAlex_19684813 {

    int bit;
    public TDA_Pixbitd_MelladoAlex_19684813(int x, int y, int d, int bit){
        super(x,y,d);
        this.bit = bit;
    }
    //Selectores pixbit y setters
    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    @Override
    public String toString() {
        return "Pixbitd{" +
                "x=" + x +
                ", y=" + y +
                ", bit=" + bit +
                ", d=" + d +
                '}';
    }
}