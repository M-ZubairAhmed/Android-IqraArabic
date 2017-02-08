package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.RawArrays.getNumbersAlpha;

public class NumbersActivity extends AppCompatActivity {

    ArrayAdapter<String> numbersAdapter;
    ArrayList<String> numbers_ArList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        GridView numbersInAlpha_View = (GridView) findViewById(R.id.numbersActivity_XmlID);
        numbers_ArList = populateArrayList();
        numbersAdapter = new ArrayAdapter<String>(NumbersActivity.this, android.R.layout.simple_list_item_1, numbers_ArList);

        numbersInAlpha_View.setAdapter(numbersAdapter);

    }

    protected  ArrayList<String> populateArrayList(){
        String[] input = getNumbersAlpha();
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            output.add(i,input[i]);
        }
        return output;
    }
}
