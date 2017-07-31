package garage;

import java.util.Date;

/**
 * Created by admin on 31.07.2017.
 */
public class Car {

    private Date dataProduce;             //дата производства (не изменна после создания объекта)
    private String engineType;            //тип двигателя
    private double maxSpeed;              //максимальная скорость машины (если она новая)
    private double accelerationTimeTo100; //время разгона до 100км/ч
    private int passengerCapacity;        //пассажировместимость
    private int passengerQuantity;        //кол-во пасажиров внутри в данный момент
    private double speed;                 //текущая скорость
    private CarWheel[] wheel;             //массив колес
    private CarDoor[] door;               //массив дверей

    //Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта.
    // Например дата производства.
    Car(){
        dataProduce = new Date(20170101);
        engineType = "резкий";
        maxSpeed = 200;
        accelerationTimeTo100 = 5.5;
        passengerCapacity = 5;
        passengerQuantity = 2;
        speed = 50;
    }

    //Конструктор с датой производства.
    Car(Date dataProduce){
        this.dataProduce = dataProduce;
    }

    //Конструктор со всеми полями, кроме массива колес и массива дверей.
    Car(Date dataProduce, String engineType, double maxSpeed, double accelerationTimeTo100, int passengerCapacity,
        int passengerQuantity, double speed){

        this.dataProduce = dataProduce;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTimeTo100 = accelerationTimeTo100;
        this.passengerCapacity = passengerCapacity;
        this.passengerQuantity = passengerQuantity;
        this.speed = speed;

    }
}
