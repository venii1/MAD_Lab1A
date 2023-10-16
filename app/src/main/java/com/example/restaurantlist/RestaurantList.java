package com.example.restaurantlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class RestaurantList extends AppCompatActivity {
    private EditText restaurantName;
    private EditText restaurantAddress;
    private EditText restaurantTel;
    private RadioGroup restaurantTypes;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        restaurantName = findViewById(R.id.restaurant_name);
        restaurantTypes = findViewById(R.id.restaurant_types);
        buttonSave = findViewById(R.id.button_save);
        buttonSave.setOnClickListener(onSave);
        restaurantAddress = findViewById(R.id.restaurant_address);
        restaurantTel = findViewById(R.id.restaurant_tel);
    }

    private View.OnClickListener onSave = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            String nameStr = restaurantName.getText().toString();
            String addressStr = restaurantAddress.getText().toString();
            String telStr = restaurantTel.getText().toString();
            String restType = "";
            int radioID = restaurantTypes.getCheckedRadioButtonId();
            if (radioID == R.id.chinese){
                restType = "Chinese";
            }
            if (radioID == R.id.western){
                restType = "Western";
            }
            if (radioID == R.id.indian){
                restType = "Indian";
            }
            if (radioID == R.id.indonesia){
                restType = "Indonesia";
            }
            if (radioID == R.id.korean){
                restType = "Korean";
            }
            if (radioID == R.id.japanese){
                restType = "Japanese";
            }
            if (radioID == R.id.thai){
                restType = "Thai";
            }
            String combineStr = nameStr + "\n" + addressStr +"\n" + telStr +"\n" + restType;
            Toast.makeText(getApplicationContext(), combineStr, Toast.LENGTH_LONG).show();
        }
    };
}