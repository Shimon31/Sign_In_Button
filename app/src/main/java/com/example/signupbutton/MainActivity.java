package com.example.signupbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    Button button;
    AutoCompleteTextView bloodGroupTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);
        bloodGroupTv = findViewById(R.id.bloodGroupAtv);

        String[] bloodGroup = {"A+", "A-", "AB+","AB-", "B+", "B-", "O+", "O-",};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bloodGroup);
        bloodGroupTv.setAdapter(arrayAdapter);
        bloodGroupTv.setThreshold(1);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    button.setVisibility(View.VISIBLE);
                }
                else{
                    button.setVisibility(View.GONE);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sign up Successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}