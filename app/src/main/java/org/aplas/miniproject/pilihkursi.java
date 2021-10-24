package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pilihkursi extends AppCompatActivity {
private Button btn_next1 , btn_back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihkursi);

        btn_back1 = (Button) findViewById(R.id.btn_back1);
        btn_next1 = (Button) findViewById(R.id.btn_next1);

        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTicket();
            }
        });

        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoHome();
            }
        });
    }
    public void backtoHome(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
    public void openTicket(){
        Intent intent1 = new Intent(this,ticket.class);
        startActivity(intent1);
    }
}