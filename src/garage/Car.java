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
    private CarWheel[] wheels = new CarWheel[4]; //массив колес
    private CarDoor[] doors = new CarDoor[4];    //массив дверей

    //Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта.
    // Например дата производства.
    Car(){
        dataProduce = new Date(20170101);
        engineType = "резкий";
        maxSpeed = 200;
        accelerationTimeTo100 = 5.5;
        passengerCapacity = 5;
        passengerQuantity = 2;
        setSpeed(50);
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
        setSpeed(speed);
    }

    //Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от
    // целостности колес и наличия водителя)
    public void info(){

        System.out.println("---------------------------------------------");
        System.out.println("дата производства: " + dataProduce);
        System.out.println("тип двигателя: " + engineType);
        System.out.println("максимальная скорость машины: " + maxSpeed);
        System.out.println("время разгона до 100км/ч: " + accelerationTimeTo100);
        System.out.println("пассажировместимость: " + passengerCapacity);
        System.out.println("кол-во пасажиров внутри в данный момент: " + passengerQuantity);
        System.out.println("текущая скорость: " + speed);
        System.out.println("---------------------------------------------");

        //private CarWheel[] wheel;             //массив колес
        //private CarDoor[] door;               //массив дверей
    }

    //Изменить текущую скорость
    public void setSpeed(double speed){
        this.speed = speed;
    }

    //Посадить 1 пассажира в машину
    public void setAddOnePassengerQuantity(){
        if ((passengerQuantity + 1) <= passengerCapacity)
            passengerQuantity++;
        else
            System.out.println("Невозможно посадить 1 пассажира. Превышает общее количество пасажыров.");
    }

    //Высадить 1 пассажира
    public void setDelOnePassengerQuantity(){
        if (passengerQuantity > 0)
            passengerQuantity--;
        else
            System.out.println("Невозможно высадить 1 пассажира. Текущее количество 0.");
    }

    //Высадить всех пассажиров
    public void setClearPassengerQuantity(){
        passengerQuantity = 0;
    }

    //Получить дверь по индексу
    public CarDoor getDoor(int indexDoor){
        if (indexDoor < doors.length)
            return doors[indexDoor];
        else {
            System.out.println("индекс превышает длинну массива");
            return null;
        }

    }

    //Получить колесо по индексу
    public CarWheel getWheel(int indexWheel){
        if (indexWheel < doors.length)
            return wheels[indexWheel];
        else {
            System.out.println("индекс превышает длинну массива");
            return null;
        }
    }

    //Добавить дверь в автомобиль
    public void addDoorToCar(CarDoor door, int indexDoor){
        if (doors.length < indexDoor)
            System.out.println("Error! ");
        else
            doors[indexDoor] = door;
    }

    //Добавить колесо в автомобиль
    public void addWheelToCar(CarWheel wheel, int indexWheel){
        if (wheels.length < indexWheel)
            System.out.println("Error! ");
        else
            wheels[indexWheel] = wheel;
    }

    //Снять все колеса с машины
    public void deleteAllWheelToCar(){

        wheels = new CarWheel[0];

    }

    public void addNewWheelToCar(CarWheel tempWheel){

        CarWheel[] tempWheels = new CarWheel[wheels.length + 1];

        for (int i = 0; i < wheels.length; i++){
            tempWheels[i] = wheels[i];
        }
        tempWheels[tempWheels.length-1] = tempWheel;

        wheels = new CarWheel[tempWheels.length-1];
        wheels = tempWheels;

    }

    public double getMinWheelCondition(){

        if (wheels.length < 1 )
            return 0;

        double minCondition = wheels[0].getCondition();

        for (int i = 0; i < wheels.length; i++){
            if (wheels[i].getCondition() < minCondition)
                minCondition = wheels[i].getCondition();
        }

        return minCondition;

    }

    public double getCurrentMaxSpeed(){

        if (passengerQuantity < 0)
            return 0;

        return maxSpeed * getMinWheelCondition();

    }
}
