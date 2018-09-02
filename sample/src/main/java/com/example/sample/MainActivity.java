package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gallerylibrary.Sgallery;
import com.example.gallerylibrary.Slib;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://randomuser.me/api/portraits/men/59.jpg");
        arrayList.add("https://randomuser.me/api/portraits/men/54.jpg");
        arrayList.add("https://randomuser.me/api/portraits/men/53.jpg");
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sgallery.s(MainActivity.this,arrayList);

            }
        });
//
    }
}
