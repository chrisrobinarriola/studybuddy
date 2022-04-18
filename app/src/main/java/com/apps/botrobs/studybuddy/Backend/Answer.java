package com.apps.botrobs.studybuddy.Backend;

import java.io.Serializable;



public class Answer implements Serializable{
    private String answer;
    private boolean correct;

    public Answer(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public Answer() {
        answer = null;
        correct = false;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
