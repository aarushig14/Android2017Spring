package com.condingblocks.services;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                loopWithLog(10);
                Intent i  = new Intent(MainActivity.this , MyService.class);
                startService(i);
            }
        });

    }

    public void loopWithLog(int duration){
        long startTime = System.currentTimeMillis();

        for(int i  = 0 ; i < duration ; i++){
            loopWithOne();
            Log.d("TAG", "loopWithLog: ");
        }
    }

    public void loopWithOne(){
        long startTime = System.currentTimeMillis();

        while(System.currentTimeMillis() - startTime < 1000);
    }
}
