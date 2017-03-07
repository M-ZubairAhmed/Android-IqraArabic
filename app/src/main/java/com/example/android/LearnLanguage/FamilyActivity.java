package com.example.android.LearnLanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.list_view);
        CustomAdapter customAdapter = new CustomAdapter(this, populateArrayListFamily());
        listView.setAdapter(customAdapter);
    }

    protected ArrayList<Words> populateArrayListFamily() {
        RawData data = new RawData();
        String[] arabicWords = data.getFamilyArray_ar();
        String[] englishWords = data.getFamilyArray_en();
        int[] pictureRep = data.getFamilyImageArray();
        ArrayList<Words> arrayList = new ArrayList<>();
        for (int i = 0; i < data.getFamilyCount(); i++) {
            arrayList.add(new Words(englishWords[i], arabicWords[i], pictureRep[i]));
        }
        return arrayList;
    }
}
