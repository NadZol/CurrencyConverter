//Nadezda Zolotareva    Currency Converter  02/05/2020
package com.example.currencyconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //sets the layout for the activity

        final EditText eText = (EditText) findViewById(R.id.editText); //initialize the edit text
        Button btn = (Button) findViewById(R.id.button); //initialize the button

        btn.setOnClickListener(new View.OnClickListener() { //method that executes when the button is pressed
            public void onClick(View v) {
                int input = Integer.parseInt(eText.getText().toString()); //stores the input entered by the user
                Toast.makeText( getApplicationContext(), "£" + input + " is $" + (input*1.25), Toast.LENGTH_LONG).show(); //outputs the inputted currency and converted currency in a toast
            }
        });
    }
}
