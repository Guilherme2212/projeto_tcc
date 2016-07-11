package com.example.android.imagebutton;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.id_tv_cadastro:
                //startActivity(new Intent(this,.class));
                break;
            case R.id.id_tv_manutencoes:
                startActivity(new Intent(this, ManutencoesList.class));
                break;
            case R.id.id_tv_dicas:
                //startActivity(new Intent(this,ViagemListActivity.class));
                break;
            case R.id.id_tv_telefones:
                //startActivity(new Intent(this,ConfiguracoesActivity.class));
                break;
        }

    }
}
