package com.apps.botrobs.studybuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.apps.botrobs.studybuddy.GettersCategory.Animals;
import com.apps.botrobs.studybuddy.GettersCategory.Engineering;
import com.apps.botrobs.studybuddy.GettersCategory.English;
import com.apps.botrobs.studybuddy.GettersCategory.Filipino;
import com.apps.botrobs.studybuddy.GettersCategory.Foods;
import com.apps.botrobs.studybuddy.GettersCategory.History;
import com.apps.botrobs.studybuddy.GettersCategory.Places;
import com.apps.botrobs.studybuddy.GettersCategory.Programming;
import com.apps.botrobs.studybuddy.GettersCategory.Random;
import com.apps.botrobs.studybuddy.GettersCategory.Science;

/**
 * Created by botrobs2 on 2/17/18.
 */

public class MyDataBaseHelper extends SQLiteOpenHelper {

    public MyDataBaseHelper(Context context){
        super(context, "questionBank.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //TABLE FOR RANDOM CATEGORY
        String createTable = "Create table randomQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(createTable);
        //TABLE FOR PROGRAMMING CATEGORY
        String programmingTable = "Create table programmingQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(programmingTable);
        //TABLE FOR SCIENCE CATEGORY
        String scienceTable = "Create table scienceQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(scienceTable);
        //TABLE FOR FILIPINO CATEGORY
        String filipinoTable = "Create table filipinoQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(filipinoTable);
        //TABLE FOR ENGLISH CATEGORY
        String englishTable = "Create table englishQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(englishTable);
        //TABLE FOR HISTORY CATEGORY
        String historyTable = "Create table historyQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(historyTable);
        //TABLE FOR ANIMALS CATEGORY
        String animalsTable = "Create table animalsQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(animalsTable);
        //TABLE FOR FOODS CATEGORY
        String foodsTable = "Create table foodsQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(foodsTable);
        //TABLE FOR PLACES CATEGORY
        String placesTable = "Create table placesQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(placesTable);
        //TABLE FOR ENGINEERING CATEGORY
        String engineeringTable = "Create table engineeringQuestions(id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, choice1 TEXT, choice2 TEXT, choice3 TEXT, choice4 TEXT, answer TEXT);";
        sqLiteDatabase.execSQL(engineeringTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    //CATEGORY RANDOM
    public long addRandomQuestion(Random question){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", question.getQuestion());
        cv.put("choice1", question.getChoice(0));
        cv.put("choice2", question.getChoice(1));
        cv.put("choice3", question.getChoice(2));
        cv.put("choice4", question.getChoice(3));
        cv.put("answer", question.getAnswer());
        long insert = sqLiteDatabase.insert("randomQuestions", null, cv);
        return insert;
    }

    //CATEGORY PRORAMMING
    public long addProgrammingQuestion (Programming programming){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", programming.getQuestionProgramming());
        cv.put("choice1", programming.getChoiceProgramming(0));
        cv.put("choice2", programming.getChoiceProgramming(1));
        cv.put("choice3", programming.getChoiceProgramming(2));
        cv.put("choice4", programming.getChoiceProgramming(3));
        cv.put("answer", programming.getAnswerProgramming());
        long insertProgramming = sqLiteDatabase.insert("programmingQuestions", null, cv);
        return insertProgramming;
    }

    //CATEGORY SCIENCE
    public long addScienceQuestion (Science science){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", science.getQuestionScience());
        cv.put("choice1", science.getChoiceScience(0));
        cv.put("choice2", science.getChoiceScience(1));
        cv.put("choice3", science.getChoiceScience(2));
        cv.put("choice4", science.getChoiceScience(3));
        cv.put("answer", science.getAnswerScience());
        long insertScience = sqLiteDatabase.insert("scienceQuestions", null, cv);
        return insertScience;
    }

    //CATEGORY ENGLISH
    public long addFilipinoQuestion (Filipino filipino){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", filipino.getQuestionFilipino());
        cv.put("choice1", filipino.getChoiceFilipino(0));
        cv.put("choice2", filipino.getChoiceFilipino(1));
        cv.put("choice3", filipino.getChoiceFilipino(2));
        cv.put("choice4", filipino.getChoiceFilipino(3));
        cv.put("answer", filipino.getAnswerFilipino());
        long insertFilipino = sqLiteDatabase.insert("filipinoQuestions", null, cv);
        return insertFilipino;
    }

    //CATEGORY ENGLISH
    public long addEnglishQuestion (English english){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", english.getQuestionEnglish());
        cv.put("choice1", english.getChoiceEnglish(0));
        cv.put("choice2", english.getChoiceEnglish(1));
        cv.put("choice3", english.getChoiceEnglish(2));
        cv.put("choice4", english.getChoiceEnglish(3));
        cv.put("answer", english.getAnswerEnglish());
        long insertEnglish = sqLiteDatabase.insert("englishQuestions", null, cv);
        return insertEnglish;
    }

    //CATEGORY HISTORY
    public long addHistoryQuestion (History history){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", history.getQuestionHistory());
        cv.put("choice1", history.getChoiceHistory(0));
        cv.put("choice2", history.getChoiceHistory(1));
        cv.put("choice3", history.getChoiceHistory(2));
        cv.put("choice4", history.getChoiceHistory(3));
        cv.put("answer", history.getAnswerHistory());
        long insertHistory = sqLiteDatabase.insert("historyQuestions", null, cv);
        return insertHistory;
    }

    //CATEGORY ANIMALS
    public long addAnimalsQuestion (Animals animals){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", animals.getQuestionAnimals());
        cv.put("choice1", animals.getChoiceAnimals(0));
        cv.put("choice2", animals.getChoiceAnimals(1));
        cv.put("choice3", animals.getChoiceAnimals(2));
        cv.put("choice4", animals.getChoiceAnimals(3));
        cv.put("answer", animals.getAnswerAnimals());
        long insertAnimals = sqLiteDatabase.insert("animalsQuestions", null, cv);
        return insertAnimals;
    }

    //CATEGORY FOODS
    public long addFoodsQuestion (Foods foods){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", foods.getQuestionFoods());
        cv.put("choice1", foods.getChoiceFoods(0));
        cv.put("choice2", foods.getChoiceFoods(1));
        cv.put("choice3", foods.getChoiceFoods(2));
        cv.put("choice4", foods.getChoiceFoods(3));
        cv.put("answer", foods.getAnswerFoods());
        long insertFoods = sqLiteDatabase.insert("foodsQuestions", null, cv);
        return insertFoods;
    }

    //CATEGORY PLACES
    public long addPlacesQuestion (Places places){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", places.getQuestionPlaces());
        cv.put("choice1", places.getChoicePlaces(0));
        cv.put("choice2", places.getChoicePlaces(1));
        cv.put("choice3", places.getChoicePlaces(2));
        cv.put("choice4", places.getChoicePlaces(3));
        cv.put("answer", places.getAnswerPlaces());
        long insertPlaces = sqLiteDatabase.insert("placesQuestions", null, cv);
        return insertPlaces;
    }

    //CATEGORY ENGINEERING
    public long addEngineeringQuestion (Engineering engineering){
        SQLiteDatabase sqLiteDatabase =  this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("question", engineering.getQuestionEngineering());
        cv.put("choice1", engineering.getChoiceEngineering(0));
        cv.put("choice2", engineering.getChoiceEngineering(1));
        cv.put("choice3", engineering.getChoiceEngineering(2));
        cv.put("choice4", engineering.getChoiceEngineering(3));
        cv.put("answer", engineering.getAnswerEngineering());
        long insertPlaces = sqLiteDatabase.insert("engineeringQuestions", null, cv);
        return insertPlaces;
    }

    /*
    THE LIST OF ALL THE QUESTIONS WILL BE INSERTED IN THE MADE TABLE ON ONCREATE
     */

    //LIST FOR RANDOM
    public List<Random> getAllQuestionsList(){
        List<Random> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM randomQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Random question = new Random();

                String questText = c.getString(c.getColumnIndex("question"));
                question.setQuestion(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                question.setChoice(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                question.setChoice(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                question.setChoice(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                question.setChoice(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                question.setAnswer(answerText);

                questionArrayList.add(question);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR PROGRAMMING
    public List<Programming> getAllQuestionsListProgramming(){
        List<Programming> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM programmingQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Programming programming = new Programming();

                String questText = c.getString(c.getColumnIndex("question"));
                programming.setQuestionProgramming(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                programming.setChoiceProgramming(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                programming.setChoiceProgramming(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                programming.setChoiceProgramming(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                programming.setChoiceProgramming(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                programming.setAnswerProgramming(answerText);

                questionArrayList.add(programming);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR SCIENCE
    public List<Science> getAllQuestionsListScience(){
        List<Science> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM scienceQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Science science = new Science();

                String questText = c.getString(c.getColumnIndex("question"));
                science.setQuestionScience(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                science.setChoiceScience(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                science.setChoiceScience(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                science.setChoiceScience(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                science.setChoiceScience(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                science.setAnswerScience(answerText);

                questionArrayList.add(science);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR FILIPINO
    public List<Filipino> getAllQuestionsListFilipino(){
        List<Filipino> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM filipinoQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Filipino filipino = new Filipino();

                String questText = c.getString(c.getColumnIndex("question"));
                filipino.setQuestionFilipino(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                filipino.setChoiceFilipino(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                filipino.setChoiceFilipino(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                filipino.setChoiceFilipino(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                filipino.setChoiceFilipino(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                filipino.setAnswerFilipino(answerText);

                questionArrayList.add(filipino);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR ENGLISH
    public List<English> getAllQuestionsListEnglish(){
        List<English> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM englishQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                English english = new English();

                String questText = c.getString(c.getColumnIndex("question"));
                english.setQuestionEnglish(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                english.setChoiceEnglish(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                english.setChoiceEnglish(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                english.setChoiceEnglish(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                english.setChoiceEnglish(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                english.setAnswerEnglish(answerText);

                questionArrayList.add(english);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR HISTORY
    public List<History> getAllQuestionsListHistory(){
        List<History> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM historyQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                History history = new History();

                String questText = c.getString(c.getColumnIndex("question"));
                history.setQuestionHistory(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                history.setChoiceHistory(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                history.setChoiceHistory(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                history.setChoiceHistory(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                history.setChoiceHistory(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                history.setAnswerHistory(answerText);

                questionArrayList.add(history);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR ANIMALS
    public List<Animals> getAllQuestionsListAnimals(){
        List<Animals> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM animalsQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Animals animals = new Animals();

                String questText = c.getString(c.getColumnIndex("question"));
                animals.setQuestionAnimals(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                animals.setChoiceAnimals(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                animals.setChoiceAnimals(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                animals.setChoiceAnimals(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                animals.setChoiceAnimals(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                animals.setAnswerAnimals(answerText);

                questionArrayList.add(animals);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR FOODS
    public List<Foods> getAllQuestionsListFoods(){
        List<Foods> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM foodsQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Foods foods = new Foods();

                String questText = c.getString(c.getColumnIndex("question"));
                foods.setQuestionFoods(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                foods.setChoiceFoods(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                foods.setChoiceFoods(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                foods.setChoiceFoods(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                foods.setChoiceFoods(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                foods.setAnswerFoods(answerText);

                questionArrayList.add(foods);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR PLACES
    public List<Places> getAllQuestionsListPlaces(){
        List<Places> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM placesQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Places places = new Places();

                String questText = c.getString(c.getColumnIndex("question"));
                places.setQuestionPlaces(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                places.setChoicePlaces(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                places.setChoicePlaces(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                places.setChoicePlaces(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                places.setChoicePlaces(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                places.setAnswerPlaces(answerText);

                questionArrayList.add(places);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }

    //LIST FOR ENGINEERING
    public List<Engineering> getAllQuestionsListEngineering(){
        List<Engineering> questionArrayList = new ArrayList<>();
        String selectQuery = "SELECT * FROM engineeringQuestions";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery(selectQuery, null);

        if (c.moveToFirst()){
            do {
                Engineering engineering = new Engineering();

                String questText = c.getString(c.getColumnIndex("question"));
                engineering.setQuestionEngineering(questText);

                String choice1Text = c.getString(c.getColumnIndex("choice1"));
                engineering.setChoiceEngineering(0, choice1Text);

                String choice2Text = c.getString(c.getColumnIndex("choice2"));
                engineering.setChoiceEngineering(1, choice2Text);

                String choice3Text = c.getString(c.getColumnIndex("choice3"));
                engineering.setChoiceEngineering(2, choice3Text);

                String choice4Text = c.getString(c.getColumnIndex("choice4"));
                engineering.setChoiceEngineering(3, choice4Text);

                String answerText = c.getString(c.getColumnIndex("answer"));
                engineering.setAnswerEngineering(answerText);

                questionArrayList.add(engineering);
            }while(c.moveToNext());
            Collections.shuffle(questionArrayList);
        }
        return questionArrayList;
    }
}
