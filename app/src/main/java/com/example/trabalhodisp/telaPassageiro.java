package com.example.trabalhodisp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class telaPassageiro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_passageiro);
    }

    public void irTelaLogin(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

        public void irTelaAmigos(View view){
            Intent intent = new Intent(this, telaAmigos.class);
            startActivity(intent);
        }

}
