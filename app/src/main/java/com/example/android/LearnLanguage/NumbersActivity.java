package com.example.android.LearnLanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    RawArrays rawArrays;
    ArrayAdapter<String> numbersAdapter;
    ArrayList<String> numbers_ArList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        rawArrays = new RawArrays();

        ListView numbersInAlpha_View = (ListView) findViewById(R.id.numbersActivity_XmlID);
        numbers_ArList = populateArrayList();
        numbersAdapter = new ArrayAdapter<String>(NumbersActivity.this, android.R.layout.simple_list_item_1, numbers_ArList);

        numbersInAlpha_View.setAdapter(numbersAdapter);

    }

    protected  ArrayList<String> populateArrayList(){
        String[] numberDef = rawArrays.getNumbersArray_En();
        String[] numbersFrn = rawArrays.getNumbersArray_Ar();

        ArrayList<String> output = new ArrayList<>();
        return output;
    }
}
