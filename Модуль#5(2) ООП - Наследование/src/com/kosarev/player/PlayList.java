package com.kosarev.player;

import com.kosarev.properties.CanPlayAllSong;

public class PlayList implements CanPlayAllSong {

    private Song[] list;

    public PlayList(){
        list = new Song[3];
        list[0] = new Song("The best song");
        list[1] = new Song("Good song");
        list[2] = new Song("Super Song");
    }

    public void playAllSongs(){
        for (Song el: list) {
            System.out.println("Playing: " + el.getName());
        }
    }

    public void playAllSongsFromLastToFirst(){
        int count = list.length-1;
        for (int i=count; i>= 0; i--) {
            Song el = list[i];
            System.out.println("Playing: " + el.getName());
        }
    }

    public String getFirstSong(){
        if (list.length >= 0 )
            return list[0].getName();
        else
            return "";
    }

    public String getLastSong(){
        if (list.length >= 0 ){
            if (list.length == 0 )
                return list[0].getName();
            else
                return list[list.length-1].getName();
        }
        else
            return "";
    }

    public Song[] getList(){
        return list;
    }

    public void setList(Song[] list){
        this.list = list;
    }

}
