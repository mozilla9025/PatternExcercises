package first;

/**
 * Created by mozilla9025 on 5/5/17.
 */
public class Bike extends Vehicle {

    public Bike(int passengerFare, int baggageFare, int speed, int distance) {
        super(passengerFare, baggageFare, speed, distance);
    }

    @Override
    int getTime() {
        return super.getTime();
    }

    @Override
    int getPassengerFare() {
        return super.getPassengerFare();
    }

    @Override
    int getBaggageFare() {
        return super.getBaggageFare();
    }


    @Override
    public String toString() {
        return "Bike{ time: " + getTime()
                + ", passengerFare: " + getPassengerFare()
                + ", baggageFare: " + getBaggageFare() + "}";
    }
}
