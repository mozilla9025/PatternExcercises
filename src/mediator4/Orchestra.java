package mediator4;

/**
 * Created by Sergey on 09.05.2017.
 */
public class Orchestra{

    public static void main(String[] args) {
        Conductor cond = new ConductorImpl();
        cond.addInstrument(new WindInstrument("Saxophone", cond));
        cond.addInstrument(new StringedInstrument("Guitar", cond));
        cond.addInstrument(new PercussiveInstrument("Drums", cond));

        cond.startPlaying();
        cond.stopPlaying();
    }

}
