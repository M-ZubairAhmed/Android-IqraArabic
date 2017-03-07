package com.example.android.LearnLanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_player);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.goblin);
        final Button play = (Button) findViewById(R.id.media_play);
        Button pause = (Button) findViewById(R.id.media_pause);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    play.setText("Play");
                    mediaPlayer.pause();
                }
                else {
                    mediaPlayer.start();
                    play.setText("Pause");
                }
            }
        });


    }
}
