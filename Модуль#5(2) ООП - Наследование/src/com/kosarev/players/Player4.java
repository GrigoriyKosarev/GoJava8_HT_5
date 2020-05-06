package com.kosarev.players;

public class Player4 extends Player3{

    public Player4(double price){
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playList.getLastSong());
    }
}
