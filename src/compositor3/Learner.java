package compositor3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 09.05.2017.
 */
public abstract class Learner{
    protected List<StudyingMethod> studyingMethodList = new ArrayList<>();


    public void addMethod(StudyingMethod method){
        studyingMethodList.add(method);
    }

    public void removeMethod(StudyingMethod method){
        studyingMethodList.remove(method);
    }

    abstract void learn();
}
