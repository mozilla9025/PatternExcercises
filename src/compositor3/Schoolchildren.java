package compositor3;

/**
 * Created by Sergey on 09.05.2017.
 */
public class Schoolchildren extends Learner{

    @Override
    void learn() {
        studyingMethodList.forEach(l -> System.out.println("Schoolchildren: " + l.teach()));
    }
}
