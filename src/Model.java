import java.util.concurrent.TimeUnit;

public class Model {
    private int pin = 4444;
    public int getPin(){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
