package abstractsuperclass1;

/**
 * Created by mozilla9025 on 5/5/17.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car(24,5,100,100);
        Bike bike = new Bike(10,12,20,30);
        Carriage carriage = new Carriage(30,10,40,50);

        System.out.println(car.toString());
        System.out.println(bike.toString());
        System.out.println(carriage.toString());
    }

}
