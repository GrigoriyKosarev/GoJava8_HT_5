package com.kosarev.player;

import com.kosarev.properties.CanPlaySong;

public class Song implements CanPlaySong {
    private String songName;

    public Song(String name){
        this.songName = name;
    }

    public Song(){
        this.songName = "Jingle Bells";
    }

    public String getName(){
        return songName;
    }
    public void playSong(){
        System.out.println("Playing: " + songName);
    }
}
