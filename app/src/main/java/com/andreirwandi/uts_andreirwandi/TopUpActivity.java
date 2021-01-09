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

public class TopUpActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);
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

    public void TopUpNowButton(View view) {
        EditText name = (EditText) findViewById(R.id.Enter_your_name);
        String names = name.getText().toString();

        CheckBox sepuluh_ribu = (CheckBox) findViewById(R.id.sepuluh_rb);
        Boolean sepuluhRbChecked = sepuluh_ribu.isChecked();

        CheckBox duapuluh_rb = (CheckBox) findViewById(R.id.duapuluh_rb);
        Boolean duapuluhRbChecked = duapuluh_rb.isChecked();

        CheckBox duapuluhlima_rb = (CheckBox) findViewById(R.id.duapuluhlima_rb);
        Boolean duapuluhlimaRbChecked = duapuluhlima_rb.isChecked();

        CheckBox limapuluh_rb = (CheckBox) findViewById(R.id.limapuluh_rb);
        Boolean limapuluhRbChecked = limapuluh_rb.isChecked();

        CheckBox tujuhpuluhlima_rb = (CheckBox) findViewById(R.id.tujuhpuluhlima_rb);
        Boolean tujuhpuluhlimaRbChecked =  tujuhpuluhlima_rb.isChecked();

        CheckBox seratus_rb = (CheckBox) findViewById(R.id.seratus_rb);
        Boolean seratusRbChecked = seratus_rb.isChecked();

        int balance = calculateBalance(sepuluhRbChecked, duapuluhRbChecked, duapuluhlimaRbChecked, limapuluhRbChecked,
                tujuhpuluhlimaRbChecked, seratusRbChecked);
        String finalMessage = createFinalMessage(names, sepuluhRbChecked, duapuluhRbChecked, duapuluhlimaRbChecked,
                limapuluhRbChecked, tujuhpuluhlimaRbChecked, seratusRbChecked, balance);
        displayMessage(finalMessage);
    }

    private String createFinalMessage(String names, Boolean sepuluhRbChecked, Boolean duapuluhRbChecked,
                                      Boolean duapuluhlimaRbChecked, Boolean limapuluhRbChecked, Boolean tujuhpuluhlimaRbChecked,
                                      Boolean seratusRbChecked, int balance) {
        String Message = "Name: "+names+"\n" + "Total Balance Rp. "+balance;
        return Message;
    }

    private void displayMessage(String finalMessage) {
        TextView Message = (TextView) findViewById(R.id.Total_Expense);
        Message.setText(""+finalMessage);
    }

    private int calculateBalance(Boolean sepuluh, Boolean duapuluh, Boolean duapuluhlima, Boolean limapuluh,
                               Boolean tujuhpuluhlima, Boolean seratus) {
        int balance = 0;
        if(sepuluh){
            balance = balance + 10000;
        }if(duapuluh){
            balance = balance + 20000;
        }if(duapuluhlima){
            balance = balance + 25000;
        }if(limapuluh){
            balance = balance + 50000;
        }if(tujuhpuluhlima){
            balance = balance + 75000;
        }if(seratus){
            balance = balance + 100000;
        }
        return quantity*balance;
    }

    public void sepuluh(View view) {
    }

    public void duapuluh(View view) {
    }

    public void duapuluhlima(View view) {
    }

    public void limapuluh(View view) {
    }

    public void tujuhpuluhlima(View view) {
    }

    public void seratus(View view) {
    }
}


