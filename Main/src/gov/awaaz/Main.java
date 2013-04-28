package gov.awaaz;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;

public class Main extends Activity 
{
	Button buttons1, buttons2 , buttons3 , buttons4 , buttons5 , buttons6 , buttons7;
	Intent i;
	
	public void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    buttons1 = (Button)findViewById(R.id.button1);
	    buttons2 = (Button)findViewById(R.id.button2);
	    buttons3 = (Button)findViewById(R.id.button3);
	    buttons4 = (Button)findViewById(R.id.button4);
	    buttons5 = (Button)findViewById(R.id.button5);
	    buttons6 = (Button)findViewById(R.id.button6);
	    buttons7 = (Button)findViewById(R.id.button7);
	    buttons1.setOnClickListener(buttonhandler);
        buttons2.setOnClickListener(buttonhandler);
        buttons3.setOnClickListener(buttonhandler);
        buttons4.setOnClickListener(buttonhandler);
        buttons5.setOnClickListener(buttonhandler);
        buttons6.setOnClickListener(buttonhandler);
        buttons7.setOnClickListener(buttonhandler);
	}
	        

   /*private class AgrobuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Agriculture.class);
			 startActivity(i);     
		}
	}
	
	private class EdubuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Education.class);
			 startActivity(i);     
		}
	}
	
	private class EnergybuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Energy.class);
			 startActivity(i);     
		}
	}
	
	private class HealthbuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Health.class);
			 startActivity(i);     
		}
	}
	
	private class MacrobuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Macro.class);
			 startActivity(i);     
		}
	}
	
	private class UrbanbuttonHandler implements OnClickListener
	{
	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Urban.class);
			 startActivity(i);     
		}
	}
	
	private class WaterbuttonHandler implements OnClickListener
	{	
		public void onClick(View v) 
		{
	     
			 i = new Intent(Main.this,Water.class);
			 startActivity(i);     
		}
	}*/
	
	View.OnClickListener buttonhandler=new View.OnClickListener() 
	{ 
		public void onClick(View v)
		{
				switch (v.getId()) 
				{
					case R.id.button1:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Agriculture.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button2:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Education.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button3:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Energy.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button4:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Health.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button5:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Macro.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button6:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Urban.class);
				    Main.this.startActivity(i);
				      break;
						 
					case R.id.button7:    //<<---- notice end line with colon, not a semicolon
				          i = new Intent(Main.this, Water.class);
				    Main.this.startActivity(i);
				      break;	 
				}
		}
	};
  
}