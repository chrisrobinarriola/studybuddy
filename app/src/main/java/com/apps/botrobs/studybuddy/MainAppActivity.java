package com.apps.botrobs.studybuddy;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apps.botrobs.studybuddy.BIquizCategories.EngineeringCategory;

public class MainAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
    }

    public void gotoMyQuiz(View view) {
        startActivity(new Intent(MainAppActivity.this, QMmainActivity.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }

    public void gotoPlayQuizzes(View view) {
        //startActivity(new Intent(MainAppActivity.this, ChooseTabActivity.class));
        startActivity(new Intent(MainAppActivity.this, ChooseNormalActivity.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }

    public void gotoAbout(View view) {
        startActivity(new Intent(MainAppActivity.this, FeedBackActivity.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }

    public void gotoAllHighscore(View view) {
        startActivity(new Intent(MainAppActivity.this, AllHighScoresActivity.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder1= new AlertDialog.Builder(MainAppActivity.this);
        builder1.setTitle("You are leaving?");
        builder1.setMessage("Are you sure you want to exit?");
        builder1.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //WILL DO NOTHING
            }
        });
        builder1.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        builder1.create();
        AlertDialog alert = builder1.create();
        alert.show();
        Button nbutton = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
        nbutton.setTextColor(Color.RED);
        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);
        pbutton.setTextColor(Color.BLACK);
    }

    public void gotosurvival(View view) {
        startActivity(new Intent(this, ChooseSurvivalActivity.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }
}
