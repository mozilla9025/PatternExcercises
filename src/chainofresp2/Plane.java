package chainofresp2;

/**
 * Created by Sergey on 08.05.2017.
 */
public class Plane extends PassengerCarrierHandler {

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    protected boolean isCanHandle(Location location) {
        if (location.isAvailableByPlane())
            return true;
        return false;
    }

    @Override
    protected void sendResponse(Location location) {
        System.out.println("You can travel from " + location.getFrom() + " to " + location.getTo() + " by Plane.\n" +
                "Distance: " + location.getDistance());
    }

}
