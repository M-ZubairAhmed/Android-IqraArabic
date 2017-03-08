/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.LearnLanguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Intent openActivitiesIntent;
    private LinearLayout openNumbersActivity;
    private LinearLayout openFamilyActivity;
    private LinearLayout openColorsActivity;
    private LinearLayout openPhrasesActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openNumbersActivity = (LinearLayout) findViewById(R.id.numbers_IDxml);
        openFamilyActivity = (LinearLayout) findViewById(R.id.family_IDxml);
        openColorsActivity = (LinearLayout) findViewById(R.id.colors_IDxml);
        openPhrasesActivity = (LinearLayout) findViewById(R.id.phrases_IDxml);

        openNumbersActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitiesIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(openActivitiesIntent);
            }
        });

        openFamilyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitiesIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(openActivitiesIntent);
            }
        });

        openColorsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitiesIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(openActivitiesIntent);
            }
        });

        openPhrasesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitiesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(openActivitiesIntent);
            }
        });


    }

}
