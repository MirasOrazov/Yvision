package com.example.yvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegTelefon extends AppCompatActivity implements View.OnClickListener {

    private Button acc_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_telefon);

        TextView voiti = (TextView) findViewById(R.id.reg1);
        voiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        acc_create = (Button) findViewById(R.id.acc_create);
        acc_create.setOnClickListener(this);
    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.acc_create:
                Intent intent = new Intent(this, com.example.yvision.RegTelefon2.class);
                startActivity(intent);
                break;
        }
    }
}
