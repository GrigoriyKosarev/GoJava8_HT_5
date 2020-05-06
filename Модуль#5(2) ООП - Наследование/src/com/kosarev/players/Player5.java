package com.kosarev.players;

public class Player5 extends Player3{

    public Player5(double price){
        super(price);
    }

    @Override
    public void playAllSongs() {
        playList.playAllSongsFromLastToFirst();
    }
}
