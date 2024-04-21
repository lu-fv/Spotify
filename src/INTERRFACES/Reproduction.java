package INTERRFACES;

import MODELS.Song;

import java.util.List;
import java.util.Stack;

public interface Reproduction {

    public Song play ();
    public void addSong(Song song);
    public void deleteSong();
    public List showMyList();
}
