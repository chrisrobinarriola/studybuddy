package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/20/18.
 */

public class Places {

    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Places(){

    }

    public Places(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionPlaces(){
        return question;
    }

    public String getChoicePlaces(int i){
        return choice[i];
    }

    public String getAnswerPlaces(){
        return answer;
    }

    public void setAnswerPlaces(String answer){
        this.answer = answer;
    }

    public void setChoicePlaces(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionPlaces(String question){
        this.question = question;
    }
}
