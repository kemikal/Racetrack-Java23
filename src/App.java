import java.util.Scanner;

public class App {

    public static Racetrack racetrack = new Racetrack("Monaco");

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Racetrack!");
        Scanner input = new Scanner(System.in);
        boolean run = true;

        // racetrack.addCar("Mercedes", "Nico");
        // racetrack.addCar("Ferarri", "Kimi");

        // Hitta en bil, skicka en gasa kommando

        // Car c = racetrack.getCars().get(0);
        // c.setSpeed(100);

        racetrack.speedUp("Kimi", 150);

        while (run) {
            System.out.println("Vad vill du göra? a, lägg till ny förare. b, gasa. c. Titta på banan. d, avsluta.");
            String choice = input.nextLine();

            switch(choice) {
                case "a":
                // ny förare
                System.out.println("Lägg till ny: ge mig ett stall och namn");
                String model = input.nextLine();
                String driver = input.nextLine();
                racetrack.addCar(model, driver);
                break;
                case "b":
                System.out.println("Vilken förare ska gasa?");
                String findDriver = input.nextLine();
                int setSpeed = input.nextInt();
                input.nextLine();
                racetrack.speedUp(findDriver, setSpeed);
                break;
                case "c":
                System.out.println("Så här ser banan ut nu:");
                printRacetrack();
                break;
                case "d":
                System.out.println("Vi stänger ner och plockar ihop");
                run = false;
                default:
                System.out.println("Nope");
                break;
            }
        
        }

        printRacetrack();

        input.close();
    }

    public static void printRacetrack() {
        for (Car car : racetrack.getCars()) {
            System.out.println(car.getModel() + " körs utav " + car.getDriver() + ". Bilen kör i " + car.getSpeed() + " km / h." );
        }
    }
}
