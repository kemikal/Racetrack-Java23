import java.util.ArrayList;

public class Racetrack {
    private String trackName;
    private ArrayList<Car> cars = new ArrayList<>();

    Racetrack(String trackName) {
        this.trackName = trackName;
    }

    public void addCar(String model, String driver) {
        cars.add(new Car(model, driver));
    }

    public void speedUp(String driverName, int addSpeed) {
        for (Car car : cars) {
            if (car.getDriver().equals(driverName)) {
                int speed = car.getSpeed() + addSpeed;
                car.setSpeed(speed);
            }
        }
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    
}
