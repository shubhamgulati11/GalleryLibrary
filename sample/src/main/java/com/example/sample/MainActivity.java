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

        arrayList.add("https://picsum.photos/200/300/?image=1071");
        arrayList.add("https://picsum.photos/200/300/?image=1072");
        arrayList.add("http://www.deepdiveintel.com/wp-content/uploads/2013/09/Owl-Eye-art-300x300.jpg");
        arrayList.add("https://picsum.photos/200/300/?image=1073");
        arrayList.add("https://picsum.photos/200/300/?image=1074");
        arrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRK1cbsBe4SaSGW3p1pS5rg7mZPku42EJBHO2kI7lErdnWPXtHs");
        arrayList.add("https://picsum.photos/200/300/?image=1075");
        arrayList.add("https://picsum.photos/200/300/?image=1076");
        arrayList.add("https://picsum.photos/200/300/?image=1077");
        arrayList.add("https://picsum.photos/200/300/?image=1078");
        arrayList.add("https://picsum.photos/200/300/?image=1079");
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
