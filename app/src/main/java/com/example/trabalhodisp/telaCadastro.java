package com.example.trabalhodisp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class telaCadastro extends AppCompatActivity {

    protected Button button;
    String texto = "Cadastrado com sucesso, verifique seu e-mail!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        button = (Button)findViewById(R.id.btnConfirmar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
            }
        });
    }}
