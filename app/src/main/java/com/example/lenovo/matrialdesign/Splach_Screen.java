package com.example.lenovo.matrialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splach_Screen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        Thread th = new Thread(){

            @Override
            public void run(){
                try {
                    sleep(1000);
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        th.start();
    }
}
