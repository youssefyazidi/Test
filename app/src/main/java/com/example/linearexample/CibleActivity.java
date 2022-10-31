package com.example.linearexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CibleActivity extends AppCompatActivity {

    TextView txtCible;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cible);

        txtCible = findViewById(R.id.txtCible);
        btn = findViewById(R.id.button);
        Intent intent = getIntent();

       txtCible.setText(intent.getStringExtra("cle"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}