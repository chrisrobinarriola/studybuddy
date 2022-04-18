package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/20/18.
 */

public class Animals {

    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Animals(){

    }

    public Animals(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionAnimals(){
        return question;
    }

    public String getChoiceAnimals(int i){
        return choice[i];
    }

    public String getAnswerAnimals(){
        return answer;
    }

    public void setAnswerAnimals(String answer){
        this.answer = answer;
    }

    public void setChoiceAnimals(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionAnimals(String question){
        this.question = question;
    }
}
