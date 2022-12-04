package org.tda;

//Constructor Pixhexd
//Contiene el string hex
//Dom: int X, int Y, int D, String Hex
//Rec: Pixhexd

public class TDA_Pixhexd_MelladoAlex_19684813 extends TDA_Pixel_MelladoAlex_19684813 {
    String hex;
    public TDA_Pixhexd_MelladoAlex_19684813(int x, int y, int d, String hex) {
        super(x, y, d);
        this.hex = hex;
    }
    //Selectores y setters para un pixhex
    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Pixhexd{" +
                "x='" + x + '\'' +
                ", y=" + y +
                ", hex=" + hex +
                ", d=" + d +
                '}';
    }

}