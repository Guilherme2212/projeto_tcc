package com.example.android.imagebutton.datamodel;

import java.util.Date;

/**
 * Created by Guilherme Caetano on 27/07/2016.
 */
public class DataModel {

    private static final String DB_NAME = "db_carMaintenance";      // Nome do BD
    private static final String TABELA_CARRO = "carro";             // Nome da tabela
    private static final String TABELA_MANUTENCOES = "manutencoes"; // Nome da tabela
    private static final String TABELA_MEUS_CARROS = "meus_carros"; // Nome da tabela
    private static final Integer VERSION = 1;                       // Versão do BD
    // 7
    private static final String ID_CARRO = "_id";                   // Nome da coluna da tabela carro
    private static final String COD_CARRO = "cod_carro";            // Nome da coluna da tabela carro
    private static final String MARCA = "marca";                    // Nome da coluna da tabela carro
    private static final String MODELO_CARRO = "modelo_carro";      // Nome da coluna da tabela carro
    private static final String ANO_FABRICACAO = "ano";             // Nome da coluna da tabela carro
    private static final String MOTOR = "motor";                    // Nome da coluna da tabela carro
    private static final String TIPO_OLEO = "oleo";                 // Nome da coluna da tabela carro
    // 7
    private static final String ID_MANUTENCAO = "_id";              // Nome da coluna da tabela manutenções
    private static final String COD_MANUTENCAO = "cod_manutencao";  // Nome da coluna da tabela manutenções
    private static final String DATA_MANUTENCAO = "data_manutencao";// Nome da coluna da tabela manutenções
    private static final String KM_MANUTENCAO = "km_manutencao";    // Nome da coluna da tabela manutenções
    private static final String DATA_VALIDADE = "data_validade";    // Nome da coluna da tabela manutenções
    private static final String KM_VALIDADE = "km_validade";        // Nome da coluna da tabela manutenções
    private static final String VALOR_PAGO = "valor_pago";          // Nome da coluna da tabela manutenções
    // 2
    private static final String ID_MC = "_id";                      //Nome da coluna da tabela meus_carros
    private static final String COD_MY_CAR = "cod_my_car";          //Nome da coluna da tabela meus_carros
    //

    public static Integer getVERSION() {
        return VERSION;
    }

    public static String getDbName() {
        return DB_NAME;
    }

    public static String getTabelaCarro() {
        return TABELA_CARRO;
    }

    public static String getTabelaManutencoes() {
        return TABELA_MANUTENCOES;
    }

    public static String getTabelaMeusCarros() {
        return TABELA_MEUS_CARROS;
    }

    public static String getIdCarro() {
        return ID_CARRO;
    }

    public static String getCodCarro() {
        return COD_CARRO;
    }

    public static String getMARCA() {
        return MARCA;
    }

    public static String getModeloCarro() {
        return MODELO_CARRO;
    }

    public static String getAnoFabricacao() {
        return ANO_FABRICACAO;
    }

    public static String getMOTOR() {
        return MOTOR;
    }

    public static String getTipoOleo() {
        return TIPO_OLEO;
    }

    public static String getIdManutencao() {
        return ID_MANUTENCAO;
    }

    public static String getCodManutencao() {
        return COD_MANUTENCAO;
    }

    public static String getDataManutencao() {
        return DATA_MANUTENCAO;
    }

    public static String getKmManutencao() {
        return KM_MANUTENCAO;
    }

    public static String getDataValidade() {
        return DATA_VALIDADE;
    }

    public static String getKmValidade() {
        return KM_VALIDADE;
    }

    public static String getValorPago() {
        return VALOR_PAGO;
    }

    public static String getIdMc() {
        return ID_MC;
    }

    public static String getCodMyCar() {
        return COD_MY_CAR;
    }

    public static String criarTabelaCarro() {
        String query;
        query = "CREATE TABLE carro(\n" +
                "    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, \n" +
                "    cod_carro INTEGER NOT NULL UNIQUE, \n" +
                "    marca VARCHAR2(15) NOT NULL, \n" +
                "    modelo_carro VARCHAR2(15) NOT NULL, \n" +
                "    ano INTEGER NOT NULL, \n" +
                "    motor VARCHAR2(15) NOT NULL, \n" +
                "    oleo VARCHAR2(10) NOT NULL);\n ";
        return query;
    }

    public static String criarTabelaManutencoes() {
        String query;
        query = "CREATE TABLE manutencoes(\n" +
                "    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, \n" +
                "    cod_manutencao INTEGER NOT NULL UNIQUE, \n" +
                "    data_manutencao DATE, \n" +
                "    km_manutencao INTEGER, \n" +
                "    data_validade DATE, \n" +
                "    km_validade INTEGER\n" +
                "    valor_pago REAL); ";
        return query;
    }

    public static String criarTabelaMeusCarros() {
        String query;
        query = "CREATE TABLE meus_carros(\n" +
                "    _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, \n" +
                "    cod_my_car INTEGER NOT NULL, \n" +
                "    fk_cod_carro INTEGER NOT NULL UNIQUE REFERENCES carro(cod_carro) " +
                "    ON DELETE CASCADE ON UPDATE CASCADE); ";
        return query;
    }

/*    public static String insertInicial(){
        String query;
        query = ""
    }*/
}
