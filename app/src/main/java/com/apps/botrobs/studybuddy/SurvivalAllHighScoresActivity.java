package com.apps.botrobs.studybuddy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SurvivalAllHighScoresActivity extends AppCompatActivity {

    TextView TVanimalsSurvivalHS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_high_scores);

        //SURVIVAL MODE HIGHSCORES
        SharedPreferences animalsS = getSharedPreferences("animalSurvival",0);
        int animalSurvivalHS = animalsS.getInt("animalSurvivalHS", 0);
        TVanimalsSurvivalHS.setText("Animals Survival " + String.valueOf(animalSurvivalHS));
    }
}
