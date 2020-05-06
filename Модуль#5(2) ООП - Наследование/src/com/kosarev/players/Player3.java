package com.kosarev.players;

import com.kosarev.player.PlayList;
import com.kosarev.player.Song;
import com.kosarev.properties.CanPlayAllSong;

public class Player3 extends Player1 implements CanPlayAllSong {

    public PlayList playList;

    public Player3(double price){
        super(price);
        playList = new PlayList();
    }

    public double getPrice(){
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playList.getFirstSong());
    }

    public void playAllSongs(){
        playList.playAllSongs();
    }

}
