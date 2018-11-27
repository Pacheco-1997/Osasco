package com.example.osasco;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends Activity {
	
	private Button botaoVoltar2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		
	botaoVoltar2 = (Button) findViewById(R.id.btnvoltar2);
        
		botaoVoltar2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity3.this, MainActivity.class));
				
			}
		});
	}



}
