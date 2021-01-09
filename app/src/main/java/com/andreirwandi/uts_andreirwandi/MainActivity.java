package com.andreirwandi.uts_andreirwandi;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonDrinks;
    private Button buttonMyOrder;
    private Button buttonMaps;
    private Button buttonTopUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDrinks = (Button) findViewById(R.id.buttonDrinks);
        buttonDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        buttonMyOrder = (Button) findViewById(R.id.buttonMyOrder);
        buttonMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        buttonMaps = (Button) findViewById(R.id.buttonMaps);
        buttonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        buttonTopUp = (Button) findViewById(R.id.buttonTopUp);
        buttonTopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity2(){
        Intent intent2 = new Intent(this, DrinkMenuActivity.class);
        startActivity(intent2);
    }

    public void openActivity3(){
        Intent intent2 = new Intent(this, OrderActivity.class);
        startActivity(intent2);
    }

    public void openActivity4(){
        Intent intent2 = new Intent(this, MapsActivity.class);
        startActivity(intent2);
    }

    public void openActivity5(){
        Intent intent2 = new Intent(this, TopUpActivity.class);
        startActivity(intent2);
    }
}
