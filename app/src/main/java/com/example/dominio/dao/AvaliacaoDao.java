package com.example.dominio.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dominio.entidade.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoDao
{

    protected SQLiteDatabase conexao;

    public AvaliacaoDao(SQLiteDatabase con)
    {
        this.conexao = con;
    }

    public void insert(Avaliacao a)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nota", a.nota);
        contentValues.put("avaliacao", a.avaliacao);
        contentValues.put("avaliador", a.avaliador);
        contentValues.put("avaliado", a.avaliado);

        conexao.insertOrThrow("AVALIACAO", null, contentValues);
    }

    public List<Avaliacao> listAll()
    {
        List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
        Cursor result = conexao.rawQuery("SELECT * FROM AVALIACAO", null);

        if(result.getCount() > 0)
        {
            result.moveToFirst();
            do
            {
                Avaliacao a = new Avaliacao();
                a.nota = result.getInt(result.getColumnIndexOrThrow("nota"));
                a.avaliacao = result.getString(result.getColumnIndexOrThrow("avaliacao"));
                a.avaliador = result.getString(result.getColumnIndexOrThrow("avaliador"));
                a.avaliado = result.getString(result.getColumnIndexOrThrow("avaliado"));

                avaliacoes.add(a);
            }
            while (result.moveToNext());
        }

        return avaliacoes;
    }
}
