package com.apps.botrobs.studybuddy.BIquizCategories;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.ChooseNormalActivity;
import com.apps.botrobs.studybuddy.R;

public class MathCategory extends AppCompatActivity {

    TextView additionHS, subtractionHS, multiplicationHS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_choose);

        additionHS = (TextView)findViewById(R.id.additionHS);
        subtractionHS = (TextView)findViewById(R.id.subtractionHS);
        multiplicationHS = (TextView)findViewById(R.id.multiplicationHS);

        SharedPreferences addition = getSharedPreferences("addition",0);
        int additionHighscore = addition.getInt("additionHighscore", 0);
        additionHS.setText(""+String.valueOf(additionHighscore));

        SharedPreferences subtraction = getSharedPreferences("subtraction",0);
        int subtractionHighscore = subtraction.getInt("subtractionHighscore", 0);
        subtractionHS.setText(""+String.valueOf(subtractionHighscore));

        SharedPreferences multiplication = getSharedPreferences("multiplication",0);
        int multiplicationHighscore = multiplication.getInt("multiplicationHighscore", 0);
        multiplicationHS.setText(""+String.valueOf(multiplicationHighscore));

    }

    public void gotoaddition(View view) {
        startActivity(new Intent(MathCategory.this, MathCategoryAddition.class));
        finish();
    }

    public void gotosubtraction(View view) {
        startActivity(new Intent(MathCategory.this, MathCategorySubtraction.class));
        finish();
    }

    public void gotomultiplication(View view) {
        startActivity(new Intent(MathCategory.this, MathCategoryMultiplication.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MathCategory.this, ChooseNormalActivity.class));
        finish();
    }
}
