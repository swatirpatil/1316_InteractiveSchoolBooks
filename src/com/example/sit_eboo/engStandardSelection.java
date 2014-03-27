package com.example.sit_eboo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class engStandardSelection extends Activity 
{
	Button btnStd1 ;
	Button btnStd2 ;
	
	 public void onCreate(Bundle bundle) 
	 {
		    super.onCreate(bundle);
		    setContentView(R.layout.std_layout_eng);
		    Toast.makeText(this, "hi in another intent", Toast.LENGTH_SHORT).show();
		    
		    btnStd1 = (Button) findViewById(R.id.btnStd1);
		    btnStd2 = (Button) findViewById(R.id.btnStd2);
	}
	 public void dispStd1(View v)
	 {
		   Toast.makeText(this, "clicked on button 1", Toast.LENGTH_SHORT).show();
	 }
}
