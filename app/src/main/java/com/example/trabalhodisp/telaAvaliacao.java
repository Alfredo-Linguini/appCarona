package com.example.trabalhodisp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class telaAvaliacao extends AppCompatActivity {

    protected Button button;
    String texto = "Avaliação enviada com sucesso!";



    public static ArrayList<View> listaBtEstrelas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_avaliacao);

        button = (Button)findViewById(R.id.btnEnviar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
            }
        });

        listaBtEstrelas.add(0,findViewById(R.id.btEstrela1));
        listaBtEstrelas.add(1,findViewById(R.id.btEstrela2));
        listaBtEstrelas.add(2,findViewById(R.id.btEstrela3));
        listaBtEstrelas.add(3,findViewById(R.id.btEstrela4));
        listaBtEstrelas.add(4,findViewById(R.id.btEstrela5));


    }
    public void classificar(View view){

        int numeroEstrelaClicada;
        numeroEstrelaClicada = listaBtEstrelas.indexOf(view);
        for(int i = 0; i < 5 ; i++){
            if(i <= numeroEstrelaClicada) {

                ImageButton btEstrela = (ImageButton) listaBtEstrelas.get(i);
                btEstrela.setBackgroundResource(R.drawable.estrela_dourada);
            }
            else {
                ImageButton btEstrela = (ImageButton) listaBtEstrelas.get(i);
                btEstrela.setBackgroundResource(R.drawable.estrela);
            }
        }
    }

    public void irTelaPrincipal(View view, String tela){

        Intent intent = new Intent(this, telaMotorista.class);
        startActivity(intent);
    }




}

