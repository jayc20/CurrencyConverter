package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//App that converts dollar value to Swiss Francs
public class MainActivity extends AppCompatActivity {

    String Value;
    double convertFranc;
    EditText money;
    double swissFrancConv = 0.92;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertValue(View view) {
        money = (EditText) findViewById(R.id.etmoney);
        Value = money.getText().toString();
        convertFranc = Double.parseDouble(Value) * swissFrancConv;

        Toast.makeText(this, "Dollar in Swiss Franc is " + convertFranc, Toast.LENGTH_LONG).show();
    }
}