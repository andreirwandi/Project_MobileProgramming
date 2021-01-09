package com.andreirwandi.uts_andreirwandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    int quantity = 0;
    private Button ButtonPayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ButtonPayNow = (Button) findViewById(R.id.pay_now);
        ButtonPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity4(){
        Intent intent2 = new Intent(this, OrderComplete.class);
        startActivity(intent2);
    }

    public void decrementquantity(View view) {
        quantity = quantity-1;
        if(quantity<0){
            Toast.makeText(getApplicationContext(), "Cannot less than 1", Toast.LENGTH_SHORT).show();
        }else {
            displayquantity(quantity);
        }
    }

    public void incrementquantity(View view) {
        quantity = quantity+1;
        if(quantity>50){
            Toast.makeText(getApplicationContext(), "Cannot more than 50", Toast.LENGTH_SHORT).show();
        }else {
            displayquantity(quantity);
        }
    }

    private void displayquantity(int quantity) {
        TextView quantity1 = (TextView) findViewById(R.id.quantitychange_value);
        quantity1.setText("" +quantity);
    }

    public void OrderButton(View view) {
        EditText name = (EditText) findViewById(R.id.Enter_your_name);
        String names = name.getText().toString();

        CheckBox jusMangga = (CheckBox) findViewById(R.id.jus_mangga);
        Boolean jusManggaChecked = jusMangga.isChecked();

        CheckBox jusAlpukat = (CheckBox) findViewById(R.id.jus_alpukat);
        Boolean jusAlpukatChecked = jusAlpukat.isChecked();

        CheckBox airMineral = (CheckBox) findViewById(R.id.air_mineral);
        Boolean airMineralChecked = airMineral.isChecked();

        CheckBox fanta = (CheckBox) findViewById(R.id.fanta);
        Boolean fantaChecked = fanta.isChecked();

        CheckBox chocolateMilkshake = (CheckBox) findViewById(R.id.chocolate_milkshake);
        Boolean chocolateMilkshakeChecked =  chocolateMilkshake.isChecked();

        CheckBox lemonTea = (CheckBox) findViewById(R.id.lemon_tea);
        Boolean lemonTeaChecked = lemonTea.isChecked();

        int price = calculatePrice(jusManggaChecked, jusAlpukatChecked, airMineralChecked, fantaChecked, chocolateMilkshakeChecked,
                lemonTeaChecked);
        String finalMessage = createFinalMessage(names, jusManggaChecked, jusAlpukatChecked, airMineralChecked,
                fantaChecked, chocolateMilkshakeChecked, lemonTeaChecked, price);
        displayMessage(finalMessage);
    }

    private String createFinalMessage(String names, Boolean jusManggaChecked, Boolean jusAlpukatChecked,
                                      Boolean airMineralChecked, Boolean fantaChecked, Boolean chocolateMilkshakeChecked,
                                      Boolean lemonTeaChecked, int price) {
        String Message = "Name: "+names+"\n" + "Total price Rp. "+price;
        return Message;
    }

    private void displayMessage(String finalMessage) {
        TextView Message = (TextView) findViewById(R.id.Total_Expense);
        Message.setText(""+finalMessage);
    }

    private int calculatePrice(Boolean mangga, Boolean alpukat, Boolean mineral, Boolean fanta, Boolean milkshake, Boolean lemontea) {
        int price = 0;
        if(mangga){
            price = price + 15000;
        }if(alpukat){
            price = price + 15000;
        }if(mineral){
            price = price + 5000;
        }if(fanta){
            price = price + 7000;
        }if(milkshake){
            price = price + 15000;
        }if(lemontea){
            price = price + 7000;
        }
        return quantity*price;
    }

    public void mangga(View view) {
    }

    public void alpukat(View view) {
    }

    public void air_mineral(View view) {
    }

    public void fanta(View view) {
    }

    public void milkshake(View view) {
    }

    public void lemon_tea(View view) {
    }


}


