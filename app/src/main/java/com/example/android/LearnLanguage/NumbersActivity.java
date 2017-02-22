package com.example.android.LearnLanguage;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Instantiating view of numbers section xml
        ListView listView = (ListView) findViewById(R.id.numbersActivity_XmlID);

        //numbers adapter instantiated, contructor with context,inbuilt list layout, attached the array list
        NumbersSectionAdapter numbersAdapter = new NumbersSectionAdapter(this,populateArrayList());

        //xml list view attached with the adapter.
        listView.setAdapter(numbersAdapter);

    }

    protected  ArrayList<SectionClassNumbers> populateArrayList(){
        ArrayList<SectionClassNumbers> arrayList = new ArrayList<>();
        RawArrays rawArrays = new RawArrays();
        String[] nativeNums = rawArrays.getNumbersArray_En();
        String[] foriegnNums = rawArrays.getNumbersArray_Ar();
        int[] nativeLiteralNums = rawArrays.getNumbersArray_rm();
        for (int i = 0; i < 100; i++) {
            arrayList.add(new SectionClassNumbers(nativeNums[i],foriegnNums[i]));
        }
        return arrayList;
    }
}
