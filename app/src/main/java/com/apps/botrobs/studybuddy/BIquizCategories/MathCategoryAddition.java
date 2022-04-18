package com.apps.botrobs.studybuddy.BIquizCategories;

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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import com.apps.botrobs.studybuddy.ChooseNormalActivity;
import com.apps.botrobs.studybuddy.R;
import com.apps.botrobs.studybuddy.highscores.AdditionHighScoreActivity;

public class MathCategoryAddition extends AppCompatActivity {

    private static final String TAG = "MathCategoryAddition";
    TextView timeLeftTextView,promptTextView, currentScoreTextView;
    Button choice1, choice2, choice3,choice4;
    ImageButton btnPause;    Boolean gameIsActive = false;
    CountDownTimer gameTimer;
    int score,attempted, locOfAnswer;
    String userScore;
    ArrayList<Integer> answers = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_quiz_math);


        timeLeftTextView = (TextView)findViewById(R.id.TVcountdown);
        promptTextView = (TextView)findViewById(R.id.question);
        currentScoreTextView = (TextView)findViewById(R.id.questionNumber);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);
        btnPause = (ImageButton)findViewById(R.id.btnPause);
        final AlertDialog.Builder builder = new AlertDialog.Builder(MathCategoryAddition.this);
        LayoutInflater inflater = LayoutInflater.from(MathCategoryAddition.this);
        View view = inflater.inflate(R.layout.inflater_game_rules_math, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();

        view.findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStartGame();
                alertDialog.dismiss();
            }
        });

        view.findViewById(R.id.TVexitRule).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MathCategoryAddition.this, MathCategory.class));
                finish();
            }
        });
    }

    public void onStartGame(){
        gameIsActive = true;
        startCount();

        timeLeftTextView.setVisibility(View.VISIBLE);
        promptTextView.setVisibility(View.VISIBLE);
        currentScoreTextView.setVisibility(View.VISIBLE);
        choice1.setVisibility(View.VISIBLE);
        choice2.setVisibility(View.VISIBLE);
        choice3.setVisibility(View.VISIBLE);
        choice4.setVisibility(View.VISIBLE);

        generateAnswer();
    }

    public void startCount(){
        timerRunning = true;
        gameTimer = new CountDownTimer(mTimeLeftInMillis + 100, 1000) {
            @Override
            public void onTick(long millisUntilFinish) {
                mTimeLeftInMillis = millisUntilFinish;
                updateCountDownText();
                if (timeLeftTextView.getText().equals("00:06")){
                    timeLeftTextView.setTextColor(Color.RED);
                }
            }
            @Override
            public void onFinish() {
                gameIsActive = false;
                Intent i = new Intent(MathCategoryAddition.this, AdditionHighScoreActivity.class);
                i.putExtra("scoreAddition", score);
                startActivity(i);
                finish();
            }
        }.start();
    }

    //GENERATE QUESTIONS AND ANSWERS
    public void generateAnswer () {
        choice1.setEnabled(true);
        choice2.setEnabled(true);
        choice3.setEnabled(true);
        choice4.setEnabled(true);

        answers.clear();

        Random rand = new Random();

        int a = rand.nextInt(29);
        int b = rand.nextInt(21);

        promptTextView.setText(Integer.toString(a) + " + " + Integer.toString(b));

        locOfAnswer = rand.nextInt(4);
        int wrongAnswer;

        for (int i = 0; i <4; i++) {
            if (i == locOfAnswer) {
                answers.add(a + b);
            } else {

                wrongAnswer = rand.nextInt((98-23)-23);

                while (wrongAnswer == a + b) {
                    wrongAnswer = rand.nextInt((98-23)-23);
                }
                answers.add(wrongAnswer);
            }
        }

        choice1.setText(Integer.toString(answers.get(0)));
        choice2.setText(Integer.toString(answers.get(1)));
        choice3.setText(Integer.toString(answers.get(2)));
        choice4.setText(Integer.toString(answers.get(3)));

    }

    public void updateScore(boolean correctAnswer) {

        if (correctAnswer) {
            score++;
        }

        attempted++;

        userScore = "" + score;

        currentScoreTextView.setText(userScore);

    }

    public void onClick(View view) {
        choice1.setEnabled(false);
        choice2.setEnabled(false);
        choice3.setEnabled(false);
        choice4.setEnabled(false);

        int pressed = Integer.parseInt(view.getTag().toString());
        final Button answered = (Button) view;

        if (gameIsActive) {
            if (pressed == locOfAnswer + 1) {
                //Toast.makeText(MathCategoryAddition.this, "Correct!", Toast.LENGTH_SHORT).show();
                answered.getTag().equals(pressed);
                answered.setBackgroundColor(Color.GREEN);
                updateScore(true);
            } else {
                //Toast.makeText(MathCategoryAddition.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                pressed = locOfAnswer + 1;

                if (1 == pressed){
                    choice1.setBackgroundColor(Color.GREEN);
                }
                if (2 == pressed){
                    choice2.setBackgroundColor(Color.GREEN);
                }
                if (3 == pressed){
                    choice3.setBackgroundColor(Color.GREEN);
                }
                if (4 == pressed){
                    choice4.setBackgroundColor(Color.GREEN);
                }

                answered.setBackgroundColor(Color.RED);

                updateScore(false);
            }
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //DELAY FOR THE SCORE
                    choice1.setBackgroundColor(Color.rgb(51,121,227));
                    choice2.setBackgroundColor(Color.rgb(51,121,227));
                    choice3.setBackgroundColor(Color.rgb(51,121,227));
                    choice4.setBackgroundColor(Color.rgb(51,121,227));
                    generateAnswer();
                }
            }, 1000L);
        }
    }

    @Override
    public void onBackPressed() {
        pauseTheGame();
    }

    public void pause(View view) {
        ImageButton pause = (ImageButton) view;
        pause.setImageResource(R.drawable.ic_action_playresume);
        pauseGame();
    }

    private void pauseGame() {
        pauseTheGame();
    }

    public void pauseTheGame(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.inflater_pause, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();

        promptTextView.setVisibility(View.INVISIBLE);
        choice1.setVisibility(View.INVISIBLE);
        choice2.setVisibility(View.INVISIBLE);
        choice3.setVisibility(View.INVISIBLE);
        choice4.setVisibility(View.INVISIBLE);
        if (timerRunning) {
            pauseTimer();
            view.findViewById(R.id.TVresume).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                    promptTextView.setVisibility(View.VISIBLE);
                    choice1.setVisibility(View.VISIBLE);
                    choice2.setVisibility(View.VISIBLE);
                    choice3.setVisibility(View.VISIBLE);
                    choice4.setVisibility(View.VISIBLE);
                    btnPause.setImageResource(R.drawable.ic_action_pause);
                    startCount();
                }
            });

            view.findViewById(R.id.TVretry).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder1= new AlertDialog.Builder(MathCategoryAddition.this);
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
                    AlertDialog.Builder builder1= new AlertDialog.Builder(MathCategoryAddition.this);
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
                            startActivity(new Intent(MathCategoryAddition.this, MathCategory.class));
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
    boolean timerRunning;
    long mTimeLeftInMillis = 30000;

    private void pauseTimer() {
        gameTimer.cancel();
        timerRunning = false;
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        timeLeftTextView.setText(timeLeftFormatted);
    }

    public void nextQuestion(View view) {
        generateAnswer();
    }
}
