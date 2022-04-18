package com.apps.botrobs.studybuddy;

import android.content.Context;

import java.util.ArrayList;
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

public class QuestionBank {

    List<Random> list = new ArrayList<>();
    List<Programming> programmingList = new ArrayList<>();
    List<Science> scienceList = new ArrayList<>();
    List<Filipino> filipinoList = new ArrayList<>();
    List<English> englishList = new ArrayList<>();
    List<History> historyList = new ArrayList<>();
    List<Animals> animalsList = new ArrayList<>();
    List<Foods> foodsList = new ArrayList<>();
    List<Places> placesList = new ArrayList<>();
    List<Engineering> engineeringList = new ArrayList<>();

    MyDataBaseHelper myDataBaseHelper;

    //RANDOM QUESTIONS
    public int getLength(){
        return list.size();
    }

    public String getQuestionRandom(int a){
        return list.get(a).getQuestion();
    }

    public String getChoiceRandom(int index, int num){
        return list.get(index).getChoice(num-1);
    }

    public String getCorrectAnswerRandom(int a){
        return list.get(a).getAnswer();
    }

    //PROGRAMMING QUESTIONS
    public int getLengthProgramming(){
        return programmingList.size();
    }

    public String getQuestionProgramming(int b){
        return programmingList.get(b).getQuestionProgramming();
    }

    public String getChoiceProgramming(int index, int num){
        return programmingList.get(index).getChoiceProgramming(num-1);
    }

    public String getCorrectAnswerProgramming(int b){
        return programmingList.get(b).getAnswerProgramming();
    }

    //SCIENCE
    public int getLengthScience(){
        return scienceList.size();
    }

    public String getQuestionScience(int b){
        return scienceList.get(b).getQuestionScience();
    }

    public String getChoiceScience(int index, int num){
        return scienceList.get(index).getChoiceScience(num-1);
    }

    public String getCorrectAnswerScience(int b){
        return scienceList.get(b).getAnswerScience();
    }

    //FILIPINO
    public int getLengthFilipino(){
        return filipinoList.size();
    }

    public String getQuestionFilipino(int b){
        return filipinoList.get(b).getQuestionFilipino();
    }

    public String getChoiceFilipino(int index, int num){
        return filipinoList.get(index).getChoiceFilipino(num-1);
    }

    public String getCorrectAnswerFilipino(int b){
        return filipinoList.get(b).getAnswerFilipino();
    }

    //ENGLISH
    public int getLengthEnglish(){
        return englishList.size();
    }

    public String getQuestionEnglish(int b){
        return englishList.get(b).getQuestionEnglish();
    }

    public String getChoiceEnglish(int index, int num){
        return englishList.get(index).getChoiceEnglish(num-1);
    }

    public String getCorrectAnswerEnglish(int b){
        return englishList.get(b).getAnswerEnglish();
    }

    //HISTORY
    public int getLengthHistory(){
        return historyList.size();
    }

    public String getQuestionHistory(int b){
        return historyList.get(b).getQuestionHistory();
    }

    public String getChoiceHistory(int index, int num){
        return historyList.get(index).getChoiceHistory(num-1);
    }

    public String getCorrectAnswerHistory(int b){
        return historyList.get(b).getAnswerHistory();
    }

    //ANIMALS
    public int getLengthAnimals(){
        return foodsList.size();
    }

    public String getQuestionAnimals(int b){
        return animalsList.get(b).getQuestionAnimals();
    }

    public String getChoiceAnimals(int index, int num){
        return animalsList.get(index).getChoiceAnimals(num-1);
    }

    public String getCorrectAnswerAnimals(int b){
        return animalsList.get(b).getAnswerAnimals();
    }

    //FOODS
    public int getLengthFoods(){
        return foodsList.size();
    }

    public String getQuestionFoods(int b){
        return foodsList.get(b).getQuestionFoods();
    }

    public String getChoiceFoods(int index, int num){
        return foodsList.get(index).getChoiceFoods(num-1);
    }

    public String getCorrectAnswerFoods(int b){
        return foodsList.get(b).getAnswerFoods();
    }

    //PLACES
    public int getLengthPlaces(){
        return placesList.size();
    }

    public String getQuestionPlaces(int b){
        return placesList.get(b).getQuestionPlaces();
    }

    public String getChoicePlaces(int index, int num){
        return placesList.get(index).getChoicePlaces(num-1);
    }

    public String getCorrectAnswerPlaces(int b){
        return placesList.get(b).getAnswerPlaces();
    }

    //ENGINEERING
    public int getLengthEngineering(){
        return engineeringList.size();
    }

    public String getQuestionEngineering(int b){
        return engineeringList.get(b).getQuestionEngineering();
    }

    public String getChoiceEngineering(int index, int num){
        return engineeringList.get(index).getChoiceEngineering(num-1);
    }

    public String getCorrectAnswerEngineering(int b){
        return engineeringList.get(b).getAnswerEngineering();
    }

    /*
    QUESTIONS ARE GENERATED HERE QUESTION, OPTION, OPTION, OPTION, OPTION AND ANSWER
    ANSWER MUST BE THE SAME WITH THE OPTION BECAUSE WE USE TEXT INSTEAD OF CHOOSING ONE FROM OPTIONS
     */

