package com.example.krish.swapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Swap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);
    }

    public void swapping (View v){
        EditText num1=(EditText)findViewById(R.id.editText);
        EditText num2=(EditText)findViewById(R.id.editText2);
        Editable i,j;
        i=num1.getText();
        j=num2.getText();
        num1.setText(j, TextView.BufferType.EDITABLE);
        num2.setText(i, TextView.BufferType.EDITABLE);
    }
}
