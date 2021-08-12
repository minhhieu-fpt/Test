package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai_1_2 extends AppCompatActivity {

    Button startt, stop;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_1_2);

        startt = findViewById(R.id.startService);
        stop = findViewById(R.id.stopService);
        intent = new Intent(Bai_1_2.this, MyService.class);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("ID", 1);
                bundle.putString("NAME", "Hiếu");
                bundle.putString("CLASS", "PT15354");
                intent.putExtras(bundle);
                startService(intent);

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }


}