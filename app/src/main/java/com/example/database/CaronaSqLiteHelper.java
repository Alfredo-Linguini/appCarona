package com.example.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CaronaSqLiteHelper extends SQLiteOpenHelper {

    public CaronaSqLiteHelper(Context context) {
        super(context, "Carona", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(ScriptDLL.getTipoScript());
        db.execSQL(ScriptDLL.getUsuarioScript());
        db.execSQL(ScriptDLL.getAvaliacaoScript());
        db.execSQL(ScriptDLL.getTiposInsert());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
