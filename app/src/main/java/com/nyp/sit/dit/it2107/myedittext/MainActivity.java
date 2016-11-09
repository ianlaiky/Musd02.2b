package com.nyp.sit.dit.it2107.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numberGreaterThan25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberGreaterThan25 = (EditText) findViewById(R.id.etNumBiggerThan25);
    }

    public void btnValidate(View v){
int num = Integer.parseInt(numberGreaterThan25.getText().toString());


        if(num <=25){


            numberGreaterThan25.setError("Number is lesser or equal 25");
        }


    }
}
