package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_register extends AppCompatActivity {
private Button btn_back , btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMain();
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                openHome();
            }
        });

    }

    public void openMain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent1 = new Intent(this,home.class);
        startActivity(intent1);
    }

}