package chainofresp2;

/**
 * Created by Sergey on 08.05.2017.
 */
public class Location {

    private String from;
    private String to;
    private int distance;
    private boolean isAvailableByCar;
    private boolean isAvailableByTrain;
    private boolean isAvailableByPlane;

    public Location() {
    }

    public Location(String from, String to, int distance, boolean isAvailableByCar,
                    boolean isAvailableByTrain, boolean isAvailableByPlane) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.isAvailableByCar = isAvailableByCar;
        this.isAvailableByTrain = isAvailableByTrain;
        this.isAvailableByPlane = isAvailableByPlane;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isAvailableByCar() {
        return isAvailableByCar;
    }

    public void setAvailableByCar(boolean availableByCar) {
        isAvailableByCar = availableByCar;
    }

    public boolean isAvailableByTrain() {
        return isAvailableByTrain;
    }

    public void setAvailableByTrain(boolean availableByTrain) {
        isAvailableByTrain = availableByTrain;
    }

    public boolean isAvailableByPlane() {
        return isAvailableByPlane;
    }

    public void setAvailableByPlane(boolean availableByPlane) {
        isAvailableByPlane = availableByPlane;
    }
}
