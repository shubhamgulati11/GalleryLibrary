package com.example.gallerylibrary;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Slib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);

    }
    public void imagesArrayList(ArrayList<images> im){
        Intent i = new Intent(Slib.this,Grid.class);
        i.putParcelableArrayListExtra("key",im);
        getBaseContext().startActivity(i);
    }
}
