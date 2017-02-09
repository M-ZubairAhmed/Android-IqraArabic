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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView openNumbersActivity;
    private TextView openFamilyActivity;
    private TextView openColorsActivity;
    private TextView openPhrasesActivity;
    private Intent openActivitiesIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openNumbersActivity = (TextView) findViewById(R.id.numbers_IDxml);
        openFamilyActivity = (TextView) findViewById(R.id.family_IDxml);
        openColorsActivity = (TextView) findViewById(R.id.colors_IDxml);
        openPhrasesActivity = (TextView) findViewById(R.id.phrases_IDxml);

        openNumbersActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitiesIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(openActivitiesIntent);
            }
        });
    }

}
