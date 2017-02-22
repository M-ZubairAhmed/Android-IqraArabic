package com.example.android.LearnLanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ListView listView = (ListView) findViewById(R.id.activity_family_xmlid);
        AdapterCustom adapter = new AdapterCustom(this,populateAdapter());
        listView.setAdapter(adapter);
    }

    protected ArrayList<Words> populateAdapter(){
        ArrayList<Words> arrayList = new ArrayList<>();
        RawArrays rawArrays = new RawArrays();
        String[] natvTextArray = rawArrays.getFamilyArray_en();
        String[] fornTextArray = rawArrays.getFamilyArray_ar();
        int[] imageArray = rawArrays.getFamilyImageArray();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new Words(fornTextArray[i],natvTextArray[i],imageArray[i]));
        }
        return arrayList;
    }
}
