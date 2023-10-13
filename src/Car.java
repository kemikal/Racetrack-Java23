public class Car {
    private String model;
    private String driver;
    private int speed;

    Car(String model, String driver) {
        this.model = model;
        this.driver = driver;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}
