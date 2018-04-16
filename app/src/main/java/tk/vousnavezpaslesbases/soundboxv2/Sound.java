package tk.vousnavezpaslesbases.soundboxv2;

import android.content.Context;
import android.media.SoundPool;

public interface Sound {

    void loadTo(Context context, SoundPool soundPool);
    int id();
    String name();

}
