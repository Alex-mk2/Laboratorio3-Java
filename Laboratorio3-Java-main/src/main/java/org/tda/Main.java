package org.tda;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    //Crear una imagen en base a los pixeles que se tienen a continuación
                    TDA_Pixel_MelladoAlex_19684813 Pixbit = new TDA_Pixbitd_MelladoAlex_19684813(2, 2,20,1);
                    TDA_Pixel_MelladoAlex_19684813 Pixbit1 = new TDA_Pixbitd_MelladoAlex_19684813(2, 2,10,0);
                    TDA_Pixel_MelladoAlex_19684813 Pixbit2 = new TDA_Pixbitd_MelladoAlex_19684813(2, 2,30,1);
                    TDA_Pixel_MelladoAlex_19684813 Pixbit3 = new TDA_Pixbitd_MelladoAlex_19684813(2, 2,40,0);
                    TDA_Pixel_MelladoAlex_19684813 Pixrgb = new TDA_Pixrgbd_MelladoAlex_19684813(2,2,10,10,10,10);
                    TDA_Pixel_MelladoAlex_19684813 Pixrgb1 = new TDA_Pixrgbd_MelladoAlex_19684813(2,2,20,20,20,20);
                    TDA_Pixel_MelladoAlex_19684813 Pixrgb2 = new TDA_Pixrgbd_MelladoAlex_19684813(2,2,30,30,30,30);
                    TDA_Pixel_MelladoAlex_19684813 Pixrgb3 = new TDA_Pixrgbd_MelladoAlex_19684813(2,2,40,40,40,40);
                    TDA_Pixel_MelladoAlex_19684813 Pixhex = new TDA_Pixhexd_MelladoAlex_19684813(2,2,10,"#FF5733");
                    TDA_Pixel_MelladoAlex_19684813 Pixhex1 = new TDA_Pixhexd_MelladoAlex_19684813(2,2,20,"#F08080");
                    TDA_Pixel_MelladoAlex_19684813 Pixhex2 = new TDA_Pixhexd_MelladoAlex_19684813(2,2,30,"#FA8072");
                    TDA_Pixel_MelladoAlex_19684813 Pixhex3 = new TDA_Pixhexd_MelladoAlex_19684813(2,2,40,"#FF5733");
                    List<TDA_Pixel_MelladoAlex_19684813> Pixeleslist = new ArrayList<>();
                    Pixeleslist.add(Pixhex);
                    Pixeleslist.add(Pixhex1);
                    Pixeleslist.add(Pixhex2);
                    Pixeleslist.add(Pixhex3);
                    TDA_Imagen_MelladoAlex_19684813 bitmap = new TDA_Imagen_MelladoAlex_19684813(2, 2, Pixeleslist);
                    bitmap.isBitmap();
                    System.out.println(Pixbit);
                    System.out.println(Pixbit1);
                    System.out.println(Pixbit2);
                    System.out.println(Pixbit3);
                    System.out.println(Pixhex);
                    System.out.println(Pixhex1);
                    System.out.println(Pixhex2);
                    System.out.println(Pixhex3);
                    System.out.println(Pixrgb);
                    System.out.println(Pixrgb1);
                    System.out.println(Pixrgb2);
                    System.out.println(Pixrgb3);
                    break;

                case 2:
                    //Modificaciones con una imagen, aquí se creán procedimientos para modificar una imagen
                    break;

                case 3:

                    break;

                case 4:
                    //do something
                    break;

                case 5:
                    System.out.println("Ha decidido salir del programa, Que maradona te acompañe");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("Main Menu\n");
        System.out.print("1. Crear una imagen\n");
        System.out.print("2. Modificar una imagen.\n");
        System.out.print("3. No implementado por el momento.\n");
        System.out.print("4. Alguna opción para elegir.\n");
        System.out.print("5. Salir del programa\n");
        System.out.print("\nEnter your choice: ");
    }
}