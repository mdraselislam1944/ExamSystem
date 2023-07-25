package com.example.examquestion;

public class QuestionLibrary {
    private String mQuestion []={
            "Which bird is the plan?",
            "This is first part",
            "This is the second part",
            "This is the third part",
    };
    private String mChoice [][]={
            {"Roots","Stem","Flower"},
            {"Fruits","Banana","Apple"},
            {"Bark","Flower","Roots","Roots"},
            {"API","BPI","CPI","DPI"},
    };
    private  String mCorrectAnswers[]={
        "Roots","Fruits","Flower","DPI",
    };
    public String getQuestion(int a){
        String q=mQuestion[a];
        return  q;
    };
    public String getChoice1(int a){
        String  choice0=mChoice[a][0];
        return choice0;
    };
    public String getChoice2(int a){
        String  choice0=mChoice[a][1];
        return choice0;
    };
    public String getChoice3(int a){
        String  choice0=mChoice[a][2];
        return choice0;
    };
    public String getCorrectAnswer(int a){
        String  choice0=mCorrectAnswers[a];
        return choice0;
    };
}
