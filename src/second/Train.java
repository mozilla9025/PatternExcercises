package second;

/**
 * Created by Sergey on 08.05.2017.
 */
public class Train extends PassengerCarrierHandler {

    public Train(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    protected boolean isCanHandle(Location location) {
        if (location.isAvailableByTrain())
            return true;
        return false;
    }

    @Override
    protected void sendResponse(Location location) {
        System.out.println("You can travel from " + location.getFrom() + " to " + location.getTo() + " by Train.\n" +
                "Distance: " + location.getDistance());
    }

}
