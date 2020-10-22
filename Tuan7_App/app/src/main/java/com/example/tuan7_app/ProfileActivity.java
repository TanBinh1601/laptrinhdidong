package com.example.tuan7_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        Button bt3 = (Button) findViewById(R.id.bnt_logout);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(view);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nv);

        bottomNavigationView.setSelectedItemId(R.id.about);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.das:
                        startActivity(new Intent(getApplicationContext(), DashBoardActivity.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.home_ac:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.about:
                        return;
                }
            }
        });

    }
    void open(View v){
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }
}
