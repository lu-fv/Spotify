package MODELS;

import INTERRFACES.Reproduction;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BasicList implements Reproduction {
    private String name;
    private Stack<Song> myListBasic;


    @Override
    public Song play() {
        Stack<Song> aux = new Stack<>();

        while (!myListBasic.empty()) {

            aux.push(this.myListBasic.pop()); // push -> agrega a la pila

        }
        Song firstSong = aux.pop();
        while (!aux.empty()) {
            myListBasic.push(aux.pop());
        }
        myListBasic.push(firstSong);

        return myListBasic.peek();
    }

    @Override
    public void addSong(Song song) {

        myListBasic.push(song);
    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");

    }

    @Override
    public List showMyList() {
        int cont = 1;
        System.out.println(" MyList " + name);
        for (Song song : myListBasic) {
            System.out.println(" Song: " + cont + song.toString() + "\n");

            cont++;
        }
        return this.myListBasic;
    }
    public BasicList(String name, Stack<Song> myListBasic) {
        this.name = name;
        this.myListBasic = myListBasic;
    }

    public BasicList() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Song> getMyListBasic() {
        return myListBasic;
    }

    public void setMyListBasic(Stack<Song> myListBasic) {
        this.myListBasic = myListBasic;
    }

    @Override
    public String toString() {
        return "BasicList{" +
                "name='" + name + '\'' +
                ", myListBasic=" + myListBasic +
                '}';
    }
}
