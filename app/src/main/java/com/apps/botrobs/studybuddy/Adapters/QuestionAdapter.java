package com.apps.botrobs.studybuddy.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.apps.botrobs.studybuddy.Backend.Question;
import com.apps.botrobs.studybuddy.Backend.Quiz;
import com.apps.botrobs.studybuddy.R;

public class QuestionAdapter extends BaseAdapter {
    private LayoutInflater inflater = null;
    private Quiz data;

    public QuestionAdapter(Context context, Quiz data) {
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.getQuestions().size();
    }

    @Override
    public Object getItem(int position) {
        return data.getQuestions().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        Question question = data.getQuestions().get(position);
        if (vi == null)
            vi = inflater.inflate(R.layout.qmquestion_list_item, null);

        ((TextView)vi).setText(question.getQuestion());

        return vi;
    }
}
