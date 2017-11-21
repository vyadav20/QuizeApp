package com.varshayadv.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.R.attr.checkBoxPreferenceStyle;
import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    CheckBox optionOne,optionTwo, optionOneForSecond,optionTwoForSecond, optionOneForThird,optionTwoForThird, optionOneForFourth,optionTwoForFourth, optionOneForFifth,optionTwoForFifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionOne=(CheckBox) findViewById(R.id.first_question_option1);
        optionTwo=(CheckBox) findViewById(R.id.first_question_option2);

       optionOne.setOnClickListener(new View.OnClickListener(){
       public void onClick(View v){
           if (optionOne.isChecked()) {
               optionTwo.setChecked(false);
           }
       }});

        optionTwo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
        if (optionTwo.isChecked()) {
            optionOne.setChecked(false);
        }
    }});

        //second question
        optionOneForSecond=(CheckBox) findViewById(R.id.second_question_option1);
        optionTwoForSecond=(CheckBox) findViewById(R.id.second_question_option2);

        optionOneForSecond.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v){
              if(optionOneForSecond.isChecked()){
                  optionTwoForSecond.setChecked(false);
              }
          }
        });

        optionTwoForSecond.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionTwoForSecond.isChecked()){
                    optionOneForSecond.setChecked(false);
                }
            }
        });

        //third Question
        optionOneForThird=(CheckBox) findViewById(R.id.third_question_option1);
        optionTwoForThird=(CheckBox) findViewById(R.id.third_question_option2);

        optionOneForThird.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionOneForThird.isChecked()){
                    optionTwoForThird.setChecked(false);
                }
            }
        });

        optionTwoForThird.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionTwoForThird.isChecked()){
                    optionOneForThird.setChecked(false);
                }
            }
        });

        //fourth question
        optionOneForFourth=(CheckBox) findViewById(R.id.fourth_question_option1);
        optionTwoForFourth=(CheckBox) findViewById(R.id.fourth_question_option2);

        optionOneForFourth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionOneForFourth.isChecked()){
                    optionTwoForFourth.setChecked(false);
                }
            }
        });

        optionTwoForFourth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionTwoForFourth.isChecked()){
                    optionOneForFourth.setChecked(false);
                }
            }
        });

        //fifth question
        optionOneForFifth=(CheckBox) findViewById(R.id.fifth_question_option1);
        optionTwoForFifth=(CheckBox) findViewById(R.id.fifth_question_option2);

        optionOneForFifth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionOneForFifth.isChecked()){
                    optionTwoForFifth.setChecked(false);
                }
            }
        });

        optionTwoForFifth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(optionTwoForFifth.isChecked()){
                    optionOneForFifth.setChecked(false);
                }
            }
        });


    }
    //firstQuestion
    public void TheAnswer(View View){

        boolean hasoptionOne=optionOne.isChecked();
        boolean hasoptionTwo=optionTwo.isChecked();

        String ansMsg=andAnswer(hasoptionOne,hasoptionTwo);
        firstQuestion(ansMsg);
    }
    private String andAnswer(boolean aoptionOne , boolean aoptionTwo ){
        String msg="";
        if((aoptionOne)) {
            msg = "wrong" ;
        }
        if((aoptionTwo)){
            msg="Right";
        }
        return msg;
    }

    private void firstQuestion(String ans){
        TextView firstQuestionTextView = (TextView) findViewById(R.id.first_question);
        firstQuestionTextView.setText(ans);
    }
    //second question
    public void TheAnswerSecond(View view){
        boolean hasoptionOneForSecond=optionOneForSecond.isChecked();
        boolean hasoptionTwoForSecond=optionTwoForSecond.isChecked();

        String ansMsgSecond=andAnswerTwo(hasoptionOneForSecond,hasoptionTwoForSecond);
        secondQuestion(ansMsgSecond);
    }
    private String andAnswerTwo(boolean aoptionOneForSecond, boolean aoptionTwoForSecond){
        String msgSecond="";
        if((aoptionOneForSecond)){
            msgSecond="Right";
        }
        if((aoptionTwoForSecond)){
            msgSecond="Wrong";
        }
        return msgSecond;
    }

    private void secondQuestion(String ansSecond){
        TextView secondQuestionTextView=(TextView) findViewById(R.id.second_question);
        secondQuestionTextView.setText(ansSecond);
    }
    //third question
    public void TheAnswerThird(View view){
        boolean hasoptionOneForThird=optionOneForThird.isChecked();
        boolean hasoptionTwoForThird=optionTwoForThird.isChecked();

        String ansMsgThird=andAnswerThree(hasoptionOneForThird,hasoptionTwoForThird);
        ThirdQuestion(ansMsgThird);
    }
    private String andAnswerThree(boolean aoptionOneForThird, boolean aoptionTwoForThird){
        String msgThird="";
        if((aoptionOneForThird)){
            msgThird="Right";
        }
        if((aoptionTwoForThird)){
            msgThird="Wrong";
        }
        return msgThird;
    }

    private void ThirdQuestion(String ansThird){
        TextView ThirdQuestionTextView=(TextView) findViewById(R.id.third_question);
        ThirdQuestionTextView.setText(ansThird);
    }

    //fourth question
    public void TheAnswerFourth(View view){
        boolean hasoptionOneForFourth=optionOneForFourth.isChecked();
        boolean hasoptionTwoForFourth=optionTwoForFourth.isChecked();

        String ansMsgFourth=andAnswerFour(hasoptionOneForFourth,hasoptionTwoForFourth);
        FourthQuestion(ansMsgFourth);
    }
    private String andAnswerFour(boolean aoptionOneForFourth, boolean aoptionTwoForFourth){
        String msgFourth="";
        if((aoptionOneForFourth)){
            msgFourth="Wrong";
        }
        if((aoptionTwoForFourth)){
            msgFourth="Right";
        }
        return msgFourth;
    }

    private void FourthQuestion(String ansFourth){
        TextView FourthQuestionTextView=(TextView) findViewById(R.id.fourth_question);
        FourthQuestionTextView.setText(ansFourth);
    }

    //fifth question
    public void TheAnswerFifth(View view){
        boolean hasoptionOneForFifth=optionOneForFifth.isChecked();
        boolean hasoptionTwoForFifth=optionTwoForFifth.isChecked();

        String ansMsgFifth=andAnswerFive(hasoptionOneForFifth,hasoptionTwoForFifth);
        FifthQuestion(ansMsgFifth);
    }
    private String andAnswerFive(boolean aoptionOneForFifth, boolean aoptionTwoForFifth){
        String msgFifth="";
        if((aoptionOneForFifth)){
            msgFifth="Right";
        }
        if((aoptionTwoForFifth)){
            msgFifth="Wrong";
        }
        return msgFifth;
    }

    private void FifthQuestion(String ansFourth){
        TextView FifthQuestionTextView=(TextView) findViewById(R.id.fifth_question);
        FifthQuestionTextView.setText(ansFourth);
    }
}
