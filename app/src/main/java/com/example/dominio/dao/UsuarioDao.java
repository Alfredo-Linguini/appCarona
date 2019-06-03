package com.example.dominio.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dominio.entidade.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao
{

    protected SQLiteDatabase conexao;

    public UsuarioDao(SQLiteDatabase con)
    {
        this.conexao = con;
    }

    public void insert(Usuario u)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("NOME", u.nome);
        contentValues.put("TELEFONE", u.telefone);
        contentValues.put("CURSO", u.curso);
        contentValues.put("FACULDADE", u.faculdade);
        contentValues.put("EMAIL", u.email);
        contentValues.put("SENHA", u.senha);

        conexao.insertOrThrow("USUARIO", null, contentValues);
    }

    public void update(Usuario u)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("NOME", u.nome);
        contentValues.put("TELEFONE", u.telefone);
        contentValues.put("CURSO", u.curso);
        contentValues.put("FACULDADE", u.faculdade);
        contentValues.put("EMAIL", u.email);
        contentValues.put("SENHA", u.senha);

        String[] parametros = new String[1];
        parametros[0] = u.email;
        conexao.update("USUARIO", contentValues, "EMAIL = ?", parametros);
    }

    public List<Usuario> listAll()
    {
        List<Usuario> users = new ArrayList<Usuario>();
        Cursor result = conexao.rawQuery("SELECT * FROM USUARIO", null);

        if(result.getCount() > 0)
        {
            result.moveToFirst();
            do
            {
                Usuario u = new Usuario();
                u.email = result.getString(result.getColumnIndexOrThrow("EMAIL"));
                u.telefone = result.getString(result.getColumnIndexOrThrow("telefone"));
                u.curso = result.getString(result.getColumnIndexOrThrow("curso"));
                u.faculdade = result.getString(result.getColumnIndexOrThrow("faculdade"));
                u.senha = result.getString(result.getColumnIndexOrThrow("senha"));
                u.nome = result.getString(result.getColumnIndexOrThrow("NOME"));

                users.add(u);
            }
            while (result.moveToNext());
        }

        return users;
    }

    public Usuario findOne(String code) {
        String[] parametros = new String[1];
        parametros[0] = code;

        Usuario u = new Usuario();
        Cursor result = conexao.rawQuery("SELECT * FROM USUARIO WHERE EMAIL = ?", parametros);
        if(result.getCount() > 0)
        {
            result.moveToFirst();

            u.email = result.getString(result.getColumnIndexOrThrow("EMAIL"));
            u.telefone = result.getString(result.getColumnIndexOrThrow("telefone"));
            u.curso = result.getString(result.getColumnIndexOrThrow("curso"));
            u.faculdade = result.getString(result.getColumnIndexOrThrow("faculdade"));
            u.senha = result.getString(result.getColumnIndexOrThrow("senha"));
            u.nome = result.getString(result.getColumnIndexOrThrow("NOME"));
        }

        return u;
    }
}
