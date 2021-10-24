package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ticket extends AppCompatActivity {
    private Button btn_next2 , btn_back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        btn_next2 = (Button) findViewById(R.id.btn_next2);
        btn_back2 = (Button) findViewById(R.id.btn_back2);

        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPayment();
            }
        });

        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPage();
            }
        });
    }
    public void openPayment(){
        Intent intent = new Intent(this,payment.class);
        startActivity(intent);
    }
    public void backPage(){
        Intent intent1 = new Intent(this,pilihkursi.class);
        startActivity(intent1);
    }
}