package tk.vousnavezpaslesbases.soundboxv2;

import android.content.Context;
import android.media.SoundPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Core {
    public final static HashMap<String, Integer> r_nacfaire_sounds;
    static {
        r_nacfaire_sounds = new HashMap<>();
        r_nacfaire_sounds.put("Le Bilan", R.raw.bilan_rouge);
        r_nacfaire_sounds.put("Tant pis !", R.raw.bon_bah_tant_pis);
        r_nacfaire_sounds.put("Regarder c'est pas Sorcier", R.raw.c_pas_sorcier);
        r_nacfaire_sounds.put("Sortez les cahiers !", R.raw.cahiers_svt);
        r_nacfaire_sounds.put("Chut", R.raw.chut_svou_plait);
        r_nacfaire_sounds.put("Issouuu", R.raw.issou);
        r_nacfaire_sounds.put("Monsieur", R.raw.monsieur);
        r_nacfaire_sounds.put("Mademoiselle", R.raw.mademoiselle);
        r_nacfaire_sounds.put("On pratique le dab", R.raw.on_pratique_dab);
        r_nacfaire_sounds.put("J'ai volé ton vélo", R.raw.voler_ton_velo);



        //TODO : add the other sounds
    }

    public final static List<Sound> nacfaire_sounds;
    static {
        nacfaire_sounds = new ArrayList<>();
        for (Map.Entry<String, Integer> item : r_nacfaire_sounds.entrySet()){
            nacfaire_sounds.add(new RawSound(item.getKey(), item.getValue()));
        }
    }
}
