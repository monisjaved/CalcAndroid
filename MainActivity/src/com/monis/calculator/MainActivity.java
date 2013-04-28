package com.monis.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{
    /** Called when the activity is first created. */
    EditText firstOperand;
    EditText secondOperand;
    EditText finalResult;
    OnClickListener radioGroup;
    
    double answer;
    double first_operand;
    double second_operand;
    
    Button addButton;
    Button divideButton;
    Button multiplyButton;
    Button subtractButton;
    Button final_calculation;
    
   
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        firstOperand = (EditText)findViewById(R.id.First_Operand);
        secondOperand = (EditText)findViewById(R.id.second_Operand);
        finalResult = (EditText)findViewById(R.id.finalAnswer);
        firstOperand.setInputType(InputType.TYPE_NULL);
        secondOperand.setInputType(InputType.TYPE_NULL);
        finalResult.setInputType(InputType.TYPE_NULL);
       
        addButton = (Button)findViewById(R.id.Plus);
        addButton.setOnClickListener(new AddbuttonHandler());
        
        divideButton =(Button)findViewById(R.id.divide);
        divideButton.setOnClickListener(new DivideButtonHandler());
        
        multiplyButton = (Button)findViewById(R.id.multiply);
        multiplyButton.setOnClickListener(new MultiplybuttonHandler());
        
        subtractButton = (Button)findViewById(R.id.Subtract);
        subtractButton.setOnClickListener(new SubtractButtonhandler());
        
        final_calculation = (Button)findViewById(R.id.New_calculation);
        final_calculation.setOnClickListener(new ResetAll());
       
        
    }

    private class AddbuttonHandler implements OnClickListener
    {

		@Override
		public void onClick(View v) 
		{
         
			 first_operand = Double.parseDouble(firstOperand.getText().toString());
			 second_operand = Double.parseDouble(secondOperand.getText().toString());
			 answer = first_operand + second_operand;
			 finalResult.setText(String.valueOf(answer));
         
         
		}
      
	}
   
	private class MultiplybuttonHandler implements OnClickListener
	{

		@Override
		public void onClick(View v) 
		{
		 
			first_operand = Double.parseDouble(firstOperand.getText().toString());
			second_operand = Double.parseDouble(secondOperand.getText().toString());
			answer = first_operand * second_operand;
			finalResult.setText(String.valueOf(answer));
		 
		}
	  
	}
   
	private class DivideButtonHandler implements OnClickListener
	{

		@Override
		public void onClick(View v) 
		{
		 
			first_operand = Double.parseDouble(firstOperand.getText().toString());
			second_operand = Double.parseDouble(secondOperand.getText().toString());
			answer = first_operand / second_operand;
			finalResult.setText(String.valueOf(answer));
		 
		}
	  
	}
   
	private class SubtractButtonhandler implements OnClickListener
	{

		@Override
		public void onClick(View v)
		{
    
			first_operand = Double.parseDouble(firstOperand.getText().toString());
			second_operand = Double.parseDouble(secondOperand.getText().toString());
			answer = first_operand - second_operand;
			finalResult.setText(String.valueOf(answer));
         
		}
      
	}
	
	private class ResetAll implements OnClickListener
	{

		@Override
		public void onClick(View v) 
		{
         
			firstOperand.setText("");
			secondOperand.setText("");
			finalResult.setText("");
         
         
		}
      
	}
}


