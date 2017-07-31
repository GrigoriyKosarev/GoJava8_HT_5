package garage;

import garage.CarDoor;

/**
 * Created by admin on 31.07.2017.
 */
public class Processor {

    public static void main(String[] args) {

        //Класс CarDoor
        CarDoor door = new CarDoor();
        door.info();

        door.setOpenOrCloseDor();
        door.setOpenOrCloseWindow();
        door.info();

        //Клас CarWheel
        CarWheel wheel = new CarWheel(0.4);
        wheel.info();
        wheel.setNewCondition();
        wheel.info();
        wheel.setEraseOfPercentCondition(10);
        wheel.info();

    }

}
