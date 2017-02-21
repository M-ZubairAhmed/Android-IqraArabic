package com.example.android.LearnLanguage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersSectionAdapter extends ArrayAdapter<NumbersSectionClass> {

    public NumbersSectionAdapter(Activity context, ArrayList<NumbersSectionClass> arrayListNumbers) {
        super(context, 0, arrayListNumbers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        if (item == null){
            item = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_layout_numbers, parent ,false);
        }

        NumbersSectionClass currentitem = getItem(position);

        TextView nativeNum = (TextView) item.findViewById(R.id.nativeLangTextView_xmlid);
        nativeNum.setText(currentitem.getStoreEnNumbers());

        TextView foreignNum = (TextView) item.findViewById(R.id.foreignLangTextView_xmlid);
        foreignNum.setText(currentitem.getStoreArNumbers());

//        TextView nativeNumLiteral = (TextView) item.findViewById(R.id.nativeLangNum_xmlid);
//        nativeNumLiteral.setText(currentitem.getStorermNumbers());

        return item;
    }
}
