package com.apps.botrobs.studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ChooseTabActivity extends AppCompatActivity {

    private static final String TAG = "QMmainActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosetab);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1_fragment(), "TAB1");
        adapter.addFragment(new tab2_fragment(), "TAB2");
        viewPager.setAdapter(adapter);
    }

    public void gotochoosenormal(View view) {
        startActivity(new Intent(ChooseTabActivity.this, ChooseNormalActivity.class));
    }

    public void gotochoosesurvival(View view) {
        startActivity(new Intent(ChooseTabActivity.this, ChooseSurvivalActivity.class));
    }
}
