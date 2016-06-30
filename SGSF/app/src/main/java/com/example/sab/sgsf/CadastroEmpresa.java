package com.example.sab.sgsf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroEmpresa extends AppCompatActivity {

    EditText nomecompletoprestador,numeracaoprestador,telefoneprestador,emailprestador,senhaprestador;
    Button okprestador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_empresa);
        nomecompletoprestador = (EditText) findViewById(R.id.nomeCompletoPrestadorEditText);
        numeracaoprestador = (EditText)findViewById(R.id.numeracaoEmpresaEditText);
        telefoneprestador = (EditText)findViewById(R.id.TelefoneEmpresaEditText);
        emailprestador = (EditText)findViewById(R.id.EmailEmpresaEditText);
        senhaprestador = (EditText)findViewById(R.id.SenhaEmpresaEditText);
        okprestador = (Button) findViewById(R.id.ConfirmarClienteButton);
        okprestador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscarservicos = new Intent(CadastroEmpresa.this,Busca_Servicos.class);
                startActivity(buscarservicos);
            }
        });
    }
}
