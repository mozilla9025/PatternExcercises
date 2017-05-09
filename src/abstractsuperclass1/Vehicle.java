package abstractsuperclass1;

/**
 * Created by mozilla9025 on 5/5/17.
 * Used abstract superclass pattern
 */
public abstract class Vehicle {


    private int passengerFare;
    private int baggageFare;
    private int speed;
    private int distance;

    public Vehicle(int passengerFare, int baggageFare, int speed, int distance) {
        this.passengerFare = passengerFare;
        this.baggageFare = baggageFare;
        this.speed = speed;
        this.distance = distance;
    }

    int getTime() {
        return distance * speed;
    }

    int getPassengerFare() {
        return getTime() * passengerFare;
    }

    int getBaggageFare() {
        return getTime() * baggageFare;
    }

}
