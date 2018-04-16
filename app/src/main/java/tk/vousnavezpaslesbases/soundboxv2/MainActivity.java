package tk.vousnavezpaslesbases.soundboxv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    SoundAdapter mAdapter;

    SoundPlayer mSoundPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPlayer = new SoundPlayer(getApplicationContext(), Core.nacfaire_sounds);
        mRecyclerView = findViewById(R.id.recycler_sounds);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        mRecyclerView.setAdapter(new SoundAdapter(mSoundPlayer));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
