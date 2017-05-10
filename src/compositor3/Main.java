package compositor3;

/**
 * Created by Sergey on 10.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        StudyingMethod reading = new Reading();

        Learner student = new Student();
        Learner schoolchildren = new Schoolchildren();

        student.addMethod(reading);
        schoolchildren.addMethod(reading);

        student.learn();
        schoolchildren.learn();
    }

}
