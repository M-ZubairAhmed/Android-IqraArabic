package com.example.android.LearnLanguage;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private ArrayList<Words> arrayList;
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        arrayList = new ArrayList<>();

        ListView listView = (ListView) findViewById(R.id.list_view);
        CustomAdapter customAdapter = new CustomAdapter(this, populateArrayListFamily());
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(FamilyActivity.this,arrayList.get(position).getSpellSounds());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        });
    }

    private ArrayList<Words> populateArrayListFamily() {
        RawData data = new RawData();
        String[] arabicWords = data.getFamilyArray_ar();
        String[] englishWords = data.getFamilyArray_en();
        int[] pictureRep = data.getFamilyImageArray();
        int[] soundsRep = data.getFamilySoundsArray();
        for (int i = 0; i < data.getFamilyCount(); i++) {
            arrayList.add(new Words(englishWords[i], arabicWords[i], pictureRep[i], soundsRep[i]));
        }
        return arrayList;
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}
