package garage;

/**
 * Created by admin on 31.07.2017.
 */
public class CarDoor {

    private boolean openDor;
    private boolean openWindow;

    CarDoor(){
        this.openDor = false;
        this.openWindow = false;
    }

    CarDoor(boolean openDor, boolean openWindow){
        this.openDor = openDor;
        this.openWindow = openWindow;
    }

    
}
