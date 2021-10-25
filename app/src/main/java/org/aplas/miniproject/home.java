package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button btn_pesan , btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_pesan = (Button) findViewById(R.id.btn_pesan);
        btn_logout = (Button) findViewById(R.id.btn_logout);
        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTicket();
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });

    }

    public void openTicket() {
        Intent intent = new Intent(this,pilihkursi.class);
        startActivity(intent);
    }
    public void logout() {
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);
    }
}