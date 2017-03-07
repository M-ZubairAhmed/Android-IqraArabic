package com.example.android.LearnLanguage;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    protected ArrayList<Words> arrayList;
    MediaPlayer mediaPlayer;

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
                mediaPlayer = MediaPlayer.create(FamilyActivity.this,arrayList.get(position).getSpellSounds());
                    mediaPlayer.start();
            }
        });
    }

    protected ArrayList<Words> populateArrayListFamily() {
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
}
