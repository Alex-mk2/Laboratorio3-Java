package org.tda;

import java.util.List;

public class Imagen implements OperacionesConUnaImagen{
    int Largo;
    int Ancho;
    List<Pixeles> pixeleslist;

    public Imagen(int Largo, int Ancho, List<Pixeles> pixeleslist){
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.pixeleslist = pixeleslist;
    }


    public int getLargo() {
        return Largo;
    }

    public void setLargo(int largo) {
        Largo = largo;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public List<Pixeles> getPixeleslist() {
        return pixeleslist;
    }

    public void setPixeleslist(List<Pixeles> pixeleslist) {
        this.pixeleslist = pixeleslist;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "Largo=" + Largo +
                ", Ancho=" + Ancho +
                ", pixeleslist=" + pixeleslist +
                '}';
    }
}
