package com.example.sab.sgsf;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaInicial extends AppCompatActivity {

    EditText email, senha;//declaração das variaveis, tipo e localiza pelo id
    Button okConfirmarCadastro;
    TextView cadastro,pergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        pergunta = (TextView) findViewById(R.id.CadastroTextView);
        pergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder escolha = new AlertDialog.Builder(TelaInicial.this);
                escolha.setTitle("Escolhas");
                escolha.setMessage("Tipo de Cadastro ?");
                escolha.setNegativeButton("Cliente", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent cliente = new Intent(TelaInicial.this, Cadastro_cliente.class);
                        startActivity(cliente);
                    }

                });
                escolha.setPositiveButton("Prestador", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Intent prestador = new Intent(TelaInicial.this, CadastroEmpresa.class);
                                startActivity(prestador);
                            }

                        }
                );
                escolha.create();
                escolha.show();
                email = (EditText) findViewById(R.id.emailEditText);//declaração das variaveis, tipo e localiza pelo id

                senha = (EditText) findViewById(R.id.senhaEditText);//declaração das variaveis, tipo e localiza pelo id

                cadastro = (TextView) findViewById(R.id.CadastroTextView);//declaração das variaveis, tipo e localiza pelo id

                cadastro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(TelaInicial.this, Busca_Servicos.class);
                        startActivity(next);
                    }

                });

            }
        });
    }


}
