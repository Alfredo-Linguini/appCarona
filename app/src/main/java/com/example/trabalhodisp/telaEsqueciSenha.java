package com.example.trabalhodisp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class telaEsqueciSenha extends AppCompatActivity {

    protected Button button;
    String texto = "E-mail enviado com sucesso!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_esqueci_senha);


    button = (Button)findViewById(R.id.btnEnviar);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
        }
    });
}}
