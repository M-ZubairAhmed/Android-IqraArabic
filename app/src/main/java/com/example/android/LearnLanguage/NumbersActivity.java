package com.example.android.LearnLanguage;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        //Instantiating view of numbers section xml
        ListView listView = (ListView) findViewById(R.id.list_view);

        //numbers adapter instantiated, contructor with context,inbuilt list layout, attached the array list
        ArrayAdapterCustom numbersAdapter = new ArrayAdapterCustom(this,populateArrayList());

        //xml list view attached with the adapter.
        listView.setAdapter(numbersAdapter);

    }

    protected  ArrayList<Words> populateArrayList(){
        ArrayList<Words> arrayList = new ArrayList<>();
        RawArrays rawArrays = new RawArrays();
        String[] nativeNums = rawArrays.getNumbersArray_En();
        String[] foriegnNums = rawArrays.getNumbersArray_Ar();
        for (int i = 0; i < 100; i++) {
            arrayList.add(new Words(nativeNums[i],foriegnNums[i]));
        }
        return arrayList;
    }
}
