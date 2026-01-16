/*
 * MainClass demonstrates N number of cars
 * parking concurrently using multithreading.
 */
public class MainClass {

    public static void main(String[] args) {

        int totalSlots = 3; // limited parking slots
        int totalCars = 8;  // N number of cars

        ParkingPool pool = new ParkingPool(totalSlots);

        // Create multiple car threads
        for (int i = 1; i <= totalCars; i++) {
            RegistrarParking car = new RegistrarParking(i);
            Thread t = new Thread(new ParkingAgent(car, pool));
            t.start();
        }
    }
}
