package MENUS;

import MODELS.BasicList;
import MODELS.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    List<Song> songList = new ArrayList<>();

    public Menu(List<Song> songList) {
        this.songList = songList;
    }

    public void menuGral() {
        int opc;


        do {
            System.out.println("MENU SPOTIFY \n");
            System.out.println("1) MenuBasic \n");
            System.out.println("2) MenuPremium \n");
            System.out.println("3) Salir \n");

            System.out.println(" Elija una opcion: \n");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1) MenuBasic");
                    this.menuBasic();
                    break;

                case 2:
                    System.out.println("2) MenuPremium");
                    this.menuPremium();
                    break;

                case 3:
                    System.out.println(" 3) Salir");
                    break;

                default:
                    System.out.println(" ELija opcion correcta.");
                    break;
            }
        } while (opc != 3);

    }

    public void menuBasic() {
        int opc;
        char p;
        Stack<Song> myListBasic = new Stack<Song>();
        for (Song song : songList){
            myListBasic.push(song);
        }
        BasicList basicList = new BasicList("ListSong", myListBasic);
        Song song = new Song();
        String title = "";

        do {     ///reproducir, añadir, eliminar, listar)
            System.out.println(" MenuBasic \n");
            System.out.println("1) Play  \n");
            System.out.println("2) Add Song \n");
            System.out.println("3) Delete Song \n");
            System.out.println("4) List Songs \n");
            System.out.println("5) Salir \n");

            System.out.println(" Elija una opcion: \n");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1) Play songs");
                    Song s = basicList.play();
                    System.out.println(s.toString());
                    break;

                case 2:
                    System.out.println("2) Add Song");
                    basicList.addSong(song);
                    break;

                case 3:
                    System.out.println("3) Delete Song");
                    basicList.deleteSong(title);
                    break;

                case 4:
                    System.out.println("4) List Songs");
                    basicList.showMyList();
                    break;

                case 5:
                    System.out.println(" 5) Salir");
                    break;

                default:
                    System.out.println(" ELija opcion correcta.");
                    break;
            }
        } while (opc != 5);

    }

    public void menuPremium(){
        int opc;
        char p;
        BasicList basicList = new BasicList();
        Song song = new Song();
        String title = "";
        do {     ///reproducir, añadir, eliminar, listar)
            System.out.println(" MenuPremium \n");
            System.out.println("1) Play  \n");
            System.out.println("2) Add Song \n");
            System.out.println("3) Delete Song \n");
            System.out.println("4) List Songs \n");
            System.out.println("5) Salir \n");

            System.out.println(" Elija una opcion: \n");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1) Play songs");
                    basicList.play();

                    break;

                case 2:
                    System.out.println("2) Add Song");
                    basicList.addSong(song);
                    break;

                case 3:
                    System.out.println("3) Delete Song");
                    basicList.deleteSong(title);
                    break;

                case 4:
                    System.out.println("4) List Songs");
                    basicList.showMyList();
                    break;

                case 5:
                    System.out.println(" 5) Salir");
                    break;

                default:
                    System.out.println(" ELija opcion correcta.");
                    break;
            }
        } while (opc != 5);

    }

}