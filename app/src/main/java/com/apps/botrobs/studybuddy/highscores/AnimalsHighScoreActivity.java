package com.apps.botrobs.studybuddy.highscores;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.BIquizCategories.AnimalsCategory;
import com.apps.botrobs.studybuddy.ChooseNormalActivity;
import com.apps.botrobs.studybuddy.MainAppActivity;
import com.apps.botrobs.studybuddy.R;

public class AnimalsHighScoreActivity extends AppCompatActivity {

    TextView txtScore, txtHighScore, TVcategoryname;
    Button btnPlayAgain;
    ImageView imageHighscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        txtScore = (TextView)findViewById(R.id.textScore);
        txtHighScore = (TextView)findViewById(R.id.textHighScore);
        TVcategoryname = (TextView)findViewById(R.id.TVcategoryname);
        btnPlayAgain = (Button) findViewById(R.id.btnPlayAgain);
        imageHighscore =(ImageView) findViewById(R.id.imageHighscore);
        //FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        TVcategoryname.setText("Animals");

        int requestCode;

        Intent i = getIntent();
        requestCode = (int) i.getExtras().get("viewAnimals");
        switch (requestCode) {
            //AFTER THE GAME
            case 0:
                Intent intent = getIntent();
                int score = intent.getIntExtra("scoreAnimals", 0);
                txtScore.setText("Your score: " + score);

                SharedPreferences mypref = getSharedPreferences("animals", 0);
                int highscore = mypref.getInt("animalHighscore", 0);

                if (highscore >= score){
                    txtHighScore.setText("High Score: "+ highscore);
                }
                else {
                    txtHighScore.setText("New Highscore "+ score);
                    SharedPreferences.Editor editor = mypref.edit();
                    editor.putInt("animalHighscore", score);
                    editor.commit();
                }
                imageHighscore.setVisibility(View.VISIBLE);
                imageHighscore.setImageResource(R.drawable.animals_normal);
                break;
            //INDIVIDUAL VIEWING
            case 1: {
                SharedPreferences animals = getSharedPreferences("animals",0);
                int animalsHighscore = animals.getInt("animalHighscore", 0);
                txtHighScore.setText("Highscore: " + String.valueOf(animalsHighscore));

                //ADDED
                btnPlayAgain.setText("Play");
                btnPlayAgain.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_playresume_hs, 0, 0,0);
                txtScore.setVisibility(View.GONE);
                imageHighscore.setImageResource(R.drawable.animals_normal);
                break;
            }
            //SURVIVAL MODE HIGHSCORE
            case 2: {
                Intent animalsSurvival = getIntent();
                int scoreS = animalsSurvival.getIntExtra("scoreAnimalsS", 0);
                txtScore.setText("Your score: " +scoreS);

                SharedPreferences survivalAnimalScore = getSharedPreferences("animalSurvival", 0);
                int highscoreS = survivalAnimalScore.getInt("animalSurvivalHS", 0);

                if (highscoreS >= scoreS){
                    txtHighScore.setText("High score: " +highscoreS);
                }
                else{
                    txtHighScore.setText("New Highscore " + scoreS);
                    SharedPreferences.Editor editorS = survivalAnimalScore.edit();
                    editorS.putInt("animalSurvivalHS", scoreS);
                    editorS.commit();
                }
                break;
            }
            //SURVIVAL VIEW HIGHSCORE INDIVIDUAL
            case 3: {
                SharedPreferences animalsS = getSharedPreferences("animalSurvival",0);
                int animalSurvivalHS = animalsS.getInt("animalSurvivalHS", 0);
                txtHighScore.setText("Animals Survival " + String.valueOf(animalSurvivalHS));
                break;
            }
        }
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ChooseNormalActivity.class));
        finish();
    }

    public void playAgain(View view) {
        startActivity(new Intent(AnimalsHighScoreActivity.this, AnimalsCategory.class));
        finish();
    }

    public void gotoHomeAgainHS(View view) {
        startActivity(new Intent(AnimalsHighScoreActivity.this, MainAppActivity.class));
        finish();
    }

    public void gotoMenuChoose(View view) {
        startActivity(new Intent(this, ChooseNormalActivity.class));
        finish();
    }
}
