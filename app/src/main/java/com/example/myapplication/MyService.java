package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Bundle bundle = intent.getExtras();

        Toast.makeText(MyService.this,"Thêm sinh viên thành công.\n Thông tin sinh viên: \n Sinh viên: " + bundle.getInt("ID") + " - " + bundle.getString("NAME") + "\n" + "Lớp: " + bundle.getString("CLASS"), Toast.LENGTH_SHORT).show();
        
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyService.this, "Da duoc khoi tao", Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "Ham onStartCommand duoc goi", Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Da duoc huy", Toast.LENGTH_SHORT).show();
    }
}
