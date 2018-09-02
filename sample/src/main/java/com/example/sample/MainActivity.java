package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gallerylibrary.Slib;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<images> arrayList = new ArrayList<>();
        arrayList.add(new images("https://randomuser.me/api/portraits/men/57.jpg"));
        arrayList.add(new images("https://randomuser.me/api/portraits/men/58.jpg"));
//        arrayList.add("https://randomuser.me/api/portraits/men/59.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/54.jpg");
//        arrayList.add("https://randomuser.me/api/portraits/men/53.jpg");
        arrayList.add(new images("https://randomuser.me/api/portraits/men/57.jpg"));
        arrayList.add(new images("https://randomuser.me/api/portraits/men/57.jpg"));
        Slib b = new Slib();
        b.imagesArrayList(arrayList);
    }
}
