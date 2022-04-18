package com.apps.botrobs.studybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.apps.botrobs.studybuddy.BIquizCategories.MathCategory;
import com.apps.botrobs.studybuddy.highscores.AnimalsHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.EngineeringHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.EnglishHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.FilipinoHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.FoodsHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.HistoryHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.PlacesHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.ProgrammingHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.RandomHighScoreActivity;
import com.apps.botrobs.studybuddy.highscores.ScienceHighScoreActivity;
import com.apps.botrobs.studybuddy.survival.AnimalsCategorySurvival;
import com.apps.botrobs.studybuddy.survival.EngineeringCategorySurvival;
import com.apps.botrobs.studybuddy.survival.EnglishCategorySurvival;
import com.apps.botrobs.studybuddy.survival.FilipinoCategorySurvival;
import com.apps.botrobs.studybuddy.survival.FoodsCategorySurvival;
import com.apps.botrobs.studybuddy.survival.HistoryCategorySurvival;
import com.apps.botrobs.studybuddy.survival.PlacesCategorySurvival;
import com.apps.botrobs.studybuddy.survival.ProgrammingCategorySurvival;
import com.apps.botrobs.studybuddy.survival.RandomCategorySurvival;
import com.apps.botrobs.studybuddy.survival.ScienceCategorySurvival;

public class ChooseSurvivalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_survival);
    }

    //SURVIVAL MODE
    public void gotoanimalsSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, AnimalsCategorySurvival.class));
        finish();
    }

    public void gotoengineeringSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, EngineeringCategorySurvival.class));
        finish();
    }

    public void gotoenglishSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, EnglishCategorySurvival.class));
        finish();
    }

    public void gotofilipinoSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, FilipinoCategorySurvival.class));
        finish();
    }

    public void gotofoodsSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, FoodsCategorySurvival.class));
        finish();
    }

    public void gotohistorySurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, HistoryCategorySurvival.class));
        finish();
    }

    public void gotoplacesSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, PlacesCategorySurvival.class));
        finish();
    }

    public void gotoprogrammingSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, ProgrammingCategorySurvival.class));
        finish();
    }

    public void gotorandomSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, RandomCategorySurvival.class));
        finish();
    }

    public void gotoscienceSurvival(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, ScienceCategorySurvival.class));
        finish();
    }

    //INDIVIDUAL HIGHSCORE
    public void gotoanimalsSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, AnimalsHighScoreActivity.class);
                i.putExtra("viewAnimals", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoengineeringSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, EngineeringHighScoreActivity.class);
                i.putExtra("viewEngineering", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoenglishSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, EnglishHighScoreActivity.class);
                i.putExtra("viewEnglish", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotofilipinoSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, FilipinoHighScoreActivity.class);
                i.putExtra("viewFilipino", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotofoodsSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, FoodsHighScoreActivity.class);
                i.putExtra("viewFoods", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotohistorySHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, HistoryHighScoreActivity.class);
                i.putExtra("viewHistory", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoplacesSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, PlacesHighScoreActivity.class);
                i.putExtra("viewPlaces", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoprogrammingSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, ProgrammingHighScoreActivity.class);
                i.putExtra("viewProgramming", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotorandomSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, RandomHighScoreActivity.class);
                i.putExtra("viewRandom", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoscienceSHS(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseSurvivalActivity.this, ScienceHighScoreActivity.class);
                i.putExtra("viewScience", 3);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoMath(View view) {
        startActivity(new Intent(ChooseSurvivalActivity.this, MathCategory.class));
    }
}
