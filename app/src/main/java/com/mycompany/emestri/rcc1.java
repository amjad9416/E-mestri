package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class rcc1 extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityrcc1);

		Float total,m,ru;
		Float sa=Float.parseFloat(getIntent().getExtras().getString("name"));



		TextView rate,to;


		to=(TextView) findViewById(R.id.to);
		rate=(TextView) findViewById(R.id.rate);

		Float ru11=Float.parseFloat(rate.getText().toString());
		ru=sa*ru11;
		to.setText(String.valueOf(ru));








    }

}
