package com.example.krish.colours;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class RGBColour extends AppCompatActivity {

    RelativeLayout rv1,rv2,rv3;
    int a[];
    static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgbcolour);

        a=new int[3];
        a[0]=Color.RED;
        a[1]=Color.GREEN;
        a[2]=Color.YELLOW;

        rv1 = (RelativeLayout) findViewById(R.id.First);
        rv1.setBackgroundColor(a[0]);
        rv2 = (RelativeLayout) findViewById(R.id.Second);
        rv2.setBackgroundColor(a[1]);
        rv3 = (RelativeLayout) findViewById(R.id.Third);
        rv3.setBackgroundColor(a[2]);

    }

    public void colorChange(View v){

        Log.e("::::",i+"");
        i++;
        rv1.setBackgroundColor(a[i%3]);

        rv2.setBackgroundColor(a[(i+1)%3]);

        rv3.setBackgroundColor(a[(i+2)%3]);
    }
}
