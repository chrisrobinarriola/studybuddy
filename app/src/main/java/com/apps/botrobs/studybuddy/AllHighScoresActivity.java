package com.apps.botrobs.studybuddy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AllHighScoresActivity extends AppCompatActivity {

    TextView TVanimalHS, TVengineeringHS, TVenglishHS, TVfilipinoHS, TVfoodsHS, TVhistoryHS, TVplacesHS, TVprogrammingHS, TVrandomHS, TVscienceHS,
            TVanimalsSurvivalHS, TVengineeringSurvivalHS, TVenglishSurvivalHS, TVfilipinoSurvivalHS, TVfoodsSurvivalHS, TVhistorySurvivalHS, TVplacesSurvivalHS, TVprogrammingSurvivalHS, TVrandomSurvivalHS, TVscienceSurvivalHS;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(AllHighScoresActivity.this, MainAppActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_high_scores);

        TVanimalHS = (TextView) findViewById(R.id.TVanimalsHS);
        TVengineeringHS = (TextView) findViewById(R.id.TVengineeringHS);
        TVenglishHS = (TextView) findViewById(R.id.TVenglishHS);
        TVfilipinoHS = (TextView) findViewById(R.id.TVfilipinoHS);
        TVfoodsHS = (TextView) findViewById(R.id.TVfoodsHS);
        TVhistoryHS = (TextView) findViewById(R.id.TVhistoryHS);
        TVplacesHS = (TextView) findViewById(R.id.TVplacesHS);
        TVprogrammingHS = (TextView) findViewById(R.id.TVprogrammingHS);
        TVrandomHS = (TextView) findViewById(R.id.TVrandomHS);
        TVscienceHS = (TextView) findViewById(R.id.TVscienceHS);

        SharedPreferences animals = getSharedPreferences("animals",0);
        int animalHighscore = animals.getInt("animalHighscore", 0);
        TVanimalHS.setText(" " + String.valueOf(animalHighscore));

        SharedPreferences engineering = getSharedPreferences("engineering",0);
        int engineeringHighscore = engineering.getInt("engineeringHighscore", 0);
        TVengineeringHS.setText(" " + String.valueOf(engineeringHighscore));

        SharedPreferences english = getSharedPreferences("english",0);
        int englishHighscore = english.getInt("englishHighscore", 0);
        TVenglishHS.setText(" " + String.valueOf(englishHighscore));

        SharedPreferences filipino = getSharedPreferences("filipino",0);
        int filipinoHighscore = filipino.getInt("filipinoHighscore", 0);
        TVfilipinoHS.setText(" " + String.valueOf(filipinoHighscore));

        SharedPreferences foods = getSharedPreferences("foods",0);
        int foodsHighscore = foods.getInt("foodsHighscore", 0);
        TVfoodsHS.setText(" " + String.valueOf(foodsHighscore));

        SharedPreferences history = getSharedPreferences("history",0);
        int historyHighscore = history.getInt("historyHighscore", 0);
        TVhistoryHS.setText(" " + String.valueOf(historyHighscore));

        SharedPreferences places = getSharedPreferences("places",0);
        int placesHighscore = places.getInt("placesHighscore", 0);
        TVplacesHS.setText(" " + String.valueOf(placesHighscore));

        SharedPreferences programming = getSharedPreferences("programming",0);
        int programmingHighscore = programming.getInt("programmingHighscore", 0);
        TVprogrammingHS.setText(" " + String.valueOf(programmingHighscore));

        SharedPreferences random = getSharedPreferences("random",0);
        int randomHighscore = random.getInt("randomHighscore", 0);
        TVrandomHS.setText(" " + String.valueOf(randomHighscore));

        SharedPreferences science = getSharedPreferences("science",0);
        int scienceHighscore = science.getInt("scienceHighscore", 0);
        TVscienceHS.setText(" " + String.valueOf(scienceHighscore));

        //SURVIVAL MODE
        /*TVanimalsSurvivalHS = (TextView) findViewById(R.id.TVanimalsSurvivalHS);
        TVengineeringSurvivalHS = (TextView) findViewById(R.id.TVengineeringSurvivalHS);
        TVenglishSurvivalHS = (TextView) findViewById(R.id.TVenglishSurvivalHS);
        TVfilipinoSurvivalHS = (TextView) findViewById(R.id.TVfilipinoSurvivalHS);
        TVfoodsSurvivalHS = (TextView) findViewById(R.id.TVfoodsSurvivalHS);
        TVhistorySurvivalHS = (TextView) findViewById(R.id.TVhistorySurvivalHS);
        TVplacesSurvivalHS = (TextView) findViewById(R.id.TVplacesSurvivalHS);
        TVprogrammingSurvivalHS = (TextView) findViewById(R.id.TVprogrammingSurvivalHS);
        TVrandomSurvivalHS = (TextView) findViewById(R.id.TVrandomSurvivalHS);
        TVscienceSurvivalHS = (TextView) findViewById(R.id.TVscienceSurvivalHS);*/

        //SURVIVAL MODE HIGHSCORES
        /*SharedPreferences animalsS = getSharedPreferences("animalSurvival",0);
        int animalSurvivalHS = animalsS.getInt("animalSurvivalHS", 0);
        TVanimalsSurvivalHS.setText("Animals Survival " + String.valueOf(animalSurvivalHS));

        SharedPreferences engineeringS = getSharedPreferences("engineeringSurvival",0);
        int engineeringSurvivalHS = engineeringS.getInt("engineeringSurvivalHS", 0);
        TVengineeringSurvivalHS.setText("Engineering Survival " + String.valueOf(engineeringSurvivalHS));

        SharedPreferences englishS = getSharedPreferences("englishSurvival",0);
        int englishSurvivalHS = englishS.getInt("englishSurvivalHS", 0);
        TVenglishSurvivalHS.setText("English Survival " + String.valueOf(englishSurvivalHS));

        SharedPreferences filipinoS = getSharedPreferences("filipinoSurvival",0);
        int filipinoSurvivalHS = filipinoS.getInt("filipinoSurvivalHS", 0);
        TVfilipinoSurvivalHS.setText("Filipino Survival " + String.valueOf(filipinoSurvivalHS));

        SharedPreferences foodsS = getSharedPreferences("foodsSurvival",0);
        int foodsSurvivalHS = foodsS.getInt("foodsSurvivalHS", 0);
        TVfoodsSurvivalHS.setText("Foods Survival " + String.valueOf(foodsSurvivalHS));

        SharedPreferences historyS = getSharedPreferences("historySurvival",0);
        int historySurvivalHS = historyS.getInt("historySurvivalHS", 0);
        TVhistorySurvivalHS.setText("History Survival " + String.valueOf(historySurvivalHS));

        SharedPreferences placesS = getSharedPreferences("placesSurvival",0);
        int placesSurvivalHS = placesS.getInt("placesSurvivalHS", 0);
        TVplacesSurvivalHS.setText("Places Survival " + String.valueOf(placesSurvivalHS));

        SharedPreferences programmingS = getSharedPreferences("programmingSurvival",0);
        int programmingSurvivalHS = programmingS.getInt("programmingSurvivalHS", 0);
        TVprogrammingSurvivalHS.setText("Programming Survival " + String.valueOf(programmingSurvivalHS));

        SharedPreferences randomS = getSharedPreferences("randomSurvival",0);
        int randomSurvivalHS = randomS.getInt("randomSurvivalHS", 0);
        TVrandomSurvivalHS.setText("Random Survival " + String.valueOf(randomSurvivalHS));

        SharedPreferences scienceS = getSharedPreferences("scienceSurvival",0);
        int scienceSurvivalHS = scienceS.getInt("scienceSurvivalHS", 0);
        TVscienceSurvivalHS.setText("Science Survival " + String.valueOf(scienceSurvivalHS));*/
    }
}
