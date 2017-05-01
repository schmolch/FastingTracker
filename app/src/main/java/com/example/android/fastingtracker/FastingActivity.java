package com.example.android.fastingtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FastingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasting);
    }

    public void goBack(View view) {
        finish();
        //System.out.println("goBAC")
        //Intent goToFastingScreen = new Intent(FastingActivity.this, MainActivity.class);
        //startActivity(goToFastingScreen);
    }

}

