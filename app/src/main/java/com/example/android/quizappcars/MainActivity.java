package com.example.android.quizappcars;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



public void submitAnswer(View v){

    int score=0;


    // get given player name
    EditText editText = (EditText) findViewById(R.id.nameBar);
    String name;

    // if player did not give name, use unknown driver
    if(editText.getText().toString().length() == 0) {
        name = "Unknown driver";
    } else {
        name = editText.getText().toString();
    }




    RadioButton button1 = (RadioButton)findViewById(R.id.answer1Button2);
    if(button1.isChecked()) {
        score++;
    }

    RadioButton button2 = (RadioButton)findViewById(R.id.answer2Button3);
    if(button2.isChecked()) {
        score++;
    }


    RadioButton button3 = (RadioButton)findViewById(R.id.answer3Button);
    if(button3.isChecked()) {
        score++;
    }

    CheckBox box1 = (CheckBox)findViewById(R.id.answer1Box);
    CheckBox box2 = (CheckBox)findViewById(R.id.answer1Box2);
    CheckBox box3 = (CheckBox)findViewById(R.id.answer1Box3);
    CheckBox box4 = (CheckBox)findViewById(R.id.answer1Box4);

    if(box1.isChecked() && !box2.isChecked() && !box3.isChecked() && box4.isChecked()) {
        score++;
    }

    CheckBox box5 = (CheckBox)findViewById(R.id.answer2Box);
    CheckBox box6 = (CheckBox)findViewById(R.id.answer2Box2);
    CheckBox box7 = (CheckBox)findViewById(R.id.answer2Box3);
    CheckBox box8 = (CheckBox)findViewById(R.id.answer2Box4);

    if(box5.isChecked() && !box6.isChecked() && box7.isChecked() && !box8.isChecked()) {
        score++;
    }

    EditText lastAnswer = (EditText) findViewById(R.id.answerText);
    String year="1966";

    // if player did not give name, use unknown driver
    if(lastAnswer.getText().toString().equals(year)) {
        score++;
    }

    // this sums toast message
    String toastMessage = name + " " + score + " Nice Score!!!";

    // show toast
    Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();


}

}
