package com.example.tuan7_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.bnt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open1(view);
            }
        });

        Button bt2 = (Button) findViewById(R.id.bnt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2(view);
            }
        });
    }
    void open2(View v){
        Intent Intent = new Intent(this, Signup.class);
        startActivity(Intent);
    }
    void open1(View v){
        Intent Intent = new Intent(this, HomeActivity.class);
        startActivity(Intent);
    }
}
