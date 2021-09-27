package com.example.navigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.navigator.adapter.InstituteAdapter;

public class logotip extends Activity {
    private final int SPLASH_DISPLEY_LENGHT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logotip);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(logotip.this, InstituteAdapter.class);
                logotip.this.startActivity(mainIntent);
                logotip.this.finish();
            }
        },SPLASH_DISPLEY_LENGHT);
        }
            @Override
    public void onBackPressed() {
            super.onBackPressed();
        }
    }

