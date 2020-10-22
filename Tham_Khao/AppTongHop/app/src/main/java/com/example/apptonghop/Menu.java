package com.example.apptonghop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Ba Chỉ Dưa Giá","Cá Bông Lau Kho Tộ","Chá Cá Sốt Chua Ngọt","Rau Muống Xào Tỏi","Sườn Xào Nấm","Canh Mít Nấu Tôm"};
    String mDescription[] = {"69.000đ","49.000đ","59.000đ","29.000đ","69.000đ","59.000đ"};
    int images[] = {R.drawable.bachi, R.drawable.ca, R.drawable.chaca, R.drawable.muong, R.drawable.nam,R.drawable.canhmit};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){
                    Toast.makeText( Menu.this, "Ba Chỉ Dưa Giá", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( Menu.this, "Cá Bông Lau Kho Tộ", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( Menu.this, "Chá Cá Sốt Chua Ngọt", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( Menu.this, "Rau Muống Xào Tỏi", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( Menu.this, "Sườn Xào Nấm", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( Menu.this, "Canh Mít Nấu Tôm", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter(Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convretView, @Nullable ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View  row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;


        }

    }
}