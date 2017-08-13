package garage;

import garage.CarDoor;

import java.util.Date;

/**
 * Created by admin on 31.07.2017.
 */
public class Processor {

    public static void main(String[] args) {

        //Класс CarDoor
        CarDoor door1 = new CarDoor();
        door1.info();

        door1.setOpenOrCloseDor();
        door1.setOpenOrCloseWindow();
        door1.info();

        CarDoor door2 = new CarDoor();
        CarDoor door3 = new CarDoor();
        CarDoor door4 = new CarDoor();

        //Клас CarWheel
        CarWheel wheel1 = new CarWheel(0.4);
        wheel1.info();
        wheel1.setNewCondition();
        wheel1.info();
        wheel1.setEraseOfPercentCondition(10);
        wheel1.info();

        CarWheel wheel2 = new CarWheel(0.5);
        CarWheel wheel3 = new CarWheel(0.9);
        CarWheel wheel4 = new CarWheel(0.1);

        //Клас Car
        Car mustang = new Car();
        mustang.addDoorToCar(door1, 0);
        mustang.addDoorToCar(door2, 1);
        mustang.addDoorToCar(door3, 2);
        mustang.addDoorToCar(door4, 3);

        mustang.addWheelToCar(wheel1, 0);
        mustang.addWheelToCar(wheel2, 1);
        mustang.addWheelToCar(wheel3, 2);
        mustang.addWheelToCar(wheel4, 3);

        mustang.info();

        //Посадить 1 пассажира в машину
        System.out.println("Посадить 1 пассажира в машину");
        mustang.setAddOnePassengerQuantity();
        mustang.info();

        //Высадить 1 пассажира
        System.out.println("Высадить 1 пассажира");
        mustang.setDelOnePassengerQuantity();
        mustang.info();

        //Высадить всех пассажиров
        System.out.println("Высадить всех пассажиров");
        mustang.setClearPassengerQuantity();
        mustang.info();

        //Получить дверь по индексу
        System.out.println("Получить дверь по индексу");
        CarDoor elDoor = mustang.getDoor(1);
        elDoor.info();

        //Получить колесо по индексу
        System.out.println("Получить колесо по индексу");
        CarWheel elWheel = mustang.getWheel(1);
        elWheel.info();

        //Снять все колеса с машины
        System.out.println("Снять все колеса с машины");
        mustang.deleteAllWheelToCar();

        //Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4 колеса, после вызова метода
        //с Х аргументом равным трем, колес будет 4+3=7)
        System.out.println("Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4 колеса, после вызова метода");
        System.out.println("с Х аргументом равным трем, колес будет 4+3=7)");
        CarWheel wheel5 = new CarWheel(0.5);
        mustang.addNewWheelToCar(wheel5);

        CarWheel wheel6 = new CarWheel(0.8);
        mustang.addNewWheelToCar(wheel6);

        //Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так. Максимальная скорость
        //новой машины множиться на самое стертое колесо в машине. Максимальная скорость равна 0 если в машине нет
        //ни одного пассажира, так как некому ее вести)
        System.out.println("Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так. Максимальная скорость");
        System.out.println("новой машины множиться на самое стертое колесо в машине. Максимальная скорость равна 0 если в машине нет");
        System.out.println("ни одного пассажира, так как некому ее вести)");

        double currentMaxSpeed =  mustang.getCurrentMaxSpeed();

        //Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от
        //целостности колес и наличия водителя)
        System.out.println("Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от");
        System.out.println("целостности колес и наличия водителя)");
        mustang.info();
        System.out.println("Максимальная скорость: " + currentMaxSpeed);

    }

}
