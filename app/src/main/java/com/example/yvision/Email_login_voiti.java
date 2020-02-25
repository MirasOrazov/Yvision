package com.example.yvision;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Email_login_voiti extends AppCompatActivity {

    private TextView zabylparol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_login_voiti);

        TextView reg1 = (TextView)findViewById(R.id.reg1);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Registration_1.class);
                startActivity(intent);
            }
        });

        TextView zabylparol = (TextView)findViewById(R.id.zabylParol);
        zabylparol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Vosst_parol_email.class);
                startActivity(intent);
            }
        });
    }


}
//textView.setOnClickListener(new View.OnClickListener());