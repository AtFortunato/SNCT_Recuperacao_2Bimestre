package com.example.ifpb.snct_rec2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Created by IFPB on 23/11/2015.
 */
public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickAvaliar(View V){
        BancoDeDados SNCT = new BancoDeDados(this);
        Formulario formulario = new Formulario();

        EditText edtText = (EditText) findViewById(R.id.edAvaliador);
        EditText titulo = (EditText) findViewById(R.id.edTitulo);
        EditText nota = (EditText) findViewById(R.id.edNota);
        EditText comentario = (EditText) findViewById(R.id.edComentario);


        formulario.setNome_avaliador(edtText.getText().toString());
        edtText = (EditText) findViewById(R.id.edAvaliador);


        formulario.setTitulo_trabalho(edtText.getText().toString());
        titulo = (EditText) findViewById(R.id.edTitulo);


        formulario.setNota(new Integer(edtText.getText().toString()));
        nota = (EditText) findViewById(R.id.edNota);

        formulario.setComentario(edtText.getText().toString());
        comentario = (EditText) findViewById(R.id.edComentario);

        formulario.setId(0);

        SNCT.insert(formulario);

        startActivity(new Intent(this, MainActivity.class));
        finish();

    }

    public void onClickAvaliações(View V){
       startActivityForResult(new Intent(this, BuscaActivity.class),1);

    }
}
