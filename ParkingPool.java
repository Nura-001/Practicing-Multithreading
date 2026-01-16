import java.util.concurrent.Semaphore;

/*
 * ParkingPool controls limited parking slots using Semaphore.
 */
public class ParkingPool {

    private Semaphore slots;

    public ParkingPool(int totalSlots) {
        slots = new Semaphore(totalSlots);
    }

    // Car tries to park
    public void parkCar(RegistrarParking car) {
        try {
            System.out.println("Car " + car.getCarId() + " is trying to park...");
            slots.acquire(); // acquire parking slot

            System.out.println("Car " + car.getCarId() + " parked successfully.");
            Thread.sleep(2000); // simulate parking duration

            System.out.println("Car " + car.getCarId() + " leaving parking.");
            slots.release(); // free slot

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
