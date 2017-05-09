package factorymethod5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<CreationFactory> creators = new ArrayList<>();
        creators.add(new MustangCreator());
        creators.add(new CatCreator());
        creators.add(new DogCreator());
        creators.add(new TigerCreator());

        List<Animal> animals = new ArrayList<>();
        creators.forEach(c -> animals.add(c.createAnimal()));
        animals.forEach(a -> System.out.println("Created: " + a.getClass().getSimpleName()));
    }
}
