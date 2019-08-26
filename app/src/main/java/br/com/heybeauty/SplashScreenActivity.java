package br.com.heybeauty;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundColor(Color.parseColor("#000000"))
                .withBeforeLogoText(getString(R.string.welcome1))
                .withAfterLogoText(getString(R.string.app_name))
                .withLogo(R.drawable.logo);


        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);






    }
}
