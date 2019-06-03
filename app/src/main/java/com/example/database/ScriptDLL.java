package com.example.database;

public class ScriptDLL
{
    public static String getTipoScript()
    {
        return "CREATE TABLE IF NOT EXISTS TIPOS\n" +
                "(\n" +
                "    ID INT(3) PRIMARY KEY,\n" +
                "    DESCRICAO VARCHAR(30)\n" +
                ");";
    }

    public static String getUsuarioScript()
    {
        return "CREATE TABLE IF NOT EXISTS USUARIO\n" +
                "(\n" +
                "    NOME VARCHAR(50) NOT NULL,\n" +
                "    EMAIL VARCHAR(50) PRIMARY KEY UNIQUE,\n" +
                "    SENHA VARCHAR(16) NOT NULL,\n" +
                "    CELULAR VARCHAR(12),\n" +
                "    FACULDADE VARCHAR(40),\n" +
                "    CURSO VARCHAR(30),    \n" +
                ");";
    }

    public static String getAvaliacaoScript()
    {
        return "CREATE TABLE IF NOT EXISTS AVALIACAO\n" +
                "(\n" +
                "    NOTA INT(2) DEFAULT 0,\n" +
                "    AVALIACAO VARCHAR(200),\n" +
                "    AVALIADOR VARCHAR(30) NOT NULL,\n" +
                "    AVALIADO VARCHAR(30) NOT NULL,\n" +
                "    FOREIGN KEY (AVALIADOR) REFERENCES USUARIO(ID),\n" +
                "    FOREIGN KEY (AVALIADO) REFERENCES USUARIO(ID)\n" +
                ");";
    }

    public static String getTiposInsert()
    {
        return "\n" +
                "INSERT INTO TIPOS VALUES\n" +
                "(1, \"Motorista\"),\n" +
                "(2, \"Passageiro\");\n";
    }
}
