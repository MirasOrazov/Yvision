package com.example.yvision;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Vosst_parol_email extends AppCompatActivity implements View.OnClickListener{

    private Button send;
    private EditText pochta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vosst_parol_email);

        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(this);

        pochta = (EditText) findViewById(R.id.editEmail3);
        pochta.getText();
}

    @Override
    public void onClick(View d)
    {
        switch (d.getId()){
            case R.id.send:
                Intent intent = new Intent(this, com.example.yvision.Vosst_parol_email_2.class);
                if(pochta.getText().length()!=0)
                startActivity(intent);
                else break;
                break;
            }

        }


    }

