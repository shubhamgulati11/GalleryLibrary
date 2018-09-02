package com.example.gallerylibrary;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class Sgallery {
    public static void s(Context cxt , ArrayList<String> arrayList){
        Intent i = new Intent(cxt,Grid.class);
        i.putExtra("key",arrayList);
        cxt.startActivity(i);
    }
}
