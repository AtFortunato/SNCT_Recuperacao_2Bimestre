package com.example.ifpb.snct_rec2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IFPB on 24/11/2015.
 */
public class BuscaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);

    }

    public void onClickPesquisar(View v){
        EditText edtText = (EditText) findViewById(R.id.edBusca);
        BancoDeDados SNCT = new BancoDeDados(this);

        List<Formulario> formulario = SNCT.avaliacoes(edtText.getText().toString());
        edtText = (EditText) findViewById(R.id.edBusca);
        for (Iterator iterator = formulario.iterator(); iterator.hasNext();)
        {
            Formulario formulario1 = (Formulario) iterator.next();

            Log.i("meuformulario", formulario.toString());
        }



    }
}
