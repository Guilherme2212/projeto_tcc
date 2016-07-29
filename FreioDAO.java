package com.example.android.imagebutton.dao;

import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract;

import com.example.android.imagebutton.datamodel.DataModel;
import com.example.android.imagebutton.datasource.DataSource;
import com.example.android.imagebutton.model.FreiosModel;

/**
 * Created by Guilherme Caetano on 27/07/2016.
 */
public class FreioDAO {

    DataSource dataSource;
    ContentValues contentValues;

    /**
     * Nosso construtor será responsável em entregar um objeto de banco de dados, vindo da DataSource
     * de forma a permitir que todos os métodos do CRUD tenham disponíveis o acesso aos métodos do
     * SQLite para incluir, alterar, deletar ou listar os dados solicitados pela aplicação.
     */
    public FreioDAO(Context context) {
        dataSource = new DataSource(context);
    }

    /**
     * @param obj Este será o primeiro método do CRUD que será implementado. Estaremos enviando um
     *            objeto FreiosModel para ser adicionado ao banco de dados. O método adicionar, é do tipo booleano.
     * @return Caso o objeto seja adicionado com sucesso no Banco de Dados, retorna true, caso
     * contrário retorna falso para a VIEW que notificará o usuário.
     */
    public boolean adicionar(FreiosModel obj) {
        boolean retorno = false;
        //Acessa a classe ContentValues
        contentValues = new ContentValues();
        //Pega as colunas do banco de dados e o valor que deverá ser salvo nelas, respectivamente.
        contentValues.put(DataModel.getIdManutencao(), obj.getID_MANUTENCAO());
        contentValues.put(DataModel.getCodManutencao(), obj.getCOD_MANUTENCAO());
        contentValues.put(DataModel.getDataManutencao(), obj.getDATA_MANUTENCAO());
        contentValues.put(DataModel.getKmManutencao(), obj.getKM_MANUTENCAO());
        contentValues.put(DataModel.getDataValidade(), obj.getDATA_VALIDADE());
        contentValues.put(DataModel.getKmValidade(), obj.getKM_VALIDADE());
        contentValues.put(DataModel.getValorPago(), obj.getVALOR_PAGO());
        // tenta Executar o método persist(), passando como paramentro o contentValues e o nome da tabela.
        try{
            dataSource.persist(contentValues, DataModel.getTabelaManutencoes());
            retorno = true;
        }catch (Exception e ){

        }
        return retorno;
    }
}
