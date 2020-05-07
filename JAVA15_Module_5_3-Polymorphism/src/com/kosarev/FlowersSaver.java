package com.kosarev;

import java.io.FileReader;
import java.io.FileWriter;

public abstract class FlowersSaver {

    public static void save(String path, Flower[] flowers){

        try {
            FileWriter fileWriter = new FileWriter(path);

            for (Flower flower: flowers) {
                fileWriter.write(flower.getClassName()+"\n");
            }
            fileWriter.flush();
            fileWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
