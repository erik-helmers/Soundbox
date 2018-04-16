package tk.vousnavezpaslesbases.soundboxv2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SoundAdapter extends RecyclerView.Adapter<SoundAdapter.ViewHolder> {

    SoundPlayer soundPlayer;
    List<Sound> sounds;

    public SoundAdapter(SoundPlayer soundPlayer){
        this.soundPlayer = soundPlayer;
        this.sounds = soundPlayer.getLoadedSounds();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public Button mButton;
        public ViewHolder(View view) {
            super(view);
            mButton = view.findViewById(R.id.button_sound);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sound_item_view, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Sound sound = sounds.get(position);
        holder.mButton.setText(sound.name());
        holder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayer.play(sound);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sounds.size();
    }


}
