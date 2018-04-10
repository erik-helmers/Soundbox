package fr.elegary.nacfairesoundbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class Nacfaire extends AppCompatActivity implements View.OnClickListener{
private MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacfaire);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setTitle("Nacfaire Soundbox");
        toolbar.setNavigationIcon(R.drawable.icon);
        setSupportActionBar(toolbar);
        // Déclaration des boutons

        //Seisme
        Button btn_seisme= (Button) findViewById(R.id.btn_seisme);
        btn_seisme.setOnClickListener(this);
        //Monsieur
        Button btn_monsieur = (Button) findViewById(R.id.btn_monsieur);
        btn_monsieur.setOnClickListener(this);
        //Chut
        Button btn_chut = (Button) findViewById(R.id.btn_chut);
        btn_chut.setOnClickListener(this);
        //Bassin doux
        Button btn_bassin_doux= (Button) findViewById(R.id.btn_bassin_doux);
        btn_bassin_doux.setOnClickListener(this);
        //Bilan rouge
        Button btn_bilan_rouge= (Button) findViewById(R.id.btn_bilan_rouge);
        btn_bilan_rouge.setOnClickListener(this);
        //Take out svt
        Button btn_take_out_svt= (Button) findViewById(R.id.btn_take_out_svt);
        btn_take_out_svt.setOnClickListener(this);
        //Plaques tectoniques
        Button btn_plaques_tectoniques= (Button) findViewById(R.id.btn_plaques_tectoniques);
        btn_plaques_tectoniques.setOnClickListener(this);
        //ISSOU
        Button btn_issou= (Button) findViewById(R.id.btn_issou);
        btn_issou.setOnClickListener(this);
        //MEIOSE
        Button btn_meiose= (Button) findViewById(R.id.btn_meiose);
        btn_meiose.setOnClickListener(this);
        //Bon bah tant pis
        Button btn_tant_pis= (Button) findViewById(R.id.btn_tant_pis);
        btn_tant_pis.setOnClickListener(this);
        //C pas sorcier
        Button btn_c_pas_sorcier= (Button) findViewById(R.id.btn_c_pas_sorcier);
        btn_c_pas_sorcier.setOnClickListener(this);
        //Cahiers SVT
        Button btn_cahiers_svt= (Button) findViewById(R.id.btn_cahiers_svt);
        btn_cahiers_svt.setOnClickListener(this);
        //Cellules
        Button btn_cellules= (Button) findViewById(R.id.btn_cellules);
        btn_cellules.setOnClickListener(this);
        //Comment ça fonctionne
        Button btn_fonctionne= (Button) findViewById(R.id.btn_comment_fonctionne);
        btn_fonctionne.setOnClickListener(this);
        //Et on appelle cela la meiose
        Button btn_on_appelle= (Button) findViewById(R.id.btn_on_appelle);
        btn_on_appelle.setOnClickListener(this);
        //Ferme ta gueule
        Button btn_ta_gueule= (Button) findViewById(R.id.btn_ta_gueule);
        btn_ta_gueule.setOnClickListener(this);
        //On va jouer à Fortnite
        Button btn_fortnite= (Button) findViewById(R.id.btn_fortnite);
        btn_fortnite.setOnClickListener(this);
        //Mademoiselle
        Button btn_mademoiselle= (Button) findViewById(R.id.btn_mademoiselle);
        btn_mademoiselle.setOnClickListener(this);
        //On pratique le dab
        Button btn_dab= (Button) findViewById(R.id.btn_dab);
        btn_dab.setOnClickListener(this);
        //Passer dans les rangs
        Button btn_passer_rangs= (Button) findViewById(R.id.btn_passer_rangs);
        btn_passer_rangs.setOnClickListener(this);
        //Planeur le meilleur
        Button btn_planeur_meilleur= (Button) findViewById(R.id.btn_planeur_meilleur);
        btn_planeur_meilleur.setOnClickListener(this);
        //On écrit la problématique
        Button btn_problematique= (Button) findViewById(R.id.btn_problematique);
        btn_problematique.setOnClickListener(this);
        //Le schéma sera noté
        Button btn_schema_note = (Button) findViewById(R.id.btn_schema_note);
        btn_schema_note.setOnClickListener(this);
        //On trotinne
        Button btn_trotinne= (Button) findViewById(R.id.btn_trotinne);
        btn_trotinne.setOnClickListener(this);
        //Un point de plus dans la moyenne
        Button btn_un_point= (Button) findViewById(R.id.btn_un_point);
        btn_un_point.setOnClickListener(this);
        //Voler ton velo
        Button btn_velo= (Button) findViewById(R.id.btn_velo);
        btn_velo.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_seisme:
                play(R.raw.attention_seisme);
                break;
            case R.id.btn_monsieur:
                play(R.raw.monsieur);
                break;
            case R.id.btn_chut:
                play(R.raw.chut_svou_plait);
                break;
            case R.id.btn_bassin_doux:
                play(R.raw.bassin_doux);
                break;
            case R.id.btn_bilan_rouge:
                play(R.raw.bilan_rouge);
                break;
            case R.id.btn_take_out_svt:
                play(R.raw.take_out_svt);
                break;
            case R.id.btn_plaques_tectoniques:
                play(R.raw.plaques_tectoniques);
                break;
            case R.id.btn_issou:
                play(R.raw.issou);
                break;
            case R.id.btn_meiose:
                play(R.raw.meiose);
                break;
            case R.id.btn_tant_pis:
                play(R.raw.bon_bah_tant_pis);
                break;
            case R.id.btn_c_pas_sorcier:
                play(R.raw.c_pas_sorcier);
                break;
            case R.id.btn_cahiers_svt:
                play(R.raw.cahiers_svt);
                break;
            case R.id.btn_cellules:
                play(R.raw.cellules);
                break;
            case R.id.btn_comment_fonctionne:
                play(R.raw.comment_ca_fonctionne);
                break;
            case R.id.btn_on_appelle:
                play(R.raw.et_on_appelle_meiose);
                break;
            case R.id.btn_ta_gueule:
                play(R.raw.ferme_ta_geule);
                break;
            case R.id.btn_fortnite:
                play(R.raw.fortnite_illustrer_cours);
                break;
            case R.id.btn_mademoiselle:
                play(R.raw.mademoiselle);
                break;
            case R.id.btn_dab:
                play(R.raw.on_pratique_dab);
                break;
            case R.id.btn_passer_rangs:
                play(R.raw.passer_dans_les_rangs);
                break;
            case R.id.btn_planeur_meilleur:
                play(R.raw.planeur_meilleur);
                break;
            case R.id.btn_problematique:
                play(R.raw.problematique);
                break;
            case R.id.btn_schema_note:
                play(R.raw.schema_note);
                break;
            case R.id.btn_trotinne:
                play(R.raw.trotinne);
                break;
            case R.id.btn_un_point:
                play(R.raw.un_point_de_plus);
                break;
            case R.id.btn_velo:
                play(R.raw.voler_ton_velo);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    int id = item.getItemId();
    if (id==R.id.action_settings){
        Intent settings  = new Intent(getBaseContext(), Settings.class);
        startActivity(settings);
        return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void play(int idsound){
    if(mPlayer!=null){
            mPlayer.stop();
            mPlayer.reset();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, idsound);
        mPlayer.start();
    }

}
