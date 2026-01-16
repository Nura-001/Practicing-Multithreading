/*
 * ParkingAgent represents a car thread.
 * Runnable is used instead of extending Thread.
 */
public class ParkingAgent implements Runnable {

    private RegistrarParking car;
    private ParkingPool pool;

    public ParkingAgent(RegistrarParking car, ParkingPool pool) {
        this.car = car;
        this.pool = pool;
    }

    @Override
    public void run() {
        pool.parkCar(car);
    }
}
