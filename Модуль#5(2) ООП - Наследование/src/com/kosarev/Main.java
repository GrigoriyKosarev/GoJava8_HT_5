package com.kosarev;

import com.kosarev.players.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------Player1------");
        Player1 player1 = new Player1(100);
        player1.playSong();

        System.out.println("-------Player2------");
        Player2 player2 = new Player2(200);
        player2.playSong();

        System.out.println("-------Player3------");
        Player3 player3 = new Player3(300);
        player3.playSong();
        player3.playAllSongs();

        System.out.println("-------Player4------");
        Player4 player4 = new Player4(400);
        player4.playSong();
        player4.playAllSongs();

        System.out.println("-------Player5------");
        Player5 player5 = new Player5(500);
        player5.playSong();
        player5.playAllSongs();

        System.out.println("-------Player6------");
        Player6 player6 = new Player6(600);
        player6.playSong();
        player6.shuffle();
        player6.playAllSongs();

    }

}
