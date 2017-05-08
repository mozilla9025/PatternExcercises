package second;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 08.05.2017.
 */
public class Client {

    public static void main(String[] args) {

        List<Location> locationList = new ArrayList<>();
        locationList.add(new Location("Kiev", "London", 4000, false, false, true));
        locationList.add(new Location("Kiev", "Nikolaev", 600, true, false, false));
        locationList.add(new Location("Kyiv", "Moscow", 2500, true, true, true));

        PassengerCarrierHandler handler1, handler2, handler3;

        handler1 = new Car(3000);
        handler2 = handler1.setNext(new Train(4000));
        handler3 = handler2.setNext(new Plane(10000));

        handler1.handleRequest(locationList.get(0));
        handler1.handleRequest(locationList.get(1));
        handler1.handleRequest(locationList.get(2));

    }
}
