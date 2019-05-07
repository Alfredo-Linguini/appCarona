package com.example.trabalhodisp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class telaMotorista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_motorista);


         Button btnSairMotorista = (Button) findViewById(R.id.btnSairMot);
        btnSairMotorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                finish();
            }
        });

    }
    public void irTelaAmigos(View view){
        Intent intent = new Intent(this, telaAmigos.class);
        startActivity(intent);
    }
}
