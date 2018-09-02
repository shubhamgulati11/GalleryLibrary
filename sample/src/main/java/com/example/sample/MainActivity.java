package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gallerylibrary.Sgallery;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("https://randomuser.me/api/portraits/men/32.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/23.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/52.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/19.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/45.jpg");
        arrayList.add("https://picsum.photos/200/300/?random");
        arrayList.add("https://picsum.photos/200/300/?random");
        arrayList.add("https://picsum.photos/200/300/?random");
        arrayList.add("https://picsum.photos/200/300/?random");
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sgallery.S(MainActivity.this,arrayList,3);

            }
        });
//
    }
}
