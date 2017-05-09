package mediator4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 09.05.2017.
 */
public class ConductorImpl implements Conductor {

    private List<MusicalInstrument> miList;

    public ConductorImpl() {
        miList = new ArrayList<>();
    }

    @Override
    public void startPlaying() {
        miList.forEach(musicalInstrument -> musicalInstrument.play());
    }

    @Override
    public void stopPlaying() {
        miList.forEach(musicalInstrument -> musicalInstrument.stop());
    }

    @Override
    public void addInstrument(MusicalInstrument mi) {
        miList.add(mi);
    }
}
