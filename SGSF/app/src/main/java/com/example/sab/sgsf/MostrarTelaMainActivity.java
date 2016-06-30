package com.example.sab.sgsf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarTelaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_tela_main);

        ImageView imagem = (ImageView) findViewById(R.id.LogoEmpresa);
        TextView nome = (TextView) findViewById(R.id.NomeEmpresa);

    }
}
