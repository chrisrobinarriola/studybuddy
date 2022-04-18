package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/20/18.
 */

public class Foods {

    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Foods(){

    }

    public Foods(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionFoods(){
        return question;
    }

    public String getChoiceFoods(int i){
        return choice[i];
    }

    public String getAnswerFoods(){
        return answer;
    }

    public void setAnswerFoods(String answer){
        this.answer = answer;
    }

    public void setChoiceFoods(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionFoods(String question){
        this.question = question;
    }
}
