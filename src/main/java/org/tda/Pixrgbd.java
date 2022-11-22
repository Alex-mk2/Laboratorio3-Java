package org.tda;

public class Pixrgbd extends Pixeles{
    int R;
    int G;
    int B;
    public Pixrgbd(int x, int y, int d, int R, int G, int B) {
        super(x, y, d);
        this.R = R;
        this.G = G;
        this.B = B;
    }

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
                "R=" + R +
                ", G=" + G +
                ", B=" + B +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}