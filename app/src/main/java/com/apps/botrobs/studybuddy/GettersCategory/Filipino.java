package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs2 on 2/20/18.
 */

public class Filipino {

    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Filipino(){

    }

    public Filipino(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionFilipino(){
        return question;
    }

    public String getChoiceFilipino(int i){
        return choice[i];
    }

    public String getAnswerFilipino(){
        return answer;
    }

    public void setAnswerFilipino(String answer){
        this.answer = answer;
    }

    public void setChoiceFilipino(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionFilipino(String question){
        this.question = question;
    }
}
