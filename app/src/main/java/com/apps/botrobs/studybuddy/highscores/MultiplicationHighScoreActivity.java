package com.apps.botrobs.studybuddy.highscores;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.BIquizCategories.MathCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.MathCategoryMultiplication;
import com.apps.botrobs.studybuddy.MainAppActivity;
import com.apps.botrobs.studybuddy.R;

public class MultiplicationHighScoreActivity extends AppCompatActivity {

    TextView txtScore, txtHighScore, TVcategoryname;
    ImageView imageHighscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        txtScore = (TextView)findViewById(R.id.textScore);
        txtHighScore = (TextView)findViewById(R.id.textHighScore);
        TVcategoryname = (TextView)findViewById(R.id.TVcategoryname);
        imageHighscore = (ImageView)findViewById(R.id.imageHighscore);
        imageHighscore.setVisibility(View.VISIBLE);
        imageHighscore.setImageResource(R.drawable.multiplication);

        TVcategoryname.setText("In this category, you will get Multiplication equations to be answered.");

        Intent intent = getIntent();
        int score = intent.getIntExtra("scoreMultiplication", 0);
        txtScore.setText("Your score: " + score);

        SharedPreferences mypref = getSharedPreferences("multiplication", 0);
        int highscore = mypref.getInt("multiplicationHighscore", 0);

        if (highscore >= score){
            txtHighScore.setText("High Score: "+ highscore);
        }
        else {
            txtHighScore.setText("New Highscore "+ score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("multiplicationHighscore", score);
            editor.commit();
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MathCategory.class));
        finish();
        super.onBackPressed();
    }

    public void playAgain(View view) {
        startActivity(new Intent(this, MathCategoryMultiplication.class));
        finish();
    }

    public void gotoMenuChoose(View view) {
        startActivity(new Intent(this, MathCategory.class));
        finish();
    }

    public void gotoHomeAgainHS(View view) {
        startActivity(new Intent(this, MainAppActivity.class));
        finish();
    }
}
