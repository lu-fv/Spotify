package MODELS;

import ENUMS.Genere;
import MENUS.Menu;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Song> songList = new ArrayList<>();


        Artist Queen = new Artist("Queen", 40, "Brithish");
        Artist Madonna = new Artist("Madonna", 65, "UnitedState");
        Artist Becerra = new Artist("Maria Becerra", 22, "Argentinian");


        Album album1 = new Album(1975, "At night at opera", Queen);
        Album album2 = new Album(1984, "Like a virgin", Madonna);
        Album album3 = new Album(2023, "Corazon vacio", Becerra);

        Song songList1 = new Song(" Bohemian Rhapsody", Genere.ROCK, 4.0, album1, Queen);
        Song songList2 = new Song("Material girl", Genere.POP, 5.0, album2, Madonna);
        Song songList3 = new Song("Corazon vacio", Genere.TRAP, 3.0, album3, Becerra);

        songList.add(songList1);
        songList.add(songList2);
        songList.add(songList3);

        Menu menu = new Menu(songList);
        menu.menuGral();
    }
}