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
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView number, colors, family, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        number = (TextView) findViewById(R.id.numbers);
        colors = (TextView) findViewById(R.id.colors);
        family = (TextView) findViewById(R.id.family);
        phrases = (TextView) findViewById(R.id.phrases);

        number.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numIntent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent colorntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorntent);
            }
        });
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


    }



}
