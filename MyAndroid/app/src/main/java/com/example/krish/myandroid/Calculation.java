package com.example.krish.myandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        try {
            Bundle extra = getIntent().getExtras();
            int x = extra.getInt("total");
            Toast.makeText(Calculation.this, "" +x, Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void calculate (View v){
        EditText num1=(EditText)findViewById(R.id.num1);
        EditText num2=(EditText)findViewById(R.id.num2);

        Intent i= new Intent(Calculation.this,Response.class);
        i.putExtra("x",num1.getText().toString());
        i.putExtra("y",num2.getText().toString());
        startActivity(i);
    }



}
