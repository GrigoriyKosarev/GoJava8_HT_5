package com.kosarev;

public class FlowerStore {

    private int purse;

    public FlowerStore(){
        purse = 0;
    }

    public int getPurse(){
        return purse;
    }

    public Flower[] sell(int count_rose, int count_chamomile, int count_tulip){

        int count_flowers = count_rose + count_chamomile + count_tulip;
        int count = 0;
        Flower[] flowers = new Flower[count_flowers];

        for (int i=0; i<count_rose; i++){
            flowers[count] = new Rose();
            addPurse(flowers[count]);
            count++;
        }

        for (int i=0; i<count_chamomile; i++){
            flowers[count] = new Chamomile();
            addPurse(flowers[count]);
            count++;
        }

        for (int i=0; i<count_tulip; i++){
            flowers[count] = new Tulip();
            addPurse(flowers[count]);
            count++;
        }

        return flowers;

    }

    public Flower[]  sellSequence(int count_rose, int count_chamomile, int count_tulip){

        int count_flowers = count_rose + count_chamomile + count_tulip;
        int count = 0;
        Flower[] flowers = new Flower[count_flowers];

        while (count_flowers > 0){

            if (count_rose > 0){
                flowers[count] = new Rose();
                addPurse(flowers[count]);
                count_rose--;
                count_flowers--;
                count++;
            }

            if (count_chamomile > 0){
                flowers[count] = new Chamomile();
                addPurse(flowers[count]);
                count_chamomile--;
                count_flowers--;
                count++;
            }

            if (count_tulip > 0){
                flowers[count] = new Tulip();
                addPurse(flowers[count]);
                count_tulip--;
                count_flowers--;
                count++;
            }


        }

        return flowers;

    }

    public void addPurse(Flower flower){
        purse = purse + flower.price;
    }
}
