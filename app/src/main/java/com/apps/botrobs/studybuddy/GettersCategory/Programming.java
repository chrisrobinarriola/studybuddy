package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/18/18.
 */

public class Programming {
    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Programming(){

    }

    public Programming(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionProgramming(){
        return question;
    }

    public String getChoiceProgramming(int i){
        return choice[i];
    }

    public String getAnswerProgramming(){
        return answer;
    }

    public void setAnswerProgramming(String answer){
        this.answer = answer;
    }

    public void setChoiceProgramming(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionProgramming(String question){
        this.question = question;
    }
}
