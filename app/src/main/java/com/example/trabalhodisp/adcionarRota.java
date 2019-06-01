package com.example.trabalhodisp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.trabalhodisp.R.id.txtRota1;
import static com.example.trabalhodisp.R.id.txtRota2;
import static com.example.trabalhodisp.R.id.txtRota3;
import static com.example.trabalhodisp.R.id.txtRota4;
import static com.example.trabalhodisp.R.id.txtRota5;
import static com.example.trabalhodisp.R.id.txtRota6;
import static com.example.trabalhodisp.R.id.txtRota7;
import static com.example.trabalhodisp.R.id.txtRota8;

public class adcionarRota extends AppCompatActivity {
    private int numeroTxtBox;
    private ArrayList<View> listaRotas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adionar_rota);
        numeroTxtBox = 1;
        listaRotas.add(0,findViewById(txtRota1));
        listaRotas.add(1,findViewById(txtRota2));
        listaRotas.add(2,findViewById(txtRota3));
        listaRotas.add(3,findViewById(txtRota4));
        listaRotas.add(4,findViewById(txtRota5));
        listaRotas.add(5,findViewById(txtRota6));
        listaRotas.add(6,findViewById(txtRota7));
        listaRotas.add(7,findViewById(txtRota8));
    }
    public void tornarVisible(View view){
        TextView textbox = (TextView) listaRotas.get(numeroTxtBox);
        textbox.setVisibility(View.VISIBLE);
        numeroTxtBox ++;
    }
}
