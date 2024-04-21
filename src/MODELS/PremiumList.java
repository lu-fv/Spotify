package MODELS;

import INTERRFACES.Reproduction;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PremiumList implements Reproduction {

    private String name;
    private LinkedList<Song> myListPremium;

    @Override
    public Song play() {

        String select;
        this.showMyList();
        System.out.println(" Choose song'name: ");
        Scanner sc = new Scanner(System.in);
        select = sc.nextLine();

        return this.searchSong(select);
    }

    public Song searchSong(String title) {
        for (Song s : myListPremium) {
            if (s != null && s.getName().equalsIgnoreCase(title)) {

                return s;
            }
        }
        return null;
    }


    @Override
    public void addSong(Song song) {
        myListPremium.add(song);
    }

    @Override
    public void deleteSong() {
        this.showMyList();
        System.out.println(" Choose song'name: ");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();
       this.myListPremium.remove(searchSong(select));

    }

    @Override
    public List showMyList() {
        int cont = 1;
        System.out.println(" MyList " + name);
        for (Song song : myListPremium) {
            System.out.println(" Song: " + cont + song.toString() + "\n");

            cont++;
        }
        return this.myListPremium;
    }

    public PremiumList(String name, LinkedList<Song> myListPremium) {
        this.name = name;
        this.myListPremium = myListPremium;
    }

    public PremiumList() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getMyListPremium() {
        return myListPremium;
    }

    public void setMyListPremium(LinkedList<Song> myListPremium) {
        this.myListPremium = myListPremium;
    }

    @Override
    public String toString() {
        return "PremiumList{" +
                "name='" + name + '\'' +
                ", myListPremium=" + myListPremium +
                '}';
    }

}