    //QUESTIONS FOR RANDOM
    public void initRandom(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        list = myDataBaseHelper.getAllQuestionsList();

        if(list.isEmpty()){
            myDataBaseHelper.addRandomQuestion(new Random("When did Google acquire android?",
                    new String[]{"2001","2002", "200123", "123"}, "2001"));
            myDataBaseHelper.addRandomQuestion(new Random("Which is the largest carnivore on land?",
                    new String[]{"Polar bear","Leopard", "Tiger", "Lion"}, "Polar bear"));

            myDataBaseHelper.addRandomQuestion(new Random("How many toes do ostriches have on each foot?",
                    new String[]{"1","4", "6", "2"}, "2"));

            myDataBaseHelper.addRandomQuestion(new Random("What are egg laying animals known as? ",
                    new String[]{"Reptiles","Snake", "Herbivorous", "Oviparose"}, "Snake"));

            myDataBaseHelper.addRandomQuestion(new Random("Which is the fastest land animal?",
                    new String[]{"Antelope","Hare", "Polar bear", "Cheetah"}, "Cheetah"));

            myDataBaseHelper.addRandomQuestion(new Random("Which is the biggest of the great apes?",
                    new String[]{"Gorilla","Chimpanzee", "Monkey", "Orangutan"}, "Gorilla"));

            myDataBaseHelper.addRandomQuestion(new Random("What is another name for a pigeon?",
                    new String[]{"Common dove","Rock Dove", "Dove", "City dove"}, "Rock Dove"));

            myDataBaseHelper.addRandomQuestion(new Random("Who wrote the book ‘The origin of species’?",
                    new String[]{"Charles Darwin","Sir alexander Fleming", "Stephen Hawking", "Louis Pasteur"}, "Charles Darwin"));

            myDataBaseHelper.addRandomQuestion(new Random("Where is the headquarters of Intel located?",
                    new String[]{"Redmond, Washington","Tucson, Arizona", "Santa Clara, California", "Richmond, Virginia"}, "Santa Clara, California"));

            myDataBaseHelper.addRandomQuestion(new Random("Who co-founded Hotmail in 1996 and then sold the company to Microsoft?",
                    new String[]{"Sabeer Bhatia","Shawn Fanning", "Ada Byron Lovelace", "Ray Tomlinson"}, "Sabeer Bhatia"));

            myDataBaseHelper.addRandomQuestion(new Random("http://www.studybuddymobileapp.com - is an example of what?",
                    new String[]{"A URL","An access code", "A server", "A directory"}, "A URL"));

            myDataBaseHelper.addRandomQuestion(new Random("Which of these is not a computer?",
                    new String[]{"Macintosh","Paseo", "Aptiva", "Acorn"}, "Paseo"));

            myDataBaseHelper.addRandomQuestion(new Random("HTML is used to...",
                    new String[]{"Plot complicated graphs","Solve equations", "Translate one language into anothe", "Author webpages"}, "Author webpages"));

            myDataBaseHelper.addRandomQuestion(new Random("ROM stands for...",
                    new String[]{"Read Only Memory","Royal Ontario Museum", "Read on Monday", "Random Only Memory"}, "Read Only Memory"));

            myDataBaseHelper.addRandomQuestion(new Random("Another word for 'Graphics for a word processor'?",
                    new String[]{"Peripheral","Highlight", "Clip art", "Execute"}, "Clip art"));

            myDataBaseHelper.addRandomQuestion(new Random("Which is the purest form of carbon?" ,
                    new String[] {"grande", "graphite", "granite", "grains" }, "graphite"));

            myDataBaseHelper.addRandomQuestion(new Random("Persons sitting in an artificial satellite of the earth have" ,
                    new String[] {"0 weight", "50 weight", "100 weight", "10 weight" }, "0 weight"));

            myDataBaseHelper.addRandomQuestion(new Random("Which is the most abundant gas in earth's atmosphere?" ,
                    new String[] {"nitrogen", "oxygen", "hydrogen", "carbon" }, "nitrogen"));

            myDataBaseHelper.addRandomQuestion(new Random("What is table sugar?" ,
                    new String[] {"chlorine", "glucose", "sucrose", "chloride" }, "sucrose"));
            myDataBaseHelper.addRandomQuestion(new Random("Ang kambal katinig ay...?",
                    new String[]{"Pares Minimal"," Diptonggo ", "Salawikain", "Klaster"}, "Klaster"));
            myDataBaseHelper.addRandomQuestion(new Random("Kilala bilang Huseng Batute?",
                    new String[]{"Jose Corazon de Hesus","Apolinario Mabini", "Melchora Aquino", "Gregorio H. del Pilar"}, "Jose Corazon de Hesus"));
            myDataBaseHelper.addRandomQuestion(new Random("Tumatanggap ng kilos sa isang pangungusap",
                    new String[]{"Panaguri","Simuno", "Tuwirang layon", "Di - tuwirang layon"}, "Tuwirang layon"));
            myDataBaseHelper.addRandomQuestion(new Random("Ang salitang yamang-dagat ay?",
                    new String[]{"Payak","Maylapi", "Inuulit", "Tambalan"}, "Tambalan"));
            myDataBaseHelper.addRandomQuestion(new Random("Tanyag na hayop na matatagpuan sa Bohol",
                    new String[]{"Tarsier","Agila", "Kambeng", "Tammaraw"}, "Tarsier"));
            myDataBaseHelper.addRandomQuestion(new Random("Ang El Filibusterismo ay inihandog ni Rizal sa",
                    new String[]{"Kanyang Kasintahan","Kabataang Pilipino", "Kastila", "GOMBURZA"}, "GOMBURZA"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Fasism","Fascism", "Fascissm", "Facism"}, "Fascism"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Endeavor","Endevor", "Endavour", "Endavore"}, "Endeavor"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Millenum","Millinuim", "Millennium", "Millenuim"}, "Millennium"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Absalute","Obsulute", "Absolete", "Obsolete"}, "Obsolete"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Lackadaisical","Lackadisical", "Lackidisical", "Lackdaisical"}, "Lackadaisical"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Chavinism","Chauvinicm", "Chauvinistic", "Chauvinst"}, "Chauvinistic"));
            myDataBaseHelper.addRandomQuestion(new Random("Find the correctly spelled word",
                    new String[]{"Harassing","Harrasing", "Harrassing", "Harisinng"}, "Harassing"));
            myDataBaseHelper.addRandomQuestion(new Random("A person who migrates to another country",
                    new String[]{"Emigrant","Foreigner", "Immigrant", "Tourist"}, "Immigrant"));
            myDataBaseHelper.addRandomQuestion(new Random("Synonyms of caricature",
                    new String[]{"Paint","Cartoon", "Painter", "Draw"}, "Cartoon"));
            myDataBaseHelper.addRandomQuestion(new Random("Synonyms of goad",
                    new String[]{"Goat","Provoke", "Lot", "Agree"}, "Provoke"));
            myDataBaseHelper.addRandomQuestion(new Random("Synonyms of Mounted",
                    new String[]{"Tapped","Took", "Climbed", "Moved"}, "Climbed"));
            myDataBaseHelper.addRandomQuestion(new Random("Antonyms of Busy",
                    new String[]{"Relaxed","Occupied", "Engrossed", "Late"}, "Relaxed"));
            myDataBaseHelper.addRandomQuestion(new Random("Antonyms of Attack",
                    new String[]{"Shoot","Defend", "Debt", "Product"}, "Defend"));
            myDataBaseHelper.addRandomQuestion(new Random("Antonyms of Enormous",
                    new String[]{"Soft","Tiny", "Middle", "Weak"}, "Tiny"));
            myDataBaseHelper.addRandomQuestion(new Random("Antonyms of Ancient",
                    new String[]{"Recent","Progressive", "Impressive", "Modern"}, "Modern"));
            myDataBaseHelper.addRandomQuestion(new Random("Where is the Philippines Located?",
                    new String[]{"South West Asia","South East Asia", "South Asia", "East Asia"}, "South East Asia"));
            myDataBaseHelper.addRandomQuestion(new Random("What do you call a person who comes from the Philippines",
                    new String[]{"Filepino","Philippian", "Filipino", "Philippine"}, "Filipino"));
            myDataBaseHelper.addRandomQuestion(new Random("Which country had the Philippines as its colony for more than 300 years",
                    new String[]{"Spain","Italy", "England", "France"}, "Spain"));
            myDataBaseHelper.addRandomQuestion(new Random("Which of the following groups has the Philippines as its member",
                    new String[]{"NATO","SAARC", "ASEAN", "OOWWA"}, "ASEAN"));
            myDataBaseHelper.addRandomQuestion(new Random("Which of these is the Philippine national fruit",
            new String[]{"Apple","Banana", "Mango", "Watermelon"}, "Mango"));
            myDataBaseHelper.addRandomQuestion(new Random("City known as the home of durian and exotic fruits",
                    new String[]{"Malabon","Davao City", "Iligan City", "Palawan"}, "Davao City"));
            myDataBaseHelper.addRandomQuestion(new Random("He is the composer of the Philippine National Anthem",
            new String[]{"Juan Felepe","Juan Felipe", "John Felipe", "Julian Felipe"}, "Julian Felipe"));
            myDataBaseHelper.addRandomQuestion(new Random("What is the meaning of KKK?",
                    new String[]{"Kagaling-galingan, Katapangan, Kabutihan","Kataastaasan, Kagalang-galangang, Katipunan para sa mga anak ng bayan", "Kagandahan, Katalinuhan, Kalooban", "Kilala, Kinakatakutan, Kinakalibutan"}, "Kataastaasan, Kagalang-galangang, Katipunan para sa mga anak ng bayan"));
            myDataBaseHelper.addRandomQuestion(new Random("Which is the largest carnivore on land?",
                    new String[]{"Polar bear","Leopard", "Tiger", "Lion"}, "Polar bear"));
            myDataBaseHelper.addRandomQuestion(new Random("How many toes do ostriches have on each foot?",
                    new String[]{"1","4", "6", "2"}, "2"));
            myDataBaseHelper.addRandomQuestion(new Random("The tallest animal can grow up to 5.5 metres. What is it?",
                    new String[]{"Arctic whale","Camel", "Giraffe", "Elephant"}, "Giraffe"));
            myDataBaseHelper.addRandomQuestion(new Random("The ostrich belongs to what orders of birds?",
                    new String[]{"Paciformes","Piciformes", "Gavilformes", "Struthioniformes"}, "Struthioniformes"));
            myDataBaseHelper.addRandomQuestion(new Random("How many types of puffins exist?",
                    new String[]{"4","1", "2", "3"}, "4"));
            myDataBaseHelper.addRandomQuestion(new Random("Which of these species of birds eats both meat and plants as an adult?",
                    new String[]{"Blue jay","Sunbird", "Vulture", "Flycatcher"}, "Blue jay"));
            myDataBaseHelper.addRandomQuestion(new Random("Which is the largest land animal?",
                    new String[]{"Giraffe","Hippopotamus", "Africa bush Elephant", "Rhinoceros"}, "Africa bush Elephant"));
            myDataBaseHelper.addRandomQuestion(new Random("Falconiformes include which birds?",
                    new String[]{"Swifts, hummingbird","Falcon, hawks, eagles, ospreys", "Albatross, petrels", "Stork, heron"}, "Falcon, hawks, eagles, ospreys"));
            myDataBaseHelper.addRandomQuestion(new Random("Which is the biggest of the great apes?",
                    new String[]{"Gorilla","Chimpanzee", "Monkey", "Orangutan"}, "Gorilla"));
            myDataBaseHelper.addRandomQuestion(new Random("A substance needed by the body for growth, energy, repair and maintenance is called a",
                    new String[]{"Carbohydrate","Calorie", "nutrient", "fatty acid"}, "nutrient"));
            myDataBaseHelper.addRandomQuestion(new Random("Food passes through the stomach directly by ________",
                    new String[]{"the small intestine","the heart", "the pancreas", "the large intestine"}, "the small intestine"));
            myDataBaseHelper.addRandomQuestion(new Random("Which of these is NOT considered a nutrient?",
                    new String[]{"Minerals","Vitamins", "fiber", "fats"}, "fiber"));
            myDataBaseHelper.addRandomQuestion(new Random("The Forbidden City is located in which country?",
                    new String[]{"China","Bhutan", "Nepal", "Mongolia"}, "China"));
            myDataBaseHelper.addRandomQuestion(new Random("Karnak Temple is located in which country?",
                    new String[]{"Tunisia","Lebanon", " Egypt", "Libya"}, " Egypt"));
            myDataBaseHelper.addRandomQuestion(new Random("Dead Sea is located in which two countries?",
                    new String[]{"Israel-Jordan","Iran-Iraq", "Jordan-Lebanon", "Turkey-Iraq"}, "Israel-Jordan"));
            myDataBaseHelper.addRandomQuestion(new Random("What city is well known for its Carnival?",
                    new String[]{"Colombo","Khartoum", "Rio de Janeiro", "Kiev"}, "Rio de Janeiro"));
            myDataBaseHelper.addRandomQuestion(new Random("Minimum depth of ballast prescribed of B.G trunk lines of Indian Railways, is",
                    new String[]{"20cm","15cm", "25cm", "30cm"}, "25cm"));
            myDataBaseHelper.addRandomQuestion(new Random("If the pitch is 6cm and rivet value is 4 tonnes, the number of rivets required for a riveted connection carrying an eccentric load of 15 tonnes at a distance of 30 cm from the centre line is ",
                    new String[]{"8","10", "32", "6"}, "8"));
            myDataBaseHelper.addRandomQuestion(new Random("A temporary rigid structure having a platform to enable masons to work at different stages of a  building, is known as",
                    new String[]{"Dead shore","Scaffolding", "Ranking shore", "Below pinning"}, "Scaffolding"));
            myDataBaseHelper.addRandomQuestion(new Random("Formation of snow occurs if the cloud temperature is",
                    new String[]{"Just above the freezing point","At the freezing point", "Below the freezing point", "All of these"}, "Below the freezing point"));
            myDataBaseHelper.addRandomQuestion(new Random("Wrought iron contains carbon about",
                    new String[]{"1.5% to 5.5%","0.5% to 1.75%", "0.1% to 0.25%", "None of these"}, "0.1% to 0.25%"));
            myDataBaseHelper.addRandomQuestion(new Random("The first method invented for planning project was",
                    new String[]{"Milestone chart","Critical path method (CPM)", "Program evaluation and review technique ", "Bar chart Method"}, "Bar chart Method"));
            myDataBaseHelper.addRandomQuestion(new Random("The sound which continues even after its source is cut off, is called",
                    new String[]{"Echo","Reverberation", "Interference", "Intensity of sound"}, "Reverberation"));
            myDataBaseHelper.addRandomQuestion(new Random("Best type of piles for soft soil having little resistance to the flow of concrete is",
                    new String[]{"Vibro pile","Simplex pile", "Franki pile", "Raymond pile"}, "Vibro pile"));
            myDataBaseHelper.addRandomQuestion(new Random("If fineness modulus of sand is 2.5. it is graded as",
                    new String[]{"Coarse sand","Fine sand", "Small sand", "Very fine sand"}, "Fine sand"));
            myDataBaseHelper.addRandomQuestion(new Random("The detention period in a septic tank is assumed",
                    new String[]{"20 minutes","40 minutes", "30 minutes", "50 minutes"}, "30 minutes"));
            myDataBaseHelper.addRandomQuestion(new Random("You are asked to construct a massive dam, the type of cement you will use, is",
                    new String[]{"Ordinary Portland cement","Rapid hardening cement", "Blast furnace slag cement", "Low heat cement"}, "Low heat cement"));
            myDataBaseHelper.addRandomQuestion(new Random("Taj Mahal is located in which country?",
                    new String[]{"Pakistan","India", "Singapore", "Indonesia"}, "India"));
            myDataBaseHelper.addRandomQuestion(new Random("Machu Picchu is located in which country?",
                    new String[]{"Jamaica","Cuba", "Puerto Rico", "Peru"}, "Peru"));
            myDataBaseHelper.addRandomQuestion(new Random("Christ The Redeemer Statue on Corcovado Mountain is located in which country?",
                    new String[]{"Brazil"," Hungary", "Canada", "China"}, "Brazil"));
            myDataBaseHelper.addRandomQuestion(new Random("Which city does not have an obelisk?",
            new String[]{"Rome","Cairo", "London", "Ulaanbaatar"}, "Ulaanbaatar"));
            myDataBaseHelper.addRandomQuestion(new Random("Which food contains the most fat?",
                    new String[]{"Brownies","Angel food cake", "Graham crackers", "Pudding"}, "Brownies"));
            myDataBaseHelper.addRandomQuestion(new Random("How many servings of vegetables do we need each day",
                    new String[]{"6-11","11-12", "3-5", "2-4"}, "3-5"));

            list = myDataBaseHelper.getAllQuestionsList();
        }
    }

    //QUESTIONS FOR PROGRAMMING DONE
    public void initProgramming(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        programmingList = myDataBaseHelper.getAllQuestionsListProgramming();

        if(list.isEmpty()){
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is a Java keyword used to indicate that either a method cannot override in subclass.",
                    new String[]{"final","finally", "finalize", "string"}, "final"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is an immutable class.",
                    new String[]{"char","string", "int", "method"}, "string"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is a data type that represent number with a fraction type.",
                    new String[]{"float","int", "double", "char"}, "float"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is the input values for the function that need to use perform the required action.",
                    new String[]{"function","data type", "return type", "parameters"}, "parameters"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("This method gets called automatically when the application is at final stage waiting for the process to terminate.",
                    new String[]{"constructor","finalize()", "destructor", "end"}, "destructor"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following operators is incorrect?",
                    new String[]{"< >",">= ", "<=", "=="}, "< >"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following operator can be used to access the member function of a class?",
                    new String[]{"#",".", "::", ":"}, "."));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is known as special purpose type without any value.",
                    new String[]{"int","double", "void", "string"}, "void"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is a loop that runs within another loop.",
                    new String[]{"for loop","while loop", "looping", "nested loop"}, "nested loop"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following can be used to define the member of a class externally?",
                    new String[]{":","::", "#", "none of the mentioned"}, "::"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("It is a key feature that has a possibility to break down large programs into small modules.",
                    new String[]{"modularity","speed", "portability", "flexiblity"}, "modularity"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following individuals is credited for first designing java?",
                    new String[]{"James Gosling","Donald Trump", "Tim Ritchey", "Jim LeValley"}, "James Gosling"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which company now owns java?",
                    new String[]{"SAP","PeopleSoft Inc.", "Oracle Corporation", "Apache Software Foundation"}, "Oracle Corporation"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("What is the default value of byte variable?",
                    new String[]{"0.0","null", "not defined", "0"}, "0"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following is false about string?",
                    new String[]{"String is immutable.","String can be created using new operator.", "String is a primary data type.", "None of the above."}, "String is a primary data type."));
            myDataBaseHelper.addProgrammingQuestion(new Programming("What is an interface?",
                    new String[]{"Interface is an abstract class.","Interface is a concrete class.", "None of the above.", "Interface is an object"}, "Interface is a concrete class."));
            myDataBaseHelper.addProgrammingQuestion(new Programming("The range of indices for an array always start at:",
                    new String[]{"Size of array","1", "0", "Whatever programmer specifies."}, "0"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Java runs on",
                    new String[]{"Unix/Linux","Mac", "Windows", "All of the above."}, "All of the above."));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of the following is not a java keyword?",
                    new String[]{"try","main", "string", "integer"}, "integer"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Choose the appropriate data type for this field: isSwimmer",
                    new String[]{"Double","String", "Boolean", "Int"}, "Boolean"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("The most common format for a home video recorder is VHS. VHS stands for...?",
                    new String[]{"Voltage house standard","Video Home System", "Video horizontal standard", "Very high speed"}, "Video Home System"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Who co-founded Hotmail in 1996 and then sold the company to Microsoft?",
                    new String[]{"Sabeer Bhatia","Shawn Fanning", "Ada Byron Lovelace", "Ray Tomlinson"}, "Sabeer Bhatia"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("JPG' extension refers usually to what kind of file?",
                    new String[]{"System file","Animation/movie file", "MS Encarta document", "Image file"}, "Image file"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Who built the world's first binary digit computer: Z1...?",
                    new String[]{"Konrad Zuse","Alan Turing", "Ken Thompson", "George Boole"}, "Konrad Zuse"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("CD' computer abbreviation usually means?",
                    new String[]{"Command Description","Change Data", "Copy Density", "Compact Disc"}, "Compact Disc"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Where is the headquarters of Intel located?",
                    new String[]{"Redmond, Washington","Tucson, Arizona", "Santa Clara, California", "Richmond, Virginia"}, "Santa Clara, California"));
            myDataBaseHelper.addProgrammingQuestion(new Programming(".BAT' extension refers usually to what kind of file?",
                    new String[]{"Compressed Archive file","System file", "Backup file", "Audio file"}, "System file"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("http://www.studybuddymobileapp.com - is an example of what?",
                    new String[]{"A URL","An access code", "A server", "A directory"}, "A URL"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("What does CPU stand for?",
                    new String[]{"Cute People United","Commonwealth Press Union", "Central Processing Unit", "Computer Parts of USA"}, "Central Processing Unit"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Another word for 'Graphics for a word processor'?",
                    new String[]{"Peripheral","Highlight", "Clip art", "Execute"}, "Clip art"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("How can you catch a computer virus?",
                    new String[]{"Using a laptop during the winter","Opening e-mail attachments", "Shopping online", "Sending e-mail messages"}, "Opening e-mail attachments"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("Which of these is not a computer?",
                    new String[]{"Macintosh","Paseo", "Aptiva", "Acorn"}, "Paseo"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("The 'home page' of a web site is...",
                    new String[]{"The largest page","The first page", "The most colorful", "The last page"}, "The first page"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("ROM stands for...",
                    new String[]{"Read Only Memory","Royal Ontario Museum", "Read on Monday", "Random Only Memory"}, "Read Only Memory"));
            myDataBaseHelper.addProgrammingQuestion(new Programming("HTML is used to...",
                    new String[]{"Plot complicated graphs","Solve equations", "Translate one language into anothe", "Author webpages"}, "Author webpages"));
           /* myDataBaseHelper.addProgrammingQuestion(new Programming("",
                    new String[]{"","", "", ""}, ""));*/

            programmingList = myDataBaseHelper.getAllQuestionsListProgramming();
        }
    }

    //QUESTIONS FOR SCIENCE DONE
    public void initScience(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        scienceList = myDataBaseHelper.getAllQuestionsListScience();

        if(list.isEmpty()){
            myDataBaseHelper.addScienceQuestion (new Science ("Celsius and Fahrenheit show the same temperature at" ,
                    new String[] {"40", "100", "50", "0" }, "40"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Black hole is an object to be found" ,
                    new String[] {"in the farm", "in the sky", "in the water", "in the mountain" },  "in the sky"));

            myDataBaseHelper.addScienceQuestion (new Science ( "The disease 'bronchitis' is associated with" ,
                    new String[] {"brain", "heart", "mouth", "lungs" },  "lungs"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which element is a liquid at ordinary temperature" ,
                    new String[] {"sodium", "hydrogen", "mercury", "silicon" },  "mercury"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which is called white poison?" ,
                    new String[] {"sugar", "salt", "sand", "milk" }, "sugar"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Anemometer is an instrument used for measuring" ,
                    new String[] {"fire", "earthquake", "weather", "wind speed" },  "wind speed"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which color indicate highest temperature?" ,
                    new String[] {"blue", "violet", "dull red", "orange" },  "blue"));

            myDataBaseHelper.addScienceQuestion (new Science ( "1 RADIAN is equivalent to" ,
                    new String[] {"57.3 degree", "0 degree", "100 degree", "97.7 degree" },  "57.3 degree"));

            myDataBaseHelper.addScienceQuestion (new Science ( "The Ozone layer lies in the" ,
                    new String[] {"atmosphere", "hydrosphere", "lithosphere", "stratosphere" },  "stratosphere"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which is sodium chloride?" ,
                    new String[] {"sugar", "table salt", "coffee", "pepper" },  "table salt"));

            myDataBaseHelper.addScienceQuestion (new Science ( "What is the toxicity caused by silicon called?" ,
                    new String[] {"silicone", "glucose", "gluten", "silicosis" },  "silicosis"));

            myDataBaseHelper.addScienceQuestion (new Science ("Who invented periodic table?" ,
                    new String[] {"Dmitri Mendeleev", "Isaac Newton", "Galileo Galilei", "Albert Einstein" },  "Dmitri Mendeleev"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Who is honored as Father of Modern Chemistry?" ,
                    new String[] {"Dmitri Mendeleev", "Nikola Tesla", "Antoine Lavoisier", "Tim-Berners Lee" }, "Antoine Lavoisier"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which toxic element present in automobile exhaust?" ,
                    new String[] {"lead", "nitrogen", "carbon", "phosphorus" },  "lead"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which is the purest form of carbon?" ,
                    new String[] {"grande", "graphite", "granite", "grains" },  "graphite"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Most of the light rays inside a tube-light is in the form of" ,
                    new String[] {"white light", "blue light", "red light", "ultra violet light" },  "ultra violet light"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Persons sitting in an artificial satellite of the earth have" ,
                    new String[] {"0 weight", "50 weight", "100 weight", "10 weight" },  "0 weight"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which chemical is called Chile Salt Peter?" ,
                    new String[] {"Sodium Chloride", "Sodium Nitrate", "Sodium Chlorine", "Sodium Nitrogen" }, "Sodium Nitrate"));

            myDataBaseHelper.addScienceQuestion (new Science ( "Which is the most abundant gas in earth's atmosphere?" ,
                    new String[] {"nitrogen", "oxygen", "hydrogen", "carbon" }, "nitrogen"));

            myDataBaseHelper.addScienceQuestion (new Science ( "What is table sugar?" ,
                    new String[] {"chlorine", "glucose", "sucrose", "chloride" },  "sucrose"));

            scienceList = myDataBaseHelper.getAllQuestionsListScience();
        }
    }

    //QUESTIONS FOR FILIPINO
    public void initFilipino(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        filipinoList = myDataBaseHelper.getAllQuestionsListFilipino();

        if(list.isEmpty()){
            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang kambal katinig ay...?",
                    new String[]{"Pares Minimal"," Diptonggo ", "Salawikain", "Klaster"}, "Klaster"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Kilala bilang Huseng Batute?",
                    new String[]{"Jose Corazon de Hesus","Apolinario Mabini", "Melchora Aquino", "Gregorio H. del Pilar"}, "Jose Corazon de Hesus"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Tumatanggap ng kilos sa isang pangungusap",
                    new String[]{"Panaguri","Simuno", "Tuwirang layon", "Di - tuwirang layon"}, "Tuwirang layon"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ayaw lumabas ng bahay ni Fak, kaapg naglalakad at nakarinig ng ihip ng hangin sa mga puno, lulundag ang puso at bibilis ang kaba..  Anong damdamin ang nangingibabaw sa pahayag?",
                    new String[]{"Nakikiusap","Naiinis", "Natatakot", "Nangungulila"}, "Natatakot"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Isalin sa Filipino ang fall in line",
                    new String[]{"Mahulog sa linyaoption","Pumila ng maayos", "Ihulog sa linya", "Hulog sa linya"}, "Pumila ng maayos"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Aling bahagi ng pangungusap ang may mali:  Hihintayin kita kahapon sa liwasan ngunit hindi ka naman dumating",
                    new String[]{"Hihintayin kita","Ka naman", "Sa liwasan", "Walang mali"}, "Hihintayin kita"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang salitang yamang-dagat ay?",
                    new String[]{"Payak","Maylapi", "Inuulit", "Tambalan"}, "Tambalan"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Kauna-unahang bayani ng Pilipinas na nanguna sa pakikipaglaban kay Magellan",
                    new String[]{"Son Goku","Andres Bonifacio", "Lapu-Lapu", "Jose Rizal"}, "Lapu-Lapu"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Tanyag na hayop na matatagpuan sa Bohol",
                    new String[]{"Tarsier","Agila", "Kambeng", "Tammaraw"}, "Tarsier"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang panahong nagbigay pansin sa mga manunulat sa Kastila, Ingles at Tagalog ay",
                    new String[]{"Kastila","Koreano", "Hapon", "Amerikano"}, "Amerikano"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Pinalitan ng alpabetong Romano ang unang alpabetong Pilipino ng",
                    new String[]{"Alibata","Sankrito", "Gramatiko", "Bokabularyo"}, "Alibata"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang kauna-unahang aklat na nalimbag sa Pilipinas ay ang",
                    new String[]{"Doctrina Cristiana","Barlaan at Josaphat", "Urbana at Feliza", "Nuestra Seňora del Rosario"}, "Doctrina Cristiana"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang El Filibusterismo ay inihandog ni Rizal sa",
                    new String[]{"Kanyang Kasintahan","Kabataang Pilipino", "Kastila", "GOMBURZA"}, "GOMBURZA"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang humalili sa alibata ay ang",
                    new String[]{"Sanskrito","Kastila", "Griyego", "Romano"}, "Griyego"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang Atin Cu Pung Singsing ay awiting bayan ng mga",
                    new String[]{"Kapampangan","Waray", "Bikolano", "Tagalog"}, "Kapampangan"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang gamit o “function” ng wika ay upang manatili ang pakikipagkapwa- tao ay",
                    new String[]{"Interaksyonal"," Representasyonal", "Personal", "Instrumental"}, "Interaksyonal"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang palatandaan sa pagbasa na nagbibigay ng kaayusan ng mga salita saloob ng pangungusap",
                    new String[]{"Semantiko","Sehematiko", "Sintaktika", "Morpema"}, "Sintaktika"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang dulang ito ay itinuturing na drama simboliko noong 1903.",
                    new String[]{"Kahapon ngayon at bukas","Juego de prenda", "Karagatan", "Nena at Neneng"}, "Kahapon ngayon at bukas"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Alin sa mga ito ang karaniwang nasasaksihan sa paglalamay sa patay at paligsahan sa pangangatwiran sa paraang patula",
                    new String[]{"Karagatan","Juego de prenda", "Duplo", "Balagtasan"}, "Duplo"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Sa tulang ito pinahalagahan ni Jose Rizal ang mga kabataang Pilipino",
                    new String[]{"Ala Juevented Filipino","Filipino Dentro de cien anos", "Mi Ultimo Adios", "Sa Aking mga Kababata"}, "Ala Juevented Filipino"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ano ang tawag sa kabuuan ng mga katangian ng tao?",
                    new String[]{"Idyolek","Mode", "Register","Sosyolek"}, "Idyolek"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang palatandaan sa pagbasa na nagbibigay ng kaayusan ng mga salita saloob ng pangungusap",
                    new String[]{"Sintaktika","Morpema", "Sehematiko", "Wala sa nabangit"}, "Sintaktika"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Ang tinaguriang Lola Basyang ay si",
                    new String[]{"Gregoria de Jesus","Lope K. Santos", "Severino Reyes", "Wala sa nabangit"}, "Severino Reyes"));

            myDataBaseHelper.addFilipinoQuestion(new Filipino("Awit na panghehele",
                    new String[]{"Lullaby","Oyayi", "Hayaan mo Sila", "Wala sa nabangit"}, "Oyayi"));

            filipinoList = myDataBaseHelper.getAllQuestionsListFilipino();
        }
    }

    //QUESTIONS FOR ENGLISH
    public void initEnglish(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        englishList = myDataBaseHelper.getAllQuestionsListEnglish();

        if(list.isEmpty()){
            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Fasism","Fascism", "Fascissm", "Facism"}, "Fascism"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Endeavor","Endevor", "Endavour", "Endavore"}, "Endeavor"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Boquite","Bouquet", "Bouqeut", "Boquiet"}, "Bouquet"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Millenum","Millinuim", "Millennium", "Millenuim"}, "Millennium"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Absalute","Obsulute", "Absolete", "Obsolete"}, "Obsolete"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Lackadaisical","Lackadisical", "Lackidisical", "Lackdaisical"}, "Lackadaisical"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Clustrophobe","Claustrophobial", "Classtrophobia", "Claustrophobic"}, "Claustrophobic"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Chavinism","Chauvinicm", "Chauvinistic", "Chauvinst"}, "Chauvinistic"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Enunciate","Enuncate", "Enuncite", "Ennuncite"}, "Enunciate"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Harassing","Harrasing", "Harrassing", "Harisinng"}, "Harassing"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Benificary","Beneficary", "Beneficiary", "Binificiary"}, "Beneficiary"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Oppurtnity","Oppurtunity", "Oppurrtunity", "Opportunity"}, "Opportunity"));

            myDataBaseHelper.addEnglishQuestion(new English("Find the correctly spelled word",
                    new String[]{"Stocism","Stoicism", "Stoicssm", "Stoisicm"}, "Stoicism"));

            myDataBaseHelper.addEnglishQuestion(new English("A person who migrates to another country",
                    new String[]{"Emigrant","Foreigner", "Immigrant", "Tourist"}, "Immigrant"));

            myDataBaseHelper.addEnglishQuestion(new English("A person who knows everything",
                    new String[]{"Omnipotent","Omnipresent", "Omniscient", "Omnivorous"}, "Omniscient"));

            myDataBaseHelper.addEnglishQuestion(new English("A person who hates women",
                    new String[]{"Misanthrope","Mesogynist", "Misogamist", "Misogynist"}, "Misogynist"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of Alleviate",
                    new String[]{"Levy","Move", "Mitigate", "Moved"}, "Mitigate"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of caricature",
                    new String[]{"Paint","Cartoon", "Painter", "Draw"}, "Cartoon"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of goad",
                    new String[]{"Goat","Provoke", "Lot", "Agree"}, "Provoke"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of loaded",
                    new String[]{"Secured","Adjusted", "Complete", "Filled"}, "Filled"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of Often",
                    new String[]{"Rarely","Hardly", "Frequently", "Easily"}, "Frequently"));

            myDataBaseHelper.addEnglishQuestion(new English("Synonyms of Mounted",
                    new String[]{"Tapped","Took", "Climbed", "Moved"}, "Climbed"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of Busy",
                    new String[]{"Relaxed","Occupied", "Engrossed", "Late"}, "Relaxed"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of Attack",
                    new String[]{"Shoot","Defend", "Debt", "Product"}, "Defend"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of Amnesty",
                    new String[]{"Majesty","Punishment", "Agreement", "Pardon"}, "Punishment"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of blemish",
                    new String[]{"Blind","Famish", "Perfect", "Dirty"}, "Perfect"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of Enormous",
                    new String[]{"Soft","Tiny", "Middle", "Weak"}, "Tiny"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of impromptu",
                    new String[]{"Rehearsed","Appropriate", "Vast", "Foolish"}, "Rehearsed"));

            myDataBaseHelper.addEnglishQuestion(new English("Antonyms of Ancient",
                    new String[]{"Recent","Progressive", "Impressive", "Modern"}, "Modern"));


            englishList = myDataBaseHelper.getAllQuestionsListEnglish();
        }
    }

    //QUESTIONS FOR HISTORY
    public void initHistory(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        historyList = myDataBaseHelper.getAllQuestionsListHistory();

        if(list.isEmpty()){
            myDataBaseHelper.addHistoryQuestion(new History("Where is the Philippines Located?",
                    new String[]{"South West Asia","South East Asia", "South Asia", "East Asia"}, "South East Asia"));
            myDataBaseHelper.addHistoryQuestion(new History("What do you call a person who comes from the Philippines",
                    new String[]{"Filepino","Philippian", "Filipino", "Philippine"}, "Filipino"));
            myDataBaseHelper.addHistoryQuestion(new History("Which country occupied the Philippines during world war II",
                    new String[]{"Japan","Germany", "Spain", "United States"}, "Japan"));
            myDataBaseHelper.addHistoryQuestion(new History("Who said this immortal words A Filipino is worth dying for",
                    new String[]{"Lou Diamonds Philips","Mc Arthur", "Arnel Pineda", "Ninoy Aquino"}, "Ninoy Aquino"));
            myDataBaseHelper.addHistoryQuestion(new History("Which country had the Philippines as its colony for more than 300 years",
                    new String[]{"Spain","Italy", "England", "France"}, "Spain"));
            myDataBaseHelper.addHistoryQuestion(new History("Which of the following groups has the Philippines as its member",
                    new String[]{"NATO","SAARC", "ASEAN", "OOWWA"}, "ASEAN"));
            myDataBaseHelper.addHistoryQuestion(new History("What type of landmass is the Philippines",
                    new String[]{"Atoll","Archipelago", "Continent", "Land"}, "Archipelago"));
            myDataBaseHelper.addHistoryQuestion(new History("Who is the Filipino national hero",
                    new String[]{"Apolinario Mabini","Emilio Aguinaldo", "Andres Bonifacio", "Jose Rizal"}, "Jose Rizal"));
            myDataBaseHelper.addHistoryQuestion(new History("In what year did President Emilio Aguinaldo proclaim Philippine Independence",
                    new String[]{"1898","1998", "1899", "1988"}, "1898"));
            myDataBaseHelper.addHistoryQuestion(new History("Which of these is an official language of the Philippines",
                    new String[]{"Japanese","English", "Spanish", "Chinese"}, "English"));
            myDataBaseHelper.addHistoryQuestion(new History("Which of these is the Philippine national fruit",
                    new String[]{"Apple","Banana", "Mango", "Watermelon"}, "Mango"));
            myDataBaseHelper.addHistoryQuestion(new History("The largest lake in the Philippines",
                    new String[]{"Taal Lake","Laguna De Bay", "Basak lake", "Lake Lanao"}, "Laguna De Bay"));
            myDataBaseHelper.addHistoryQuestion(new History("The summer capital of the Philippines",
                    new String[]{"Baguio","Bataan", "Bohol", "Masinloc Zambales"}, "Baguio"));
            myDataBaseHelper.addHistoryQuestion(new History("City known as the home of durian and exotic fruits",
                    new String[]{"Malabon","Davao City", "Iligan City", "Palawan"}, "Davao City"));
            myDataBaseHelper.addHistoryQuestion(new History("He is the composer of the Philippine National Anthem",
                    new String[]{"Juan Felepe","Juan Felipe", "John Felipe", "Julian Felipe"}, "Julian Felipe"));
            myDataBaseHelper.addHistoryQuestion(new History("What is the meaning of KKK?",
                    new String[]{"Kagaling-galingan, Katapangan, Kabutihan","Kataastaasan, Kagalang-galangang, Katipunan para sa mga anak ng bayan", "Kagandahan, Katalinuhan, Kalooban", "Kilala, Kinakatakutan, Kinakalibutan"}, "Kataastaasan, Kagalang-galangang, Katipunan para sa mga anak ng bayan"));
            myDataBaseHelper.addHistoryQuestion(new History("Name the Filipino artist who painted the famous Spolarium.",
                    new String[]{"Pedro Palaez","Juan Luna", "Jose Burgos", "Graciano Lopez Jaena"}, "Juan Luna"));
            myDataBaseHelper.addHistoryQuestion(new History("Who was the first president of the Third Republic of the Philippines?",
                    new String[]{"Manuel Quezon","Juan Luna", "Manuel Roxas", "Apolinario Mabini"}, "Manuel Roxas"));
            myDataBaseHelper.addHistoryQuestion(new History("Who is the founder of the Philippine revolutionary organization named Katipunan or KKK?",
                    new String[]{"Andres Bonifacio","Emilio Jacinto", "Mariano Gomez", "Emilio Aguinaldo"}, "Andres Bonifacio"));
            myDataBaseHelper.addHistoryQuestion(new History("Former First Lady Who Owned ~3,000 Pairs of Shoes",
                    new String[]{"Cory Aquino","Gloria Macapagal Arroyo", "Dionisia Pacquio", "Imelda Marcos"}, "Imelda Marcos"));

            historyList = myDataBaseHelper.getAllQuestionsListHistory();
        }
    }

    //QUESTIONS FOR ANIMALS DONE
    public void initAnimals(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        animalsList = myDataBaseHelper.getAllQuestionsListAnimals();

        if(list.isEmpty()){

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the largest carnivore on land?",
                    new String[]{"Polar bear","Leopard", "Tiger", "Lion"}, "Polar bear"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("How many toes do ostriches have on each foot?",
                    new String[]{"1","4", "6", "2"}, "2"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What do you call animals that only eat plants?",
                    new String[]{"Omnivores","Harvibores", "Vegetarians", "Herbivores"}, "Herbivores"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("The tallest animal can grow up to 5.5 metres. What is it?",
                    new String[]{"Arctic whale","Camel", "Giraffe", "Elephant"}, "Giraffe"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("The ostrich belongs to what orders of birds?",
                    new String[]{"Paciformes","Piciformes", "Gavilformes", "Struthioniformes"}, "Struthioniformes"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("How many types of puffins exist?",
                    new String[]{"4","1", "2", "3"}, "4"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which of these species of birds eats both meat and plants as an adult?",
                    new String[]{"Blue jay","Sunbird", "Vulture", "Flycatcher"}, "Blue jay"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the largest land animal?",
                    new String[]{"Giraffe","Hippopotamus", "Africa bush Elephant", "Rhinoceros"}, "Africa bush Elephant"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the worlds leading egg-producing country?",
                    new String[]{"Korea","China", "Malaysia", "Japan"}, "China"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Falconiformes include which birds?",
                    new String[]{"Swifts, hummingbird","Falcon, hawks, eagles, ospreys", "Albatross, petrels", "Stork, heron"}, "Falcon, hawks, eagles, ospreys"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What is the flightless bird found in south America?",
                    new String[]{"Vulture","Ostrich", "Cassowary", "Rhea"}, "Rhea"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which living bird lays the worlds smallest egg?",
                    new String[]{"Bee humming bird","Woodpecker", "Gulls", "Hornbill"}, "Bee humming bird"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the tallest dog(breed)?",
                    new String[]{"Dobberman","Greyhound", "Great Dane", "Dalmatian"}, "Great Dane"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the tallest land animal?",
                    new String[]{"Girrafe","Polar Bear", "Rhinoceros", "Elephant"}, "Girrafe"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which of these land animals moves most slowly?",
                    new String[]{"Rabbit","Turtle", "Three-toed sloth", "Snail"}, "Snail"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the biggest of the great apes?",
                    new String[]{"Gorilla","Chimpanzee", "Monkey", "Orangutan"}, "Gorilla"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which bird belong to stuththionformes order?",
                    new String[]{"Horn bill","Rhea", "Ostrich", "Crane"}, "Ostrich"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What is the gestation period of an African elephant?",
                    new String[]{"Six months","Twenty two months", "Ten months", "Nine months"}, "Twenty two months"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What is another name for a pigeon?",
                    new String[]{"Common dove","Rock Dove", "Dove", "City dove"}, "Rock Dove"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Who wrote the book ‘The origin of species’?",
                    new String[]{"Charles Darwin","Sir alexander Fleming", "Stephen Hawking", "Louis Pasteur"}, "Charles Darwin"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What color is the tufted titmouse?",
                    new String[]{"Blue","Yellow", "Grey", "Black"}, "Grey"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("Which is the fastest land animal?",
                    new String[]{"Antelope","Hare", "Polar bear", "Cheetah"}, "Cheetah"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What are egg laying animals known as? ",
                    new String[]{"Reptiles","Snake", "Herbivorous", "Oviparose"}, "Snake"));

            myDataBaseHelper.addAnimalsQuestion(new Animals("What is a gecko?",
                    new String[]{"Dinosaur","Monkey", "House lizard", "Snake"}, "House lizard"));

            animalsList = myDataBaseHelper.getAllQuestionsListAnimals();
        }
    }

    //QUESTIONS FOR FOODS
    public void initFoods(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        foodsList = myDataBaseHelper.getAllQuestionsListFoods();

        if (list.isEmpty()){

            myDataBaseHelper.addFoodsQuestion(new Foods("A substance needed by the body for growth, energy, repair and maintenance is called a",
                    new String[]{"Carbohydrate","Calorie", "nutrient", "fatty acid"}, "nutrient"));
            myDataBaseHelper.addFoodsQuestion(new Foods("All of the following are nutrients found in food except",
                    new String[]{"Proteins","Carbohydrates", "Vitamins", "Plasma"}, "Plasma"));
            myDataBaseHelper.addFoodsQuestion(new Foods("A diet high in saturated fats can be linked to which of the following?",
                    new String[]{"bulimia","kidney failure ", "cardiovascular disease", "anorexia"}, "cardiovascular disease"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Amylases in saliva begin the breakdown of carbohydrates into",
                    new String[]{"fatty acids","simple sugars", "Polypeptides", "Polyeptides"}, "simple sugars"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Food passes through the stomach directly by ________",
                    new String[]{"the small intestine","the heart", "the pancreas", "the large intestine"}, "the small intestine"));
            myDataBaseHelper.addFoodsQuestion(new Foods("About half of your diet should be made up of __________.  ",
                    new String[]{"Milk and cheese","Fruits and milk", "grains and vegetables", "Fats and sugar"}, "grains and vegetables"));
            myDataBaseHelper.addFoodsQuestion(new Foods("A mineral that the body needs to work properly is ________",
                    new String[]{"Calcium","Silver", "Gold", "Lead"}, "Calcium"));
            myDataBaseHelper.addFoodsQuestion(new Foods("According to the My Pyramind food guidance system, a person should obtain most of their fat from _______",
                    new String[]{"vegetables oils, nuts, and fish","beef, chicken, and fish", "meat, milk, and cream", "milk, yogurt, and cheese"}, "vegetables oils, nuts, and fish"));
            myDataBaseHelper.addFoodsQuestion(new Foods("A(n) ___________ is a unit of energy that indicates the amount of energy contained in food.",
                    new String[]{"Label","Food guide pyramid", "Calorie", "Basket"}, "Calorie"));
            myDataBaseHelper.addFoodsQuestion(new Foods("This food group is our body’s best source of energy?",
                    new String[]{"Meat Group","fats,oils and sweets", "milk and cheese", "breads and cereals"}, "breads and cereals"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Which of these is NOT considered a nutrient?",
                    new String[]{"Minerals","Vitamins", "fiber", "fats"}, "fiber"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Which of these is added to the food label because people sometimes don’t eat ENOUGH of this",
                    new String[]{"Fat","Sodium", "Cholesterol", "calcuim"}, "calcuim"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Which of these is required on the food label?",
                    new String[]{"sugar","Cholesterol", "Sodium", "Calcium"}, "sugar"));
            myDataBaseHelper.addFoodsQuestion(new Foods("The bread, cereal, rice and pasta group is a good source of _______?",
                    new String[]{"Vitamin c","carbohydrate", "Vitamin d", "Calcium"}, "carbohydrate"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Citrus fruits are an excellent source of _______?",
                    new String[]{"Calcium","Vitamin C", "Citrus", "Vitamin b"}, "Vitamin C"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Foods from the meat, poultry, fish dry beans, eggs and nuts group are an important source of ________?",
                    new String[]{"Fiber","Beta carotene", "Iron", "Calcium"}, "Iron"));
            myDataBaseHelper.addFoodsQuestion(new Foods("Which food contains the most fat?",
                    new String[]{"Brownies","Angel food cake", "Graham crackers", "Pudding"}, "Brownies"));
            myDataBaseHelper.addFoodsQuestion(new Foods("The milk, cheese & yogurt group are important for ________?",
                    new String[]{"Hair","Face", "Eyes", "Strong bones"}, "Strong bones"));
            myDataBaseHelper.addFoodsQuestion(new Foods("How many servings of vegetables do we need each day",
                    new String[]{"6-11","11-12", "3-5", "2-4"}, "3-5"));
            foodsList = myDataBaseHelper.getAllQuestionsListFoods();
        }
    }

    //QUESTIONS FOR PLACES
    public void initPlaces(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        placesList = myDataBaseHelper.getAllQuestionsListPlaces();

        if(list.isEmpty()){
            myDataBaseHelper.addPlacesQuestion(new Places("Taj Mahal is located in which country?",
                    new String[]{"Pakistan","India", "Singapore", "Indonesia"}, "India"));
            myDataBaseHelper.addPlacesQuestion(new Places("Christ The Redeemer Statue on Corcovado Mountain is located in which country?",
                    new String[]{"Brazil"," Hungary", "Canada", "China"}, "Brazil"));
            myDataBaseHelper.addPlacesQuestion(new Places("Machu Picchu is located in which country?",
                    new String[]{"Jamaica","Cuba", "Puerto Rico", "Peru"}, "Peru"));
            myDataBaseHelper.addPlacesQuestion(new Places("The Forbidden City is located in which country?",
                    new String[]{"China","Bhutan", "Nepal", "Mongolia"}, "China"));
            myDataBaseHelper.addPlacesQuestion(new Places("Karnak Temple is located in which country?",
                    new String[]{"Tunisia","Lebanon", " Egypt", "Libya"}, " Egypt"));
            myDataBaseHelper.addPlacesQuestion(new Places("Mount Everest is located in which continent?",
                    new String[]{"Europe","Antartica", " Africa", "Asia"}, "Asia"));
            myDataBaseHelper.addPlacesQuestion(new Places("Golden Temple of Amritsar is located in which country?",
                    new String[]{"India"," China", "Pakistan", "Bangladesh"}, "India"));
            myDataBaseHelper.addPlacesQuestion(new Places("Dead Sea is located in which two countries?",
                    new String[]{"Israel-Jordan","Iran-Iraq", "Jordan-Lebanon", "Turkey-Iraq"}, "Israel-Jordan"));
            myDataBaseHelper.addPlacesQuestion(new Places("Which city does not have an obelisk?",
                    new String[]{"Rome","Cairo", "London", "Ulaanbaatar"}, "Ulaanbaatar"));
            myDataBaseHelper.addPlacesQuestion(new Places("In what city was the first skyscraper built?",
                    new String[]{"Chicago","London", "Durban", "Hong Kong"}, "Chicago"));
            myDataBaseHelper.addPlacesQuestion(new Places("What city is well known for its Carnival?",
                    new String[]{"Colombo","Khartoum", "Rio de Janeiro", "Kiev"}, "Rio de Janeiro"));
            myDataBaseHelper.addPlacesQuestion(new Places("What is the largest city in Turkey?",
                    new String[]{"Istanbul","Adana", "Ankara", "Damascus"}, "Istanbul"));
            myDataBaseHelper.addPlacesQuestion(new Places("Where can you find the Rhine River?",
                    new String[]{"Washington D.C","Paris", "Switzerland", "Great Britain"}, "Switzerland"));
            /*myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));
            myDataBaseHelper.addPlacesQuestion(new Places("",
                    new String[]{"","", "", ""}, ""));*/

            placesList = myDataBaseHelper.getAllQuestionsListPlaces();
        }
    }

    //QUESTIONS FOR ENGINEERING
    public void initEngineering(Context context){
        myDataBaseHelper = new MyDataBaseHelper(context);
        engineeringList = myDataBaseHelper.getAllQuestionsListEngineering();

        if(list.isEmpty()){
            myDataBaseHelper.addEngineeringQuestion(new Engineering("Minimum depth of ballast prescribed of B.G trunk lines of Indian Railways, is",
                    new String[]{"20cm","15cm", "25cm", "30cm"}, "25cm"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("If the pitch is 6cm and rivet value is 4 tonnes, the number of rivets required for a riveted connection carrying an eccentric load of 15 tonnes at a distance of 30 cm from the centre line is ",
                    new String[]{"8","10", "32", "6"}, "8"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("A temporary rigid structure having a platform to enable masons to work at different stages of a  building, is known as",
                    new String[]{"Dead shore","Scaffolding", "Ranking shore", "Below pinning"}, "Scaffolding"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("Formation of snow occurs if the cloud temperature is",
                    new String[]{"Just above the freezing point","At the freezing point", "Below the freezing point", "All of these"}, "Below the freezing point"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("Wrought iron contains carbon about",
                    new String[]{"1.5% to 5.5%","0.5% to 1.75%", "0.1% to 0.25%", "None of these"}, "0.1% to 0.25%"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The first method invented for planning project was",
                    new String[]{"Milestone chart","Critical path method (CPM)", "Program evaluation and review technique ", "Bar chart Method"}, "Bar chart Method"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The sound which continues even after its source is cut off, is called",
                    new String[]{"Echo","Reverberation", "Interference", "Intensity of sound"}, "Reverberation"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("Best type of piles for soft soil having little resistance to the flow of concrete is",
                    new String[]{"Vibro pile","Simplex pile", "Franki pile", "Raymond pile"}, "Vibro pile"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("If fineness modulus of sand is 2.5. it is graded as",
                    new String[]{"Coarse sand","Fine sand", "Small sand", "Very fine sand"}, "Fine sand"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The detention period in a septic tank is assumed",
                    new String[]{"20 minutes","40 minutes", "30 minutes", "50 minutes"}, "30 minutes"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("You are asked to construct a massive dam, the type of cement you will use, is",
                    new String[]{"Ordinary Portland cement","Rapid hardening cement", "Blast furnace slag cement", "Low heat cement"}, "Low heat cement"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("Filtration of water is done to remove",
                    new String[]{"Odour ","Pathogenic bacterica", "Turbidity", "Colour"}, "Turbidity"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The area of any irregular figure of the plotted map is measured with",
                    new String[]{"Sextant","Planimeter", "Pantograph", "Clinometer"}, "Planimeter"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The population growth curve is",
                    new String[]{"s-shaped curve","Parabolic shape", "Circular shape", "Straight line"}, "s-shaped curve"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("To construct a 10 cm thick partition wall you will prefer",
                    new String[]{"English bon","Flemish bond", "Stretcher bond", "Header bond"}, "Stretcher bond"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("An arch constructed with finely dressed stone is known",
                    new String[]{"Rubble arch","Gauged arch", "Axed arch", "Ashlar arch"}, "Ashlar arch"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("The floor is rubbed with oxalic acid for making its surface",
                    new String[]{"Glossy","Matt", "Uniform", "Durable"}, "Glossy"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("Plywood is made from",
                    new String[]{"Teak wood only","Bamboo", "Common timber", "Asbestos sheets"}, "Teak wood only"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("A cut in frame of a door to receive the shutter is called",
                    new String[]{"Go","Rebate", "Horn", "Stop"}, "Rebate"));


            myDataBaseHelper.addEngineeringQuestion(new Engineering("To obtain a very high strength concrete, use very fine grained",
                    new String[]{"Magnetite","Barite", "Granite", "Volcanic scoria"}, "Granite"));

            engineeringList = myDataBaseHelper.getAllQuestionsListEngineering();
        }
    }

}
