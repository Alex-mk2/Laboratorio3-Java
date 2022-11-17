package org.Imagen;

public class Pixhexd{
    public Pixhexd(int x, int y, char hex, int d) {
        this.x = x;
        this.y = y;
        Hex = hex;
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

    public char getHex() {
        return Hex;
    }

    public void setHex(char hex) {
        Hex = hex;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    @Override
    public String toString() {
        return "Pixhexd{" +
                "x=" + x +
                ", y=" + y +
                ", Hex=" + Hex +
                ", D=" + D +
                '}';
    }

    private int x;
    private int y;
    private char Hex;
    private int D;
}
