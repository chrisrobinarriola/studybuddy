package com.apps.botrobs.studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.apps.botrobs.studybuddy.BIquizCategories.AnimalsCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.EngineeringCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.EnglishCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.FilipinoCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.FoodsCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.HistoryCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.MathCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.PlacesCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.ProgrammingCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.RandomCategory;
import com.apps.botrobs.studybuddy.BIquizCategories.ScienceCategory;
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

public class ChooseNormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_normal);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ChooseNormalActivity.this, MainAppActivity.class));
        finish();
    }

    public void gotoRandom(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, RandomCategory.class));
        finish();
    }

    public void gotoProgramming(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, ProgrammingCategory.class));
        finish();
    }

    public void gotoScience(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, ScienceCategory.class));
        finish();
    }

    public void gotoFilipino(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, FilipinoCategory.class));
        finish();
    }

    public void gotoEnglish(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, EnglishCategory.class));
        finish();
    }

    public void gotoHistory(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, HistoryCategory.class));
        finish();
    }

    public void gotoAnimals(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, AnimalsCategory.class));
        finish();
    }

    public void gotoFoods(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, FoodsCategory.class));
        finish();
    }

    public void gotoPlaces(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, PlacesCategory.class));
        finish();
    }

    public void gotoEngineering(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, EngineeringCategory.class));
        finish();
    }

    public void gotoAllHighscore(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, AllHighScoresActivity.class));
        finish();
    }

    //THREE DOTTED MENU IN THE BOTTOM
    public void randompopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, RandomHighScoreActivity.class);
                i.putExtra("viewRandom", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void programmingpopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, ProgrammingHighScoreActivity.class);
                i.putExtra("viewProgramming", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void sciencepopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, ScienceHighScoreActivity.class);
                i.putExtra("viewScience", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void filipinopopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, FilipinoHighScoreActivity.class);
                i.putExtra("viewFilipino", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void englishpopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, EnglishHighScoreActivity.class);
                i.putExtra("viewEnglish", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void historypopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, HistoryHighScoreActivity.class);
                i.putExtra("viewHistory", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void animalspopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, AnimalsHighScoreActivity.class);
                i.putExtra("viewAnimals", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void foodpopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, FoodsHighScoreActivity.class);
                i.putExtra("viewFoods", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void placespopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, PlacesHighScoreActivity.class);
                i.putExtra("viewPlaces", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void engineeringpopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.hsview, popup.getMenu());
        popup.show();

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(ChooseNormalActivity.this, EngineeringHighScoreActivity.class);
                i.putExtra("viewEngineering", 1);
                startActivity(i);
                finish();
                return true;
            }
        });
    }

    public void gotoMath(View view) {
        startActivity(new Intent(ChooseNormalActivity.this, MathCategory.class));
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
        finish();
    }
}
