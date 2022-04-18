package com.apps.botrobs.studybuddy.Backend;

import java.util.ArrayList;

//FUCKED UP CLASS

public class YesNoQuestion extends Question {
    private boolean yesOrNo;

    public YesNoQuestion(String question, boolean yesOrNo)
    {
        this(question, makeAnswers(yesOrNo));
        this.yesOrNo = yesOrNo;
    }

    public YesNoQuestion() {
        super();
    }

    public YesNoQuestion(String question, ArrayList<Answer> answers)
    {
        super(question, answers);
    }

    private static ArrayList<Answer> makeAnswers(boolean yesOrNo) {
        ArrayList<Answer> answers = new ArrayList<>();
        answers.add(new Answer("Yes", yesOrNo));
        answers.add(new Answer("No", !yesOrNo));
        return answers;
    }

    public boolean isYesOrNo() {
        return yesOrNo;
    }
}
