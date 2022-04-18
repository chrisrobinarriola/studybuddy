package com.apps.botrobs.studybuddy.QuizMakerFeature;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.apps.botrobs.studybuddy.Backend.Answer;
import com.apps.botrobs.studybuddy.Backend.Question;
import com.apps.botrobs.studybuddy.QMmainActivity;
import com.apps.botrobs.studybuddy.R;

import java.util.ArrayList;

public class PlayQuiz extends AppCompatActivity {

    private GameState gs;
    private Button correctButton;
    private boolean quizDone = false;
    private Button nextButton;
    private LinearLayout answerButtonList;
    private ArrayList<Answer> answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qmactivity_play_quiz);

        Intent intent = getIntent();
        gs = (GameState) intent.getExtras().get("gameState");

        nextButton = (Button) findViewById(R.id.next_question_button);
        answerButtonList = (LinearLayout) findViewById(R.id.answer_button_list);
        playQuiz();
    }


    private void playQuiz() {
        TextView textView = (TextView) findViewById(R.id.play_quiz_question_name);
        Question currentQuestion = gs.getQuestion();
        textView.setText(currentQuestion.getQuestion());
        answerButtonList.removeAllViews();

        answers = currentQuestion.getAnswers();

        LayoutInflater layoutInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        for (Answer answer : answers) {
            Button answerButton = (Button) layoutInflater.inflate(R.layout.qmanswer_button, null);
            answerButton.setText(answer.getAnswer());
            //answerButtonList.addView(answerButton);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params.setMargins(0, 20, 0, 20);
            answerButtonList.addView(answerButton, params);
            setButtonOnClick(answerButton);

            answerButton.setEnabled(true);

            if (answer == currentQuestion.getCorrectAnswer()) {
                correctButton = answerButton;
            }
        }
    }

    private void setButtonOnClick(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = answerButtonList.indexOfChild(view);
                if(gs.answerQuestion(answers.get(position))){
                    win();
                    for (int i = 0; i < answerButtonList.getChildCount(); i++) {
                        View child = answerButtonList.getChildAt(i);
                        child.setEnabled(false);
                    }
                }
                else{
                    lose((Button) view);
                }
            }
        });
    }


    //When the back button was pressed
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(PlayQuiz.this);
        builder.setTitle("Are you sure you want to quit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(PlayQuiz.this, QMmainActivity.class));
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create();
        builder.show();
    }

    private void win() {
        if (!quizDone) {
            correctButton.setBackgroundColor(Color.rgb(0, 230, 0));
            correctButton.setEnabled(false);
            quizDone = true;
            updateButton();
        }
    }

    private void lose(Button button) {
        if (!quizDone) {
            correctButton.setBackgroundColor(Color.rgb(0, 230, 0));
            button.setBackgroundColor(Color.rgb(230, 0, 0));
            quizDone = true;
            button.setEnabled(false);
            correctButton.setEnabled(false);
            updateButton();
        }
    }

    private void updateButton() {
        nextButton.setVisibility(View.VISIBLE);
        if (!gs.hasQuestion()) {
            nextButton.setText("Finish");
        }
    }

    public void nextQuestion(View view) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("gameState", gs);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}

