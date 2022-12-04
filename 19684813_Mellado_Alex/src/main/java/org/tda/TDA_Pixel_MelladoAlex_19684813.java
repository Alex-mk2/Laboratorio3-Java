package org.tda;

//Clase abstracta para derivar los contenidos de ella
//De los cuales son X, Y, D
//Posse su constructor para crear los Pixeles que son heredados a los pixeles creados como pixbit, pixrgb y pixhex
abstract class TDA_Pixel_MelladoAlex_19684813 {

    int x;
    int y;
    int d;
    //Constructor Pixel, contiene los elementos X, Y y la profundidad de los pixeles a diseñar
    public TDA_Pixel_MelladoAlex_19684813(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
    //Selectores y setters para un pixel de clase abstracta que será heredado para los otros pixeles
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
