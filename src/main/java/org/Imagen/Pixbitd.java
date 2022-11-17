package org.Imagen;


//TDA pixbit-d
//Dom: X(int) X Y(int) X Bit(0 o 1) X Depth(int)
//Recorrido: Pixel de tipo pixbit-d

public class Pixbitd{
    public Pixbitd(int x, int y, int bit, int depth) {
        this.x = x;
        this.y = y;
        Bit = bit;
        Depth = depth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBit() {
        return Bit;
    }

    public void setBit(int bit) {
        Bit = bit;
    }

    public int getDepth() {
        return Depth;
    }

    public void setDepth(int depth) {
        Depth = depth;
    }

    @Override
    public String toString() {
        return "Pixbitd{" +
                "x=" + x +
                ", y=" + y +
                ", Bit=" + Bit +
                ", Depth=" + Depth +
                '}';
    }

    private int x;
    private int y;
    private int Bit;
    private int Depth;

}
