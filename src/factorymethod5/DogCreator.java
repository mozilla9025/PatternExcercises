package factorymethod5;

/**
 * Created by Sergey on 09.05.2017.
 */
public class DogCreator implements CreationFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
