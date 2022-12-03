package org.tda;

import java.util.List;
//Constructor imagen
//Obedece a la estructura implementada en operaciones con una imagen
//Dom: Largo X Ancho X listadePixeles
//Rec: Imagen
public class TDA_Imagen_MelladoAlex_19684813 implements TDA_OperacionesConUnaImagen_MelladoAlex_19684813 {
    int Largo;
    int Ancho;
    List<TDA_Pixel_MelladoAlex_19684813> pixeleslist;

    public TDA_Imagen_MelladoAlex_19684813(int Largo, int Ancho, List<TDA_Pixel_MelladoAlex_19684813> pixeleslist) {
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

    public List<TDA_Pixel_MelladoAlex_19684813> getPixeleslist() {
        return pixeleslist;
    }

    public void setPixeleslist(List<TDA_Pixel_MelladoAlex_19684813> pixeleslist) {
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

    //Funcion que verifica si es un pixmap
    //Dom: No recibe nada como dom
    //Rec: Un booleano

    @Override
    public void isPixmap() {
        for (TDA_Pixel_MelladoAlex_19684813 pixel : pixeleslist) {
            System.out.println(pixel instanceof TDA_Pixrgbd_MelladoAlex_19684813);
        }
    }
    //Funcion que verifica si es un Bitmap
    //Dom: No recibe nada
    //Rec: Comprobar si un pixel es del tipo bit

    @Override
    public void isBitmap() {
        for (TDA_Pixel_MelladoAlex_19684813 pixel : pixeleslist) {
            System.out.println(pixel instanceof TDA_Pixbitd_MelladoAlex_19684813);
        }
    }
    //Pertenencia hexmap
    //Dom: No recibe nada
    //Rec: Pertenencia para un hexmap, y saber si es el tipo de pixel

    @Override
    public void isHexmap() {
        for (TDA_Pixel_MelladoAlex_19684813 pixel : pixeleslist) {
            System.out.println(pixel instanceof TDA_Pixhexd_MelladoAlex_19684813);
        }
    }
}







