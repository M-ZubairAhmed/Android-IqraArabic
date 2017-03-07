package com.example.android.LearnLanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.list_view);
        CustomAdapter customAdapter = new CustomAdapter(this,populateColorsList());
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,R.raw.goblin);
                mediaPlayer.start();
            }
        });
    }

    protected ArrayList<Words> populateColorsList(){
        RawData rawData = new RawData();
        String[] english = rawData.getColorsArray_en();
        String[] arabic = rawData.getColorsArray_ar();
        int[] pic = rawData.getColorsImageArray();
        ArrayList<Words> arrayList = new ArrayList<>();
        for (int i = 0; i < rawData.getColorsCount(); i++) {
            arrayList.add(new Words(english[i],arabic[i],pic[i]));
        }
        return arrayList;
    }
}
