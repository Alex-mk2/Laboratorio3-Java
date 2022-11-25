package org.tda;

//Constructor Pixhexd
//Contiene el string hex
//Dom: int X, int Y, int D, String Hex
//Rec: Pixhexd

public class Pixhexd extends Pixeles{
    String hex;
    public Pixhexd(int x, int y, int d, String hex) {
        super(x, y, d);
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Pixhexd{" +
                "hex='" + hex + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
    public boolean isAhexmap(){

        return false;
    }
}