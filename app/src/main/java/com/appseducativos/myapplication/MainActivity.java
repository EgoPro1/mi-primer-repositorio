package com.appseducativos.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //programar timer
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Ventana2= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(Ventana2);
            }
        },3000);
    }
}
