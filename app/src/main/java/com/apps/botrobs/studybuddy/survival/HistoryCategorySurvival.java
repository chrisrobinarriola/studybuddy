package com.apps.botrobs.studybuddy.survival;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.QuestionBank;
import com.apps.botrobs.studybuddy.R;
import com.apps.botrobs.studybuddy.highscores.HistoryHighScoreActivity;

import java.util.Locale;

public class HistoryCategorySurvival extends AppCompatActivity {
    QuestionBank mQuestionLibrary = new QuestionBank();

    TextView currentQuestion, score, mQuestionView, TVcountdown;
    Button mButtonChoice1, mButtonChoice2, mButtonChoice3, mButtonChoice4, btnNext;
    ImageButton btnPause;
    ImageView life1, life2, life3;

    CountDownTimer timer;
    //NEWLY ADDED
    boolean timerRunning;
    long mTimeLeftInMillis = 11000;

    String mAnswer;
    int mScore, questions, mQuestionNumber, timeScore = 0;
    int life = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_quiz);

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setVisibility(View.GONE);

        TVcountdown = (TextView)findViewById(R.id.TVcountdown);
        score = (TextView)findViewById(R.id.score);
        currentQuestion = (TextView)findViewById(R.id.questionNumber);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);

        life1 = (ImageView)findViewById(R.id.life1);
        life2 = (ImageView)findViewById(R.id.life2);
        life3 = (ImageView)findViewById(R.id.life3);

        btnPause = (ImageButton)findViewById(R.id.btnPause);

        final AlertDialog.Builder builder = new AlertDialog.Builder(HistoryCategorySurvival.this);
        LayoutInflater inflater = LayoutInflater.from(HistoryCategorySurvival.this);
        View view = inflater.inflate(R.layout.inflater_game_rules, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();

        view.findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTheGame();
                alertDialog.dismiss();
            }
        });

        view.findViewById(R.id.TVexitRule).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void startTheGame(){
        mQuestionLibrary.initHistory(HistoryCategorySurvival.this);
        updateQuestion();
        updateScore(mScore);
        startCount();
    }

    private void updateQuestion(){
        if(mQuestionNumber <  50 ){
            mButtonChoice1.setEnabled(true);
            mButtonChoice2.setEnabled(true);
            mButtonChoice3.setEnabled(true);
            mButtonChoice4.setEnabled(true);

            mQuestionView.setText(mQuestionLibrary.getQuestionHistory(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoiceHistory(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoiceHistory(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoiceHistory(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoiceHistory(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswerHistory(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Intent i = new Intent(HistoryCategorySurvival.this, HistoryHighScoreActivity.class);
            i.putExtra("scoreHistoryS", mScore);
            i.putExtra("viewHistory", 0);
            startActivity(i);
            finish();
        }
    }

    // WILL SHOW THE CURRENT SCORE AND QUESTION NUMBER OF THE USER
    private void updateScore(int point) {
        score.setText("" +mScore);
        //currentQuestion.setText(""+questions);
    }

    public void onClick(View view) {
        //DISABLE THE MULTIPLE INPUT
        mButtonChoice1.setEnabled(false);
        mButtonChoice2.setEnabled(false);
        mButtonChoice3.setEnabled(false);
        mButtonChoice4.setEnabled(false);

        final Button answer = (Button) view;

        timer.cancel();

        if (answer.getText().equals(mAnswer)){
            mScore += timeScore;
            answer.setBackgroundColor(Color.GREEN);
            questions++;
        }
        else {
            answer.setBackgroundColor(Color.RED);
            if (mButtonChoice1.getText().equals(mAnswer)){
                mButtonChoice1.setBackgroundColor(Color.GREEN);
            }
            if (mButtonChoice2.getText().equals(mAnswer)){
                mButtonChoice2.setBackgroundColor(Color.GREEN);
            }
            if (mButtonChoice3.getText().equals(mAnswer)){
                mButtonChoice3.setBackgroundColor(Color.GREEN);
            }
            if (mButtonChoice4.getText().equals(mAnswer)){
                mButtonChoice4.setBackgroundColor(Color.GREEN);
            }
            questions++;
            life--;
            if (life==0){
                Intent i = new Intent(HistoryCategorySurvival.this, HistoryHighScoreActivity.class);
                i.putExtra("scoreHistoryS",mScore);
                i.putExtra("viewHistory", 2);
                startActivity(i);
                finish();
            }
            if (life == 2){
                life3.setVisibility(View.INVISIBLE);
            }
            if (life == 1){
                life2.setVisibility(View.INVISIBLE);
            }
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                TVcountdown.setTextColor(Color.BLACK);
                //DELAY FOR THE SCORE
                mButtonChoice1.setBackgroundColor(Color.WHITE);
                mButtonChoice2.setBackgroundColor(Color.WHITE);
                mButtonChoice3.setBackgroundColor(Color.WHITE);
                mButtonChoice4.setBackgroundColor(Color.WHITE);
                updateScore(mScore);
                updateQuestion();
                //pbTime.setProgress(100);
                timer.start();
            }
        }, 1000L);

    }

    private void startCount(){

        timerRunning = true;

        timer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                timeScore = (int)millisUntilFinished/1000;
                updateCountDownText();
                if (TVcountdown.getText().equals("00:03")){
                    TVcountdown.setTextColor(Color.RED);
                }
            }

            @Override
            public void onFinish() {
                TVcountdown.setText("00:00");

                timerRunning = false;
                mButtonChoice1.setEnabled(false);
                mButtonChoice2.setEnabled(false);
                mButtonChoice3.setEnabled(false);
                mButtonChoice4.setEnabled(false);

                if (mButtonChoice1.getText().equals(mAnswer)){
                    mButtonChoice1.setBackgroundColor(Color.GREEN);
                }
                if (mButtonChoice2.getText().equals(mAnswer)){
                    mButtonChoice2.setBackgroundColor(Color.GREEN);
                }
                if (mButtonChoice3.getText().equals(mAnswer)){
                    mButtonChoice3.setBackgroundColor(Color.GREEN);
                }
                if (mButtonChoice4.getText().equals(mAnswer)){
                    mButtonChoice4.setBackgroundColor(Color.GREEN);
                }
                btnNext.setText("Next");
            }
        }.start();
    }

    private void pauseTimer() {
        timer.cancel();
        timerRunning = false;
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        TVcountdown.setText(timeLeftFormatted);
    }

    public void nextQuestion(View view) {
        TVcountdown.setTextColor(Color.BLACK);
        btnNext.setText("Skip");
        timer.cancel();
        questions++;
        updateQuestion();
        updateScore(mScore);

        mButtonChoice1.setEnabled(true);
        mButtonChoice2.setEnabled(true);
        mButtonChoice3.setEnabled(true);
        mButtonChoice4.setEnabled(true);

        mButtonChoice1.setBackgroundColor(Color.WHITE);
        mButtonChoice2.setBackgroundColor(Color.WHITE);
        mButtonChoice3.setBackgroundColor(Color.WHITE);
        mButtonChoice4.setBackgroundColor(Color.WHITE);

        //pbTime.setProgress(100);
        timer.onTick(11000);
        startCount();
    }

    public void pauseGame(){
        mQuestionView.setVisibility(View.INVISIBLE);
        mButtonChoice1.setVisibility(View.INVISIBLE);
        mButtonChoice2.setVisibility(View.INVISIBLE);
        mButtonChoice3.setVisibility(View.INVISIBLE);
        mButtonChoice4.setVisibility(View.INVISIBLE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.inflater_pause, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        if (timerRunning) {
            pauseTimer();

            view.findViewById(R.id.TVresume).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                    startCount();
                    btnPause.setImageResource(R.drawable.ic_action_pause);
                    mQuestionView.setVisibility(View.VISIBLE);;
                    mButtonChoice1.setVisibility(View.VISIBLE);
                    mButtonChoice2.setVisibility(View.VISIBLE);
                    mButtonChoice3.setVisibility(View.VISIBLE);
                    mButtonChoice4.setVisibility(View.VISIBLE);
                }
            });

            view.findViewById(R.id.TVretry).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder1= new AlertDialog.Builder(HistoryCategorySurvival.this);
                    builder1.setTitle("You want to retry?");
                    builder1.setMessage("Are you sure you want to retry the quiz?");
                    builder1.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //WILL DO NOTHING
                        }
                    });
                    builder1.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent retry = getIntent();
                            finish();
                            startActivity(retry);
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
            });

            view.findViewById(R.id.TVexit).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder1= new AlertDialog.Builder(HistoryCategorySurvival.this);
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
                            finish();
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
            });
        }
        else {
            startCount();
        }
    }

    @Override
    public void onBackPressed() {
        pauseGame();
    }

    public void pause(View view) {
        ImageButton pause = (ImageButton) view;
        pause.setImageResource(R.drawable.ic_action_playresume);
        pauseGame();
    }
}
