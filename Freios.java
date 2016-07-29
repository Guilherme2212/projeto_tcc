package com.example.android.imagebutton;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.imagebutton.dao.FreioDAO;
import com.example.android.imagebutton.model.FreiosModel;

/**
 * Created by U6031409 on 01/07/2016.
 */
public class Freios extends AppCompatActivity implements View.OnClickListener {
    EditText data_validade;
    EditText validade_km;
    EditText km_troca;
    EditText data_troca;
    EditText et_valor_pago;
    Integer cod_manutencao = 1;
    Button btn_salvarFreio;
    FreiosModel freiosModel;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.freios);

        data_validade = (EditText) findViewById(R.id.ed_dataValidade);
        validade_km = (EditText) findViewById(R.id.ed_km_validade);
        km_troca = (EditText) findViewById(R.id.ed_km_troca);
        data_troca = (EditText) findViewById(R.id.ed_DataTroca);
        et_valor_pago = (EditText) findViewById(R.id.ed_valor_pago);

        btn_salvarFreio = (Button) findViewById(R.id.btn_salvarFreio);
        btn_salvarFreio.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        freiosModel = new FreiosModel();
        // Verifica se o campo et_valor_pago é vazio. Caso seja, seta o valor para 0.0
        // Se não for vazio, utiliza a informação digitada pelo usuário
        if (TextUtils.isEmpty(et_valor_pago.getText().toString())) {
            freiosModel.setVALOR_PAGO(0.0);
        } else {
            freiosModel.setVALOR_PAGO(Double.valueOf(et_valor_pago.getText().toString()));
        }

        // Validar se a data e km de validade não são menores que as datas e km atuais.
        // Envia as informações para serem salvas no banco
        freiosModel.setCOD_MANUTENCAO(cod_manutencao);
        freiosModel.setDATA_VALIDADE(data_validade.getText().toString());
        freiosModel.setKM_VALIDADE(validade_km.getText().toString());
        freiosModel.setDATA_MANUTENCAO(data_troca.getText().toString());
        freiosModel.setKM_MANUTENCAO(km_troca.getText().toString());

        FreioDAO freioDAO = new FreioDAO(getApplicationContext());
        // Se o método adicionar retornar verdadeiro é porque ocorreu tudo certo na gravação das infos.
        if (freioDAO.adicionar(freiosModel)) {
            Toast.makeText(getApplication(), "Dados salvos com sucesso!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplication(), "Erro ao salvar as informações!", Toast.LENGTH_LONG).show();
        }
    }
}
