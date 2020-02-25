package com.example.yvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registration_1 extends AppCompatActivity implements View.OnClickListener {

    private Button reg_socseti;
    private Button reg_email;
    private Button reg_telefon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_1);

        reg_socseti = (Button) findViewById(R.id.reg_socseti);
        reg_socseti.setOnClickListener(this);

        reg_email = (Button) findViewById(R.id.reg_email);
        reg_email.setOnClickListener(this);

        reg_telefon = (Button) findViewById(R.id.reg_telefon);
        reg_telefon.setOnClickListener(this);

        TextView voiti = (TextView)findViewById(R.id.reg1);
        voiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.reg_socseti:
                Intent intent = new Intent(this, com.example.yvision.RegSocseti.class);
                startActivity(intent);
                break;

            case R.id.reg_email:
                Intent intent1 = new Intent(this, com.example.yvision.RegEmail.class);
                startActivity(intent1);
                break;
            case R.id.reg_telefon:
                Intent intent2 = new Intent(this, com.example.yvision.RegTelefon.class);
                startActivity(intent2);
                break;
        }
    }
}
