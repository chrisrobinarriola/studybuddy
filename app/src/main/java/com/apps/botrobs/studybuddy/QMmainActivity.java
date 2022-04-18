package com.apps.botrobs.studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apps.botrobs.studybuddy.Backend.Score;
import com.apps.botrobs.studybuddy.QuizMakerFeature.CreateQuiz;
import com.apps.botrobs.studybuddy.QuizMakerFeature.QuizMenu;
import com.apps.botrobs.studybuddy.QuizMakerFeature.QuizMenuCreate;

public class QMmainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qmactivity_main);

        Score.initialize(this);
    }

    public void createMenu(View view){
        Intent intent = new Intent(this, QuizMenuCreate.class);
        intent.putExtra("requestCode", 1);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void playMenu(View view) {
        Intent intent = new Intent(this, QuizMenu.class);
        intent.putExtra("requestCode", 0);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void createNew(View view) {
        Intent intent = new Intent(this, CreateQuiz.class);
        intent.putExtra("requestCode", 0);
        startActivity(intent);
    }

    public void viewMenu(View view) {
        Intent intent = new Intent(this, QuizMenu.class);
        intent.putExtra("requestCode", 1);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QMmainActivity.this, MainAppActivity.class));
        finish();
    }
}
