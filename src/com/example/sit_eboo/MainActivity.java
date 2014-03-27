package com.example.sit_eboo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity 
{

	Button btnEng;
	Button btnMar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void dispEng(View v)
	{
		Intent i = new Intent(MainActivity.this,engStandardSelection.class);
		startActivity(i);
		finish();
	}
	public void dispMar(View v)
	{
		
	}
}
