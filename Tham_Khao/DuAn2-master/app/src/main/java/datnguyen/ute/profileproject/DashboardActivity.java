package datnguyen.ute.profileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {
    TextView textView;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        textView = (TextView) findViewById(R.id.logout);
        Intent intent;
        intent = new Intent(this, DashboardActivity2.class);
        startActivity(intent);
       // logout();
        initView();
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.vp_demo);
        viewPager.setAdapter(new AdapterTabItem(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

    }

    public void logout(View view) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}