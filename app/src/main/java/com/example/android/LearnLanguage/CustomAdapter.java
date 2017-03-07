package com.example.android.LearnLanguage;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Words> {
    Activity activity;
    ArrayList<Words> arrayList;

    public CustomAdapter(Activity context, ArrayList<Words> arrayList) {
        super(context, 0, arrayList);
        this.activity = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        Words currentitem = getItem(position);
        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        }
        TextView englishText = (TextView) view.findViewById(R.id.english_words_xmlid);
        TextView arabicText = (TextView) view.findViewById(R.id.arabic_words_xmlid);
        ImageView pictureRep = (ImageView) view.findViewById(R.id.picture_rep_xmlid);
        if (currentitem.hasPictureRep()){
            pictureRep.setImageResource(currentitem.getPictureRep());
            pictureRep.setVisibility(View.VISIBLE);
        }
        else {
            pictureRep.setVisibility(View.GONE);
        }

        englishText.setText(currentitem.getEnglishWords());
        arabicText.setText(currentitem.getArabicWords());

        return view;
    }
}
