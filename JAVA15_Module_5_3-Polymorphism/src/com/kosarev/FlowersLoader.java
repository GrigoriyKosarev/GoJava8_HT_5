package com.kosarev;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public abstract class FlowersLoader {

    private String path;

    public static Flower[] load(String path){

        Flower[] flowers = new Flower[3];
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Scanner scanner = new Scanner(fileInputStream);
            flowers[0] = addFlower(scanner.nextLine());
            flowers[1] = addFlower(scanner.nextLine());
            flowers[2] = addFlower(scanner.nextLine());
            fileInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flowers;

    }

    private static Flower addFlower(String name){

        if (name.equals("Rose"))
            return new Rose();
        else if (name.equals("Tulip"))
            return new Tulip();
        else if (name.equals("Chamomile"))
            return new Chamomile();
        else
            return new Flower();

    }

}
