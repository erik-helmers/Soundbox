package tk.vousnavezpaslesbases.soundboxv2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;

import java.util.List;

public class SoundPlayer {

    Context context;
    SoundPool soundPool;
    List<Sound> mSounds;

    public SoundPlayer(Context c,List<Sound> sounds){

        context = c;

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();

        soundPool = new SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(1000)    // TODO: for some reasons it looks like max stream is 10 (?)
                .build();

        mSounds = sounds;

        for (Sound s: sounds){
            s.loadTo(c, soundPool);
        }

    }

    public List<Sound> getLoadedSounds(){
        return mSounds;
    }

    public void play(Sound s){
        soundPool.play(s.id(), 1, 1, 1, 0, 1);
    }


}
