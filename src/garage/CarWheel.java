package garage;

/**
 * Created by admin on 31.07.2017.
 */
public class CarWheel {

    private double condition;

    CarWheel(){
        this.condition = 0.0D;
    }

    CarWheel(double condition){
        setCondition(condition);
    }

    public void setCondition(double condition){
        if (condition >= 0 && condition <= 1){
            this.condition = condition;
        }
        else {
            System.out.println("Состояние целостности шины должно быть (дробное число от 0-стерта до 1-новая)");
            this.condition = 0;
        }
    }

    public void setNewCondition(){
        this.condition = 1;
    }

    public void setEraseOfPercentCondition(double Percent){
        condition = condition - Percent / 100;
        if (condition < 0)
            condition = 0;
    }

    public double getCondition(){
        return condition;
    }

    public void info(){
        System.out.println("Состояние целостности шины (дробное число от 0-стерта до 1-новая): " + getCondition());
    }
}
