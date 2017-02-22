package com.example.android.LearnLanguage;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterCustom extends ArrayAdapter<Words> {

    public AdapterCustom(Context context, ArrayList<Words> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        if (item == null){
            item = LayoutInflater.from(getContext()).inflate(R.layout.customlistlayout, parent, false);
        }

        Words currentItem = getItem(position);

        TextView nativeText = (TextView) item.findViewById(R.id.nativeLangTextView_xmlid);
        nativeText.setText(currentItem.getTextInNatv());

        TextView fornText = (TextView) item.findViewById(R.id.foreignLangTextView_xmlid);
        fornText.setText(currentItem.getTextInForn());

        ImageView sideIcon = (ImageView) item.findViewById(R.id.imageID_Lang);
        sideIcon.setImageResource(currentItem.getPicOnLeft());

        return item;
    }
}
