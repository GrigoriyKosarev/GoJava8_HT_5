package com.kosarev.players;

import com.kosarev.player.Song;

public class Player1 extends Song {

    protected final double price;

    public Player1(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
