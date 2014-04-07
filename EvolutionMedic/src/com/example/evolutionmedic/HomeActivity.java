package com.example.evolutionmedic;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.widget.ImageView;

public class HomeActivity extends Activity {

	AnimationDrawable animacao;
	ImageView progressBar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        progressBar = (ImageView) findViewById(R.id.progressBar);
        
        animacao = (AnimationDrawable) progressBar.getBackground();
        animacao.start();
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 Intent it = new Intent(HomeActivity.this, MainActivity.class);
			        startActivity(it);
			        finish();
			}
		}, 3000);
        
       
        
    }

}
