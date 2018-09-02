package com.example.gallerylibrary;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class Sgallery {
    public static void S(Context cxt , ArrayList<String> arrayList,int col){
        Intent i = new Intent(cxt,Grid.class);
        i.putExtra("key",arrayList);
        i.putExtra("col",col);
        cxt.startActivity(i);
    }
}
