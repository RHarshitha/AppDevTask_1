package com.example.harshitha.counterapp;

import android.content.DialogInterface;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;


public class CounterApp extends ActionBarActivity implements View.OnClickListener{
    Button button;
    TextView textview;
    public int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_app);
        button=(Button)findViewById(R.id.button);
        textview=(TextView)findViewById(R.id.textView);
        textview.setText("0");
        button.setOnClickListener(this);

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("counter",i);
        Log.d("SAVED STATE","i VALUE WAS SAVED");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState( savedInstanceState);
        i = savedInstanceState.getInt("counter");
        Log.d("RESTORED STATE", "i VALUE WAS RESTORED");
    }
    @Override
    public void onClick(View v) {
    i+=1;
    textview.setText(String.valueOf(i));
    }
}
