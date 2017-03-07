package com.example.android.LearnLanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_player);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.colors_ar_orange);
        final Button play = (Button) findViewById(R.id.media_play);
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

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MyMedia.this,"Done",Toast.LENGTH_SHORT).show();
                mediaPlayer.release();
            }
        });


    }
}
