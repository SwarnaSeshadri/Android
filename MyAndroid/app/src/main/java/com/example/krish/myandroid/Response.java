package com.example.krish.myandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Response extends Activity {

    int iz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        Bundle extra=getIntent().getExtras();
        String x=extra.getString("x");
        String y=extra.getString("y");

        try {
            int ix = Integer.parseInt(x);
            int iy = Integer.parseInt(y);

            iz = ix + iy;
        }
        catch (Exception e){
            iz=0;
        }
      //  Toast.makeText(Response.this, ""+iz, Toast.LENGTH_SHORT).show();




    }

    public void responder(View v){
        Intent i= new Intent(Response.this,Calculation.class);
        i.putExtra("total", iz);
        startActivity(i);
        //startActivityForResult(i,2);
    }



}
