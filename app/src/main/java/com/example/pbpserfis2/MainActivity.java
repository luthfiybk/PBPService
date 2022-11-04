package com.example.pbpserfis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start,start2,start3,stop,stop2,stop3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.buttonStart);
        start2 = (Button) findViewById(R.id.buttonStart2);
        start3 = (Button) findViewById(R.id.buttonStart3);
        stop = (Button) findViewById(R.id.buttonStop);
        stop2 = (Button) findViewById(R.id.buttonStop2);
        stop3 = (Button) findViewById(R.id.buttonStop3);

        start.setOnClickListener(this);
        start2.setOnClickListener(this);
        start3.setOnClickListener(this);
        stop.setOnClickListener(this);
        stop2.setOnClickListener(this);
        stop3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == start){
            startService(new Intent(this, MyService.class));
        }else if(view == start2) {
            startService(new Intent(this, MyService2.class));
        }else if(view == start3) {
            startService(new Intent(this, MyService3.class));
        }else if(view == stop){
            stopService(new Intent(this, MyService.class));
        }else if(view == stop2){
            stopService(new Intent(this, MyService2.class));
        }else if(view == stop3){
            stopService(new Intent(this, MyService3.class));
        }
    }
}