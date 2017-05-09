package chainofresp2;

/**
 * Created by Sergey on 08.05.2017.
 */
public class Car extends PassengerCarrierHandler {

    public Car(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    protected boolean isCanHandle(Location location) {
        if (location.isAvailableByCar())
            return true;
        return false;
    }

    @Override
    protected void sendResponse(Location location) {
        System.out.println("You can travel from " + location.getFrom() + " to " + location.getTo() + " by Car.\n" +
                "Distance: " + location.getDistance());
    }
}
