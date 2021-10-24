package org.aplas.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_register , btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = (Button) findViewById(R.id.btn_register);
        btn_signin = (Button) findViewById(R.id.btn_signin);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_register();
            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
    }

    public void openActivity_register() {
        Intent intent = new Intent(MainActivity.this,activity_register.class);
        startActivity(intent);
    }
    public void openHomeActivity() {
        Intent intent1 = new Intent(MainActivity.this,home.class);
        startActivity(intent1);
    }
}