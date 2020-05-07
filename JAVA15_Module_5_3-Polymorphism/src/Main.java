import com.kosarev.Flower;
import com.kosarev.FlowerStore;
import com.kosarev.FlowersLoader;
import com.kosarev.FlowersSaver;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();
        //Задание 1
/*

        System.out.println("sell: ");
        printFlowersStore(flowerStore.sell(5, 3, 1));
        System.out.println("");
        System.out.println("Purse: " + flowerStore.getPurse());

        System.out.println("");
        System.out.println("sellSequence: ");
        printFlowersStore(flowerStore.sellSequence(5, 3, 1));
        System.out.println("");
        System.out.println("Purse: " + flowerStore.getPurse());

*/
        /*
        //Задание 3
        System.out.println("");
        Flower[] flowers = FlowersLoader.load("src"+ File.separatorChar + "loadFlowers");
        printFlowersStore(flowers);
        */

        //Задание 4
        System.out.println("");
        Flower[] flowers = flowerStore.sell(5, 3, 1);
        FlowersSaver.save("src"+ File.separatorChar + "saveFlowers", flowers);

    }

    public static void printFlowersStore(Flower[] flowersStore){

        int count = 0;
        for (Flower el: flowersStore) {
            System.out.print(el.getClass().getSimpleName());
            if (count != flowersStore.length-1) {
                System.out.print(", ");
                count++;
            }
        };

    }

}
