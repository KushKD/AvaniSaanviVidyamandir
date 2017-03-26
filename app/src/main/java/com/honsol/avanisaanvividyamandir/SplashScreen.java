package com.honsol.avanisaanvividyamandir;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {




    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if(AppStatus.getInstance(SplashScreen.this).isOnline()){
                    Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);   //Main_Activity  //Notifications_Testing
                    SplashScreen.this.startActivity(mainIntent);
                    SplashScreen.this.finish();
                }else{
                    // Show Connec to Internet Screen
                    Intent mainIntent = new Intent(SplashScreen.this, internet.class);   //Main_Activity  //Notifications_Testing
                    SplashScreen.this.startActivity(mainIntent);
                    SplashScreen.this.finish();
                }







            }
        }, 3000);
    }








}
