package com.example.amst9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class menup extends AppCompatActivity {

    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menup);

        tv1=(TextView)findViewById(R.id.tv1);
        String dato= getIntent().getStringExtra("dato");
        tv1.setText("Bienvenido, "+ dato);

    }
}