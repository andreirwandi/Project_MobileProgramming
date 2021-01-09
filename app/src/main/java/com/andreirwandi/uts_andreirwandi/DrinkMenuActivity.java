package com.andreirwandi.uts_andreirwandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinkMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[] = {"Jus Mangga", "Jus Alpukat", "Air Mineral", "Fanta", "Chocolate Milkshake", "Lemon Tea"};
    String s2[] = {"Rp. 15000", "Rp. 15000", "Rp. 5000", "Rp. 7000", "Rp. 15000", "Rp. 7000"};
    int images[] = {R.drawable.jus_mangga, R.drawable.jus_alpukat, R.drawable.air_mineral, R.drawable.fanta,
            R.drawable.chocolate_milkshake, R.drawable.lemon_tea};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.drink_menu);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

