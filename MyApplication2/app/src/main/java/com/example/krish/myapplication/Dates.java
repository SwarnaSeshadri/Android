package com.example.krish.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class Dates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dates, menu);
        return true;
    }

    public void display (View v){
        DatePicker dp= (DatePicker)findViewById(R.id.datePicker);
        int x=dp.getMonth()+1;
        Toast.makeText(Dates.this, ""+dp.getDayOfMonth()+":::"+x+":::"+dp.getYear(), Toast.LENGTH_SHORT).show();
    }
}
