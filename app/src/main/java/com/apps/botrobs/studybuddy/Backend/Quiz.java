package com.apps.botrobs.studybuddy.Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Quiz implements Serializable {
    private String quizName = null;
    private String quizDescription = null;
    private ArrayList<Question> questions = new ArrayList<>();
    private Random random = new Random();
    private long id = -1;

    public Quiz()
    {
        id = Score.getId(this);
    }

    public Quiz(long id) {
        this.id = id;
    }


    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question)
    {
        questions.add(question);

    }

    public void removeQuestion(int index) {
        questions.remove(index);
    }

    public String getQuizDescription() {
        return quizDescription;
    }

    public void setQuizDescription(String quizDescription) {
        this.quizDescription = quizDescription;
    }

    public long getId() {
        return id;
    }

}
