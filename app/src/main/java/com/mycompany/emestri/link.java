package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class link extends Activity 
{
	Button a;
	EditText b;
	String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
		a=(Button) findViewById(R.id.ok1);
		b=(EditText) findViewById(R.id.et1);

		a.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					
					if(b.length()==0)
					{
						Toast.makeText(link.this,"Filed Should not be empty",Toast.LENGTH_SHORT).show();


					}
					else if((Integer.parseInt(b.getText().toString()))>=500)
					{

						Intent i=new Intent(link.this,second.class);
						s=b.getText().toString();
						i.putExtra("name",s);
						startActivity(i);

					}
					else{

						Toast.makeText(link.this,"minimum area is 500",Toast.LENGTH_SHORT).show();

					}
				}
			});









    }
}
