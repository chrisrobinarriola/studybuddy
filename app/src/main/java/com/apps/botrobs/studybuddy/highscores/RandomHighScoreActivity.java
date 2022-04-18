package com.apps.botrobs.studybuddy.highscores;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.BIquizCategories.RandomCategory;
import com.apps.botrobs.studybuddy.ChooseNormalActivity;
import com.apps.botrobs.studybuddy.MainAppActivity;
import com.apps.botrobs.studybuddy.R;

public class RandomHighScoreActivity extends AppCompatActivity {

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
        imageHighscore =(ImageView)findViewById(R.id.imageHighscore);

        TVcategoryname.setText("In this category, you will get Random questions to be answered.");

        int requestCode;

        Intent i = getIntent();
        requestCode = (int) i.getExtras().get("viewRandom");
        switch (requestCode) {
            //AFTER THE GAME
            case 0:
                Intent intent = getIntent();
                int score = intent.getIntExtra("scoreRandom", 0);
                txtScore.setText("Your score: " + score);

                SharedPreferences mypref = getSharedPreferences("random", 0);
                int highscore = mypref.getInt("randomHighscore", 0);

                if (highscore >= score){
                    txtHighScore.setText("High Score: "+ highscore);
                }
                else {
                    txtHighScore.setText("New Highscore "+ score);
                    SharedPreferences.Editor editor = mypref.edit();
                    editor.putInt("randomHighscore", score);
                    editor.commit();
                }
                imageHighscore.setVisibility(View.VISIBLE);
                imageHighscore.setImageResource(R.drawable.random_normal);
                break;
            //INDIVIDUAL VIEWING
            case 1: {
                SharedPreferences random = getSharedPreferences("random",0);
                int randomHighscore = random.getInt("randomHighscore", 0);
                txtHighScore.setText("Highscore: " + String.valueOf(randomHighscore));

                //ADDED
                btnPlayAgain.setText("Play");
                btnPlayAgain.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_playresume_hs, 0, 0,0);
                txtScore.setVisibility(View.GONE);
                imageHighscore.setImageResource(R.drawable.random_normal);
                break;
            }
            case 2: {
                Intent randomSurvival = getIntent();
                int scoreS = randomSurvival.getIntExtra("scoreRandomS", 0);
                txtScore.setText("Your score: " +scoreS);

                SharedPreferences survivalRandomcore = getSharedPreferences("randomSurvival", 0);
                int highscoreS = survivalRandomcore.getInt("randomSurvivalHS", 0);

                if (highscoreS >= scoreS){
                    txtHighScore.setText("High score: " + highscoreS);
                }
                else{
                    txtHighScore.setText("New Highscore" + scoreS);
                    SharedPreferences.Editor editorS = survivalRandomcore.edit();
                    editorS.putInt("randomSurvivalHS", scoreS);
                    editorS.commit();
                }
                break;
            }
            //SURVIVAL VIEW HIGHSCORE INDIVIDUAL
            case 3: {
                SharedPreferences randomS = getSharedPreferences("randomSurvival",0);
                int randomSurvivalHS = randomS.getInt("randomSurvivalHS", 0);
                txtHighScore.setText("Random Survival " + String.valueOf(randomSurvivalHS));
                break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(RandomHighScoreActivity.this, ChooseNormalActivity.class));
        finish();
    }

    public void playAgain(View view) {
        startActivity(new Intent(RandomHighScoreActivity.this, RandomCategory.class));
        finish();
    }

    public void gotoHomeAgainHS(View view) {
        startActivity(new Intent(RandomHighScoreActivity.this, MainAppActivity.class));
        finish();
    }

    public void gotoMenuChoose(View view) {
        startActivity(new Intent(this, ChooseNormalActivity.class));
        finish();
    }
}
