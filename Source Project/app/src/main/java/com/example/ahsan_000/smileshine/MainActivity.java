package com.example.ahsan_000.smileshine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button brushing, flossing, wiping, rinsing, health, DentalCheckUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init(); //defined function for the  initialization section
    }

    private void init()
    {
        //Buttons are initialized
        this.brushing = (Button) findViewById(R.id.brushing);
        this.brushing.setOnClickListener(this);

        this.flossing = (Button) findViewById(R.id.flossing);
        this.flossing.setOnClickListener(this);

        this.wiping = (Button) findViewById(R.id.wiping);
        this.wiping.setOnClickListener(this);

        this.rinsing = (Button) findViewById(R.id.rinsing);
        this.rinsing.setOnClickListener(this);

        this.health = (Button) findViewById(R.id.healthyFood);
        this.health.setOnClickListener(this);

        this.DentalCheckUp = (Button) findViewById(R.id.checkUp);
        this.DentalCheckUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == brushing)
        {
            // Descriptive details written onto another Activity for Brushing, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, BrushingActivity.class));
        }
        else if(v == flossing)
        {
            // Descriptive details written onto another Activity for Flossing, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, FlossingActivity.class));
        }
        else if(v == wiping)
        {
            // Descriptive details written onto another Activity for Wiping, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, WipingActivity.class));
        }
        else if(v == rinsing)
        {
            // Descriptive details written onto another Activity for Rinsing, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, RinsingActivity.class));
        }
        else if(v == health)
        {
            // Descriptive details written onto another Activity for Health, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, HealthActivity.class));
        }
        else
        {
            // Descriptive details written onto another Activity for Check-up, that is, to initiated
            // if the button is pressed
            startActivity(new Intent(MainActivity.this, DentalCheckUpActivity.class));
        }
    }
}
