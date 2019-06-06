package com.example.trabalhodisp;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.database.CaronaSqLiteHelper;

public class telaCadastro extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private CaronaSqLiteHelper caronaSqLiteHelper;
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
    }

    public void criarConexao()
    {
        try
        {
            caronaSqLiteHelper = new CaronaSqLiteHelper(this);
            conexao = caronaSqLiteHelper.getWritableDatabase();
        }
        catch (SQLException ex)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Erro");
            builder.setMessage(ex.getMessage());
            builder.setNeutralButton("OK", null);
            builder.show();
        }
    }
}


