package abstractsuperclass1;

/**
 * Created by mozilla9025 on 5/5/17.
 */
public class Car extends Vehicle {

    public Car(int passengerFare, int baggageFare, int speed, int distance) {
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
        return "Car{ time: " + getTime()
                + ", passengerFare: " + getPassengerFare()
                + ", baggageFare: " + getBaggageFare() + "}";
    }
}
