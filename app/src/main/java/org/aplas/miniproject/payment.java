package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class payment extends AppCompatActivity {
    private Button btn_pay , btn_back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btn_pay = (Button) findViewById(R.id.btn_pay);
        btn_back4 = (Button) findViewById(R.id.btn_back4);

        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensuccessPayment();
            }
        });

        btn_back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPage();
            }
        });
    }
    public void opensuccessPayment(){
        Intent intent = new Intent(this,successpay.class);
        startActivity(intent);
    }
    public void backPage(){
        Intent intent1 = new Intent(this,ticket.class);
        startActivity(intent1);
    }

}