package org.tda;

//Funcion Pixrgbd
//Dom: int X, int Y, int D, int R, int G, int R
//Rec: Pixrgbd
//Constructor Pixrgbd
public class TDA_Pixrgbd_MelladoAlex_19684813 extends TDA_Pixel_MelladoAlex_19684813 {
    int R;
    int G;
    int B;
    public TDA_Pixrgbd_MelladoAlex_19684813(int x, int y, int d, int R, int G, int B) {
        super(x, y, d);
        this.R = R;
        this.G = G;
        this.B = B;
    }
    //Selectores para un pixrgb y setters.
    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
    @Override
    public String toString() {
        return "Pixrgbd{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + R +
                ", g=" + G +
                ", b=" + B +
                ", d=" + d +
                '}';
    }

}