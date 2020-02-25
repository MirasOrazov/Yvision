package com.example.yvision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Telefon_voiti extends AppCompatActivity {

    private Button zabylParol2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telefon_voiti);

        TextView zabylparol2 = (TextView)findViewById(R.id.zabylParol2);
        zabylparol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Telefon_voiti_2.class);
                startActivity(intent);
            }
            });

        TextView reg1 = (TextView)findViewById(R.id.reg1);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Registration_1.class);
                startActivity(intent);
            }
        });
    }
}
