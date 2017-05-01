package com.example.android.fastingtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display("Welcome to the fasting tracker!" , btnstatus);
    }

    boolean fStatus;
    String btnstatus="Start the fast";

    public void startstop (View view) {
        if (fStatus==true) {
            stopFast();
        }
        else {
            startFast();
        }
        }

    public void startFast () {
        btnstatus="Stop the Fast";
        display ("FASTING" ,btnstatus);
        fStatus=true;
        Intent goToFastingScreen = new Intent(MainActivity.this, FastingActivity.class);
        startActivity(goToFastingScreen);
        //fastingStatus=true;
    }
    public void stopFast () {
        btnstatus="Start the Fast";
        display ("FEASTING", btnstatus);
        fStatus=false;
        //fastingStatus=false;
    }

    private void display(String status, String btnstatus) {
        //TextView displayStatus = (TextView) findViewById(R.id.statusTextView);
        //displayStatus.setText(status);
        TextView btnStartStop = (TextView) findViewById(R.id.btnStartStop);
        btnStartStop.setText(btnstatus);
    }



}
