package com.example.yolo_fighter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class YoloMainMenu extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState) 

	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		ImageButton start = (ImageButton) findViewById(R.id.btnStart);
		
		start.getBackground().setAlpha(YoloEngine.MENU_BUTTON_ALPAH);
	}
	
	public void startClick(View v)
	{
		Intent game = new Intent(getApplicationContext(),YoloGame.class);
		YoloMainMenu.this.startActivity(game);
		YoloEngine.context = getApplicationContext();
	}
	@Override
	public void onResume()
	{
		super.onResume();
	}

}
