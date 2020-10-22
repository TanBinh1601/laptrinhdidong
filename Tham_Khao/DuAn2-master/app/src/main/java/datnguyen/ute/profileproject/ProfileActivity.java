package datnguyen.ute.profileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        button = findViewById(R.id.btnUpdate);

        Intent intent = new Intent(this,DashboardActivity.class);
        startActivity(intent);
    }
}