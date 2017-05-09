package mediator4;

/**
 * Created by Sergey on 09.05.2017.
 */
public interface Conductor {

    void startPlaying();

    void stopPlaying();

    void addInstrument(MusicalInstrument mi);
}
