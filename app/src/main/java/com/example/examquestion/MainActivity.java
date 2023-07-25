package com.example.examquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private  Button mQuiz;
    private String mAnswer;
    private int mScore=0;
    private  int mQuestionNumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView=(TextView) findViewById(R.id.tvScore);
        mQuestionView=(TextView)  findViewById(R.id.tvQuestion);
        mButtonChoice1=(Button) findViewById(R.id.btnChoice1);
        mButtonChoice2=(Button) findViewById(R.id.btnChoice2);
        mButtonChoice3=(Button) findViewById(R.id.btnChoice3);
        mQuiz=(Button) findViewById(R.id.btnQuiz);
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(mButtonChoice1.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updateQuestion();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"SomeThing wrong",Toast.LENGTH_LONG).show();
                }

            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(mButtonChoice1.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updateQuestion();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"SomeThing wrong",Toast.LENGTH_LONG).show();
                }

            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(mButtonChoice1.getText()==mAnswer){
                        mScore=mScore+1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_LONG).show();
                        updateQuestion();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"SomeThing wrong",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mAnswer=mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber=mQuestionNumber+1;
    }

    private  void updateScore (int point){
        mScoreView.setText("Score: "+point);
    }

}