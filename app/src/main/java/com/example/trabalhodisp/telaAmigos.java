package com.example.trabalhodisp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telaAmigos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_amigos);
    }

    public void irTelaAvaliacao(View view){
        Intent intent = new Intent(this, telaAvaliacao.class);
        startActivity(intent);
    }
}
