package mediator4;

/**
 * Created by Sergey on 09.05.2017.
 */
public abstract class MusicalInstrument {

    protected String name;
    protected Conductor conductor;

    public MusicalInstrument(String name, Conductor conductor) {
        this.name = name;
        this.conductor = conductor;
    }

     void play(){
         System.out.println(name + " is playing");
     }
     void stop(){
         System.out.println(name + " is stopped");
     }

}
