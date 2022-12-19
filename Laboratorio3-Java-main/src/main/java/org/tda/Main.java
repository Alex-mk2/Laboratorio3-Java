package org.tda;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;
        //Llamados a la imagen
        //Bitmap, pixmap, hexmap, imagen
        //Y tres listas con las imagenes en bitmap, pixmap, hexmap
        TDA_Pixel_MelladoAlex_19684813 Pixbit = new TDA_Pixbitd_MelladoAlex_19684813(0, 0,20,1);
        TDA_Pixel_MelladoAlex_19684813 Pixbit1 = new TDA_Pixbitd_MelladoAlex_19684813(0, 1,10,0);
        TDA_Pixel_MelladoAlex_19684813 Pixbit2 = new TDA_Pixbitd_MelladoAlex_19684813(1, 0,30,1);
        TDA_Pixel_MelladoAlex_19684813 Pixbit3 = new TDA_Pixbitd_MelladoAlex_19684813(1, 1,40,0);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb = new TDA_Pixrgbd_MelladoAlex_19684813(0,0,10,10,10,10);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb1 = new TDA_Pixrgbd_MelladoAlex_19684813(0,1,20,20,20,20);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb2 = new TDA_Pixrgbd_MelladoAlex_19684813(1,0,30,30,30,30);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb3 = new TDA_Pixrgbd_MelladoAlex_19684813(1,1,40,40,40,40);
        TDA_Pixel_MelladoAlex_19684813 Pixhex = new TDA_Pixhexd_MelladoAlex_19684813(0,0,10,"#FF5733");
        TDA_Pixel_MelladoAlex_19684813 Pixhex1 = new TDA_Pixhexd_MelladoAlex_19684813(0,1,20,"#F08080");
        TDA_Pixel_MelladoAlex_19684813 Pixhex2 = new TDA_Pixhexd_MelladoAlex_19684813(1,0,30,"#FA8072");
        TDA_Pixel_MelladoAlex_19684813 Pixhex3 = new TDA_Pixhexd_MelladoAlex_19684813(1,1,40,"#FF5733");
        TDA_Pixel_MelladoAlex_19684813 Pixbit4 = new TDA_Pixbitd_MelladoAlex_19684813(0, 0,20,1);
        TDA_Pixel_MelladoAlex_19684813 Pixbit5 = new TDA_Pixbitd_MelladoAlex_19684813(0, 1,10,0);
        TDA_Pixel_MelladoAlex_19684813 Pixbit6 = new TDA_Pixbitd_MelladoAlex_19684813(1, 0,30,1);
        TDA_Pixel_MelladoAlex_19684813 Pixbit7 = new TDA_Pixbitd_MelladoAlex_19684813(1, 1,40,0);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb4 = new TDA_Pixrgbd_MelladoAlex_19684813(0,0,10,10,10,10);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb5 = new TDA_Pixrgbd_MelladoAlex_19684813(0,1,20,20,20,20);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb6 = new TDA_Pixrgbd_MelladoAlex_19684813(1,0,30,30,30,30);
        TDA_Pixel_MelladoAlex_19684813 Pixrgb7 = new TDA_Pixrgbd_MelladoAlex_19684813(1,1,40,40,40,40);
        TDA_Pixel_MelladoAlex_19684813 Pixhex4 = new TDA_Pixhexd_MelladoAlex_19684813(0,0,10,"#FF5733");
        TDA_Pixel_MelladoAlex_19684813 Pixhex5 = new TDA_Pixhexd_MelladoAlex_19684813(0,1,20,"#F08080");
        TDA_Pixel_MelladoAlex_19684813 Pixhex6 = new TDA_Pixhexd_MelladoAlex_19684813(1,0,30,"#FA8072");
        TDA_Pixel_MelladoAlex_19684813 Pixhex7 = new TDA_Pixhexd_MelladoAlex_19684813(1,1,40,"#FF5733");
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist = new ArrayList<>();//Se crea una lista de pixeles para almacenarlos para bitmap
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist2 = new ArrayList<>();//Hexmap
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist3 = new ArrayList<>();//Pixmap
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist4 = new ArrayList<>();//bitmap1
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist5 = new ArrayList<>();//Hexmap1
        List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist6 = new ArrayList<>();//Pixmap1
        Pixeleslist.add(Pixbit);
        Pixeleslist.add(Pixbit1);
        Pixeleslist.add(Pixbit2);
        Pixeleslist.add(Pixbit3);
        Pixeleslist2.add(Pixhex);
        Pixeleslist2.add(Pixhex1);
        Pixeleslist2.add(Pixhex2);
        Pixeleslist2.add(Pixhex3);
        Pixeleslist3.add(Pixrgb);
        Pixeleslist3.add(Pixrgb1);
        Pixeleslist3.add(Pixrgb2);
        Pixeleslist3.add(Pixrgb3);
        Pixeleslist4.add(Pixbit4);
        Pixeleslist4.add(Pixbit5);
        Pixeleslist4.add(Pixbit6);
        Pixeleslist4.add(Pixbit7);
        Pixeleslist5.add(Pixhex4);
        Pixeleslist5.add(Pixhex5);
        Pixeleslist5.add(Pixhex6);
        Pixeleslist5.add(Pixhex7);
        Pixeleslist6.add(Pixrgb4);
        Pixeleslist6.add(Pixrgb5);
        Pixeleslist6.add(Pixrgb6);
        Pixeleslist6.add(Pixrgb7);
        TDA_Imagen_MelladoAlex_19684813 bitmap = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist);
        TDA_Imagen_MelladoAlex_19684813 Hexmap = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist2);
        TDA_Imagen_MelladoAlex_19684813 pixmap = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist3);
        TDA_Imagen_MelladoAlex_19684813 bitmap1 = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist4);
        TDA_Imagen_MelladoAlex_19684813 Hexmap1 = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist5);
        TDA_Imagen_MelladoAlex_19684813 pixmap1= new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist6);
        //Nota: Se creo una segunda imagen con los mismos parametros para verificar los flip y su correcto funcionamiento
        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    //Verificar una imagen
                    System.out.println(bitmap);
                    System.out.println(Hexmap);
                    System.out.println(pixmap);
                    Hexmap.isHexmap(); //Pertenencias para un hexmap, bitmap y pixmap
                    bitmap.isBitmap(); //Devuelve verdadero o falso según lo que sea la imagen
                    pixmap.isPixmap(); //Pertenencia pixmap, para el caso de las pertenencias se dejo con casos verdaderos
                    bitmap.isHexmap(); //Ejemplo de caso falso
                    pixmap.isBitmap(); //Caso falso para pixmap
                    Hexmap.isPixmap();//Caso falso para hexmap
                    bitmap.IsCompress(); //IsCompress para un bitmap
                    Hexmap.IsCompress(); //IsCompress para un hexmap
                    pixmap.IsCompress(); //IsCompress para un pixmap
                    break;

                case 2:
                    //Modificaciones en una imagen
                    //Hacer un flipH en bitmap, pixmap y hexmap
                    bitmap.flipH();
                    pixmap.flipH();
                    Hexmap.flipH();
                    System.out.println(bitmap);
                    System.out.println(pixmap);
                    System.out.println(Hexmap);
                    System.out.println("------------------FlipH-----------------------------");


                    bitmap1.flipV();
                    pixmap1.flipV();
                    Hexmap1.flipV();
                    System.out.println(bitmap1);
                    System.out.println(pixmap1);
                    System.out.println(Hexmap1);
                    System.out.println("-------------------FlipV-----------------------------");



                    bitmap.crop(1,1,1,1);
                    pixmap.crop(1,1,1,1);
                    Hexmap.crop(1,1,1,1);
                    bitmap1.crop(2,2,2,2);
                    pixmap1.crop(2,2,2,2);
                    Hexmap1.crop(2,2,2,2);
                    System.out.println(bitmap);
                    System.out.println(pixmap);
                    System.out.println(Hexmap);
                    System.out.println("--------------------Crop------------------------------");
                    //Nota: Como la funcion crop corta, al ejecutarse por segunda vez esta instruccion
                    //Devolvera una lista vacia, ya que la lista fue recortada, por lo cual, se debe volver
                    //A ejecutar el programa
                    break;

                case 3:

                    break;

                case 4:
                    //do something
                    break;

                case 5:
                    System.out.println("Ha decidido salir del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("Main Menu\n");
        System.out.print("1. Crear Imagen y verificar pertenencias\n");
        System.out.print("2. Modificar una imagen.\n");
        System.out.print("3. No implementado por el momento.\n");
        System.out.print("4. Alguna opción para elegir.\n");
        System.out.print("5. Salir del programa\n");
        System.out.print("\nEnter your choice: ");
    }
}