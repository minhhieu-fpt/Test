package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai_3 extends AppCompatActivity {
    EditText inputtextt;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_3);

        inputtextt = findViewById(R.id.inputtext);
        search = findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(inputtextt.getText().toString().length() == 0){
                   Toast.makeText(Bai_3.this, "Nhập text",Toast.LENGTH_SHORT).show();
               } else {
                   Intent intent = new Intent(Bai_3.this, MyService3.class);
                   Bundle bundle = new Bundle();
                   bundle.putString("chuoi", inputtextt.getText().toString());
                   intent.putExtras(bundle);
                   startService(intent);
               }
            }
        });

    }
}