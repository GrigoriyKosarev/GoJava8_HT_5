package garage;

/**
 * Created by admin on 31.07.2017.
 */
public class CarDoor {

    private boolean openDor;
    private CarDoorWindow  window = new CarDoorWindow();

    CarDoor(){
        /*this.openDor = false;
        this.openWindow = false;*/
        setCloseDor();
        window.setCloseWindow();
    }

    CarDoor(boolean openDor, boolean openWindow){
        this.openDor = openDor;
       /* this.openWindow = openWindow;*/
    }

    public class CarDoorWindow{

        private boolean openWindow;

        CarDoorWindow(){
            setCloseWindow();
        }

        public void setOpenWindow(){
            this.openWindow = true;
        }

        public void setCloseWindow(){
            this.openWindow = false;
        }

    }

    public void setOpenDor(){
        this.openDor = true;
    }

    public void setCloseDor(){
        this.openDor = false;
    }

    public void setOpenOrCloseDor(){
        openDor = (openDor) ? false : true;
    }

    public void setOpenOrCloseWindow(){
        window.openWindow = (window.openWindow) ? false : true;
    }

    public void info(){

        System.out.println("Статус двери (открыта): " + openDor);
        System.out.println("Статус окна (открыто): " + window.openWindow);

    }
}
