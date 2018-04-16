package tk.vousnavezpaslesbases.soundboxv2;

import android.content.Context;
import android.media.SoundPool;

public class RawSound implements Sound{

    int id;
    String name;
    int ressource;

    public RawSound(String name, int ressource){
        this.name = name;
        this.ressource = ressource;
    }

    @Override
    public void loadTo(Context context, SoundPool soundPool) {
        id = soundPool.load(context, ressource, 1);
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }
}
