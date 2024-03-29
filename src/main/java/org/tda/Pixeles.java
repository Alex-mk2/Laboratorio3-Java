package org.tda;

abstract class Pixeles{

    int x;
    int y;
    int d;
    public Pixeles(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
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

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Pixeles{" +
                "x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }

}
