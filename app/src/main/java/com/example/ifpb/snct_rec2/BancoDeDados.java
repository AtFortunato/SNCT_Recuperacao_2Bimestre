package com.example.ifpb.snct_rec2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IFPB on 26/11/2015.
 */
public class BancoDeDados extends SQLiteOpenHelper {

    private static final String NOME_BD = "SNCT";
    private static final int VERSAO_BD = 1;

    public BancoDeDados(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase SNCT) {

        String insersao = "CREATE TABLE TB_AVALIACAO" +
                          "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                          "nome_avaliador TEXT," +
                          "titulo_trabalho TEXT," +
                          "nota INTEGER," +
                          "comentario TEXT" +
                          ")";
        SNCT.execSQL(insersao);
    }

    @Override
    public void onUpgrade(SQLiteDatabase SNCT, int oldVersion, int newVersion) {
        String insersao = "DROP TABLE TB_ABALIACAO";
        SNCT.execSQL(insersao);
        onCreate(SNCT);
      }

    public void insert(Formulario formulario){

        SQLiteDatabase SNCT = getWritableDatabase();
        ContentValues valores = new ContentValues();

        valores.put("nome_avaliador",formulario.getNome_avaliador());
        valores.put("titulo_trabalho",formulario.getTitulo_trabalho());
        valores.put("nota",formulario.getNota());
        valores.put("comentario",formulario.getComentario());

        SNCT.insert("TB_AVALIACAO",null,valores);

        SNCT.close();
    }

    public List<Formulario> avaliacoes (String titulo){
        List<Formulario> listavaliacoes = new ArrayList<Formulario>();
        SQLiteDatabase SNCT = getReadableDatabase();

        String busca = "SELECT * FROM TB_AVALIACAO WHERE titulo_trabalho = \""+titulo+"\"";
        Cursor cursor = SNCT.rawQuery(busca,null);

        if (cursor.moveToFirst()){
           do {

               Formulario formulario = new Formulario();
               formulario.setId(cursor.getInt(0));
               formulario.setNome_avaliador(cursor.getString(1));
               formulario.setTitulo_trabalho(cursor.getString(2));
               formulario.setNota(cursor.getInt(3));
               formulario.setComentario(cursor.getString(4));

               listavaliacoes.add(formulario);

           }while (cursor.moveToNext());

        }

        SNCT.close();
        return listavaliacoes;
    }
}
