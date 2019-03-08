package com.princeadom.currencyconverter;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertMoney(View view){
        EditText dollar_amount = findViewById(R.id.editText);
        double amount_toDouble = Double.parseDouble(dollar_amount.getText().toString());
        double cedi_amount = (amount_toDouble * 5.47);
        String amount_toString = "$" + amount_toDouble + " is equivalent to ₵%.2f";

        Toast.makeText(getApplicationContext(), String.format(amount_toString, cedi_amount), Toast.LENGTH_LONG).show();

        TextView display_price = findViewById(R.id.display_textView);
        display_price.setBackgroundColor(Color.parseColor("#f9a825"));
        display_price.setTextColor(Color.parseColor("#263238"));
        display_price.setText(String.format(amount_toString, cedi_amount));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
