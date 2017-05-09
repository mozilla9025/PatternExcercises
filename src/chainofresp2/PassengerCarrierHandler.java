package chainofresp2;

/**
 * Created by Sergey on 08.05.2017.
 */
public abstract class PassengerCarrierHandler {

        protected PassengerCarrierHandler next;
    protected int maxDistance;

    public PassengerCarrierHandler setNext(PassengerCarrierHandler next) {
        this.next = next;
        return next;
    }

    public void handleRequest(Location location) {
        if (location.getDistance() < maxDistance) {
                if (isCanHandle(location))
                sendResponse(location);
        }

        if (next != null)
            next.handleRequest(location);
    }

    abstract protected boolean isCanHandle(Location location);

    abstract protected void sendResponse(Location location);
}
