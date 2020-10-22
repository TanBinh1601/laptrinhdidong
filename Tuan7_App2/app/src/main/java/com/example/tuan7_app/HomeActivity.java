package com.example.tuan7_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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
        arr_bean.add(new ListViewBean(R.drawable.ic_groups,"Nhóm"));
        arr_bean.add(new ListViewBean(R.drawable.nu,"Thu Hương"));
        arr_bean.add(new ListViewBean(R.drawable.nam,"Phúc"));
        arr_bean.add(new ListViewBean(R.drawable.nam,"0367432198"));
        arr_bean.add(new ListViewBean(R.drawable.nam,"Minh Thiện"));
        arr_bean.add(new ListViewBean(R.drawable.nu,"0905310304"));
        adapter = new ListViewBaseAdapter(arr_bean, this) {
            @Override
            public long getItemId(int i) {
                return 0;
            }
        };
        lv.setAdapter(adapter);


        ImageButton bt = (ImageButton) findViewById(R.id.btn_profile);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(view);
            }
        });
    }
    void open(View v){
        Intent Intent = new Intent(this, ProfileActivity.class);
        startActivity(Intent);
    }
}
