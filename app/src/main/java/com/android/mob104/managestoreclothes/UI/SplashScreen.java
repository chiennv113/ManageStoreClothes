package com.android.mob104.managestoreclothes.UI;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.mob104.managestoreclothes.R;
import com.android.mob104.managestoreclothes.UI.LoginActicity;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN_HIDDEN = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActicity.class));
                finish();
            }
        }, SPLASH_SCREEN_HIDDEN);

    }
}
