package com.example.sab.sgsf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro_cliente extends AppCompatActivity {
    EditText clientenome,clienteendereco,clienteemail,clientesenha;
    Button confirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente);
        clientenome = (EditText) findViewById(R.id.CadastroClientenomeEditText);
        clienteendereco = (EditText) findViewById(R.id.CadastroClienteTelefoneEditText);
        clienteemail = (EditText)findViewById(R.id.CadastroClienteemailEditText);
        clientesenha = (EditText)findViewById(R.id.CadastroClienteSenhaEditText);
        confirmacao = (Button)findViewById(R.id.okCadastroClienteButton);
        confirmacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cliente = new Intent(Cadastro_cliente.this,Busca_Servicos.class);
                startActivity(cliente);


            }
        });

    }
}
