package MENUS;

import ENUMS.Genere;
import MODELS.*;

import java.util.*;

public class Menu {

    List<Song> songList = new ArrayList<>();

    public Menu(List<Song> songList) {
        this.songList = songList;
    }

    public void menuGral() {
        int opc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU SPOTIFY \n");
            System.out.println("1) MenuBasic \n");
            System.out.println("2) MenuPremium \n");
            System.out.println("3) Salir \n");

            System.out.println(" Elija una opcion: \n");
            sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1) MenuBasic");
                    this.menuBasic();
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("2) MenuPremium");
                    this.menuPremium();
                    sc.nextLine();
                    break;

                case 3:
                    System.out.println(" 3) Salir");
                    sc.nextLine();
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
        Scanner sc = new Scanner(System.in);
        Stack<Song> myListBasic = new Stack<Song>();
        for (Song song : songList){
            myListBasic.push(song);
        }
        BasicList basicList = new BasicList("ListSong", myListBasic);
        String title = "";

        do {     ///reproducir, añadir, eliminar, listar)
            System.out.println(" MenuBasic \n");
            System.out.println("1) Play  \n");
            //sc.nextLine();
            System.out.println("2) Add Song \n");
          //  sc.nextLine();
            System.out.println("3) Delete Song \n");
           // sc.nextLine();
            System.out.println("4) List Songs \n");
          // sc.nextLine();
            System.out.println("5) Salir \n");

            System.out.println(" Elija una opcion: \n");
             sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("1) Play songs");
                    Song s = basicList.play();
                    System.out.println(s.toString());
                    sc.nextInt();
                    //sc.nextLine();
                    break;

                case 2:
                    Artist artist1 = new Artist("Maria Becerra", 22, "Argentinian");
                    Album album = new Album(1975, "At night at opera", artist1);
                    Song song = new Song("cancion1", Genere.HIPHOP,4.5,album,artist1 );
                    System.out.println("2) Add Song");
                    basicList.addSong(song);
                    System.out.println("Cancion agregada correctamente");
                    sc.nextInt();
                    break;

                case 3:
                    System.out.println("3) Delete Song");
                    basicList.deleteSong();
                    sc.nextInt();
                    break;

                case 4:
                    System.out.println("4) List Songs");
                    basicList.showMyList();
                    sc.nextInt();
                    break;

                case 5:
                    System.out.println(" 5) Salir");
                    sc.nextInt();
                    break;

                default:
                    System.out.println(" ELija opcion correcta.");
                    sc.nextInt();
                    break;
            }
        } while (opc != 5);

    }

    public void menuPremium(){
        int opc;

        LinkedList <Song> myListPremium= new LinkedList<Song>();
        for ( Song song : this.songList){
            myListPremium.push(song );
        }
        PremiumList premiumList = new PremiumList("listPremium", myListPremium);

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
                    Song song1 = premiumList.play();
                    System.out.println("Play:" + song1.toString());
                    System.out.println(" Elija 'P' para volver al menu: ");

                   String p = "";
                    while (!p.equals("p")) {
                         p = sc.nextLine();
                    }

                    break;

                case 2:
                    Artist artist1 = new Artist("Maria Becerra", 22, "Argentinian");
                    Album album = new Album(1975, "At night at opera", artist1);
                    Song song2 = new Song("cancion1", Genere.HIPHOP,4.5,album,artist1 );
                    System.out.println("2) Add Song");
                    premiumList.addSong(song2);
                    System.out.println("Cancion agregada correctamente");
                    sc.nextInt();
                    break;

                case 3:
                    System.out.println("3) Delete Song");

                    premiumList.deleteSong();
                    sc.next();
                    //sc.nextInt();
                    break;

                case 4:
                    System.out.println("4) List Songs");
                    premiumList.showMyList();
                    sc.nextInt();
                    break;

                case 5:
                    System.out.println(" 5) Salir");
                    sc.nextInt();
                    break;

                default:
                    System.out.println(" ELija opcion correcta.");
                    sc.nextInt();
                    break;
            }
        } while (opc != 5);

    }

}