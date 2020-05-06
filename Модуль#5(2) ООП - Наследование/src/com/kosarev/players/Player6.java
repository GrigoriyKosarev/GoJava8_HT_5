package com.kosarev.players;

import com.kosarev.player.Song;

import java.util.*;

public class Player6 extends Player3 {

    public Player6(double price){
        super(price);
    }

    public void shuffle(){
        //Collections.shuffle(Arrays.asList(playList));
        //PlayList playList;getList()
        Random random = new Random();
        Song[] songs = playList.getList();
        Song[] newSongs = new Song[songs.length];

        List<Integer> indexes = new ArrayList<>(songs.length);
        int count = 0;
        while (true) {
            int var = random.nextInt(songs.length);
            if (!indexes.contains(var)) {
                indexes.add(var);
                newSongs[var] = songs[count++];
            }
            if (count == songs.length) {
                break;
            }
        }

        playList.setList(newSongs);

    }

}
