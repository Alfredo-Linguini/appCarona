package com.example.trabalhodisp;

import java.util.ArrayList;

public class Motorista extends Pessoa{
    public ArrayList<Comentario> comentarios;
    public ArrayList<String> rota;
    public Motorista(){
        comentarios = new ArrayList<>();
        rota = new ArrayList<>();
    }

}
