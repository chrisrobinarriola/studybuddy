package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/20/18.
 */

public class Engineering {

    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Engineering(){

    }

    public Engineering(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionEngineering(){
        return question;
    }

    public String getChoiceEngineering(int i){
        return choice[i];
    }

    public String getAnswerEngineering(){
        return answer;
    }

    public void setAnswerEngineering(String answer){
        this.answer = answer;
    }

    public void setChoiceEngineering(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionEngineering(String question){
        this.question = question;
    }
}
