package com.apps.botrobs.studybuddy.QuizMakerFeature;

import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MyRadioGroup {
    private ArrayList<RadioButton> radioButtons = new ArrayList<>();


    public void addButton(RadioButton radioButton)
    {
        radioButtons.add(radioButton);
        radioButton.setOnClickListener(onClick);
    }

    public void removeButton(RadioButton radioButton)
    {
        radioButtons.remove(radioButton);
    }

    private View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                for(RadioButton radioButton : radioButtons)
                {
                    radioButton.setChecked(false);
                }

            ((RadioButton) view).setChecked(true);
        }
    };
}
