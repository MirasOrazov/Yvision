package com.example.yvision;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.yvision.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button view_socseti;
    private Button email_login;
    private Button telefon_voiti;
    private Button reg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_socseti = (Button) findViewById(R.id.view_socseti);
        view_socseti.setOnClickListener(this);
        email_login = (Button) findViewById(R.id.view_email_login);
        email_login.setOnClickListener(this);
        telefon_voiti = (Button) findViewById(R.id.view_telefon);
        telefon_voiti.setOnClickListener(this);

        TextView reg1 = (TextView)findViewById(R.id.reg1);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Registration_1.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.view_socseti:
                Intent intent = new Intent(this, com.example.yvision.VhodSocseti.class);
                startActivity(intent);
                break;
            case R.id.view_email_login:
                Intent intent1 = new Intent(this, com.example.yvision.Email_login_voiti.class);
                startActivity(intent1);
                break;
            case R.id.view_telefon:
                Intent intent2 = new Intent(this, com.example.yvision.Telefon_voiti.class);
                startActivity(intent2);
                break;

            default: break;
        }
    }
}
