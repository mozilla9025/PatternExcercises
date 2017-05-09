package abstractsuperclass1;

/**
 * Created by mozilla9025 on 5/5/17.
 */
public class Carriage extends Vehicle {

    public Carriage(int passengerFare, int baggageFare, int speed, int distance) {
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
        return "Carriage{ time: " + getTime()
                + ", passengerFare: " + getPassengerFare()
                + ", baggageFare: " + getBaggageFare() + "}";
    }

}
