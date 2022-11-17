package org.Imagen;

public class Pixrgbd{
    public Pixrgbd(int x, int y, int r, int g, int b, int d) {
        this.x = x;
        this.y = y;
        R = r;
        G = g;
        B = b;
        D = d;
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

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    @Override
    public String toString() {
        return "Pixrgbd{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                ", G=" + G +
                ", B=" + B +
                ", D=" + D +
                '}';
    }

    private int x;
    private int y;
    private int R;
    private int G;
    private int B;
    private int D;
}
