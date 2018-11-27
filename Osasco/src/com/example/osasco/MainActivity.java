package com.example.osasco;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button botao1, botao2; 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        botao1 = (Button) findViewById(R.id.btn1);
        botao2 = (Button) findViewById(R.id.btn2);
        
        botao1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this, MainActivity2.class));
				
			}
		});
        
        botao2.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View v) {
     				// TODO Auto-generated method stub
     				
     				startActivity(new Intent(MainActivity.this, MainActivity3.class));
     				
     			}
     		});
    }


 
    
}
