package com.apps.botrobs.studybuddy.GettersCategory;

/**
 * Created by botrobs on 2/19/18.
 */

public class Science {
    private String question;
    private String[] choice = new String[4];
    private String answer;

    public Science(){

    }

    public Science(String question, String[] choices, String answer){
        this.question = question;
        this.choice[0] = choices[0];
        this.choice[1] = choices[1];
        this.choice[2] = choices[2];
        this.choice[3] = choices[3];
        this.answer = answer;
    }

    public String getQuestionScience(){
        return question;
    }

    public String getChoiceScience(int i){
        return choice[i];
    }

    public String getAnswerScience(){
        return answer;
    }

    public void setAnswerScience(String answer){
        this.answer = answer;
    }

    public void setChoiceScience(int i, String choice){
        this.choice[i] = choice;
    }

    public void setQuestionScience(String question){
        this.question = question;
    }
}
