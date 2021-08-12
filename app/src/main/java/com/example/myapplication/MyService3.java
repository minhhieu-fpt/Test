package com.example.myapplication;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService3 extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    int count = 0;
    public MyService3() {
        super("MyService3");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Bundle bundle = intent.getExtras();
        String[] chuoi = bundle.getString("chuoi").split("");

        for (int i = 0; i < chuoi.length; i++) {
            if(chuoi[i].equalsIgnoreCase("a")){
                count++;
            }
        }
        stopSelf();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService3.this, "Số kí tự A là: " + count, Toast.LENGTH_SHORT).show();
    }
}
