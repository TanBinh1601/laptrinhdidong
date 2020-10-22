package com.example.tuan7_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        lv = (ListView) findViewById(R.id.listview);
        arr_bean = new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.avta_2,"Trà My","Hôm nay cậu ổn không?"));
        arr_bean.add(new ListViewBean(R.drawable.avta_3,"Bình Minh","Đang làm gì đó friend...?"));
        arr_bean.add(new ListViewBean(R.drawable.avta_4,"Donald Trump","Hello you!"));
        arr_bean.add(new ListViewBean(R.drawable.avta_5,"Duy Mai","ok ☺"));
        arr_bean.add(new ListViewBean(R.drawable.avta_6,"Hope","Các bạn hiện đã được kết nối..."));
        arr_bean.add(new ListViewBean(R.drawable.avta_nam,"Văn Tài","Các bạn hiện đã được kết nối..."));
        adapter = new ListViewBaseAdapter(arr_bean, this) {
            @Override
            public long getItemId(int i) {
                return 0;
            }
        };
        lv.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nv);

        bottomNavigationView.setSelectedItemId(R.id.home_ac);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.das:
                        startActivity(new Intent(getApplicationContext(), DashBoardActivity.class));
                        overridePendingTransition(0,0);
                        return;
                    case R.id.home_ac:
                        return;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });
    }
}
