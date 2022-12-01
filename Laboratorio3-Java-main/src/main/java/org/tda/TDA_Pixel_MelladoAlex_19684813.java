package org.tda;

//Clase abstracta para derivar los contenidos de ella
//De los cuales son X, Y, D
//Posse su constructor para crear los Pixeles que son heredados a los pixeles creados
abstract class TDA_Pixel_MelladoAlex_19684813 {

    int x;
    int y;
    int d;
    public TDA_Pixel_MelladoAlex_19684813(int x, int y, int d) {
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
