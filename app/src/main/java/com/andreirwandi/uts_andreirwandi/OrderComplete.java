package com.andreirwandi.uts_andreirwandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderComplete extends AppCompatActivity {

    private Button ButtonBackHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);

        ButtonBackHome = (Button) findViewById(R.id.home);
        ButtonBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}