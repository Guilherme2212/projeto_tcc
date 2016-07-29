package com.example.android.imagebutton.model;

import java.util.Date;

/**
 * Created by Guilherme Caetano on 27/07/2016.
 */
public class FreiosModel {

    private String  ID_MANUTENCAO;
    private Integer COD_MANUTENCAO;
    private String  DATA_MANUTENCAO;
    private String  KM_MANUTENCAO;
    private String  DATA_VALIDADE;
    private Double  VALOR_PAGO;

    public String getKM_VALIDADE() {
        return KM_VALIDADE;
    }

    public void setKM_VALIDADE(String KM_VALIDADE) {
        this.KM_VALIDADE = KM_VALIDADE;
    }

    public String getID_MANUTENCAO() {
        return ID_MANUTENCAO;
    }

    public void setID_MANUTENCAO(String ID_MANUTENCAO) {
        this.ID_MANUTENCAO = ID_MANUTENCAO;
    }

    public Integer getCOD_MANUTENCAO() {
        return COD_MANUTENCAO;
    }

    public void setCOD_MANUTENCAO(Integer COD_MANUTENCAO) {
        this.COD_MANUTENCAO = COD_MANUTENCAO;
    }

    public String getDATA_MANUTENCAO() {
        return DATA_MANUTENCAO;
    }

    public void setDATA_MANUTENCAO(String DATA_MANUTENCAO) {
        this.DATA_MANUTENCAO = DATA_MANUTENCAO;
    }

    public String getKM_MANUTENCAO() {
        return KM_MANUTENCAO;
    }

    public void setKM_MANUTENCAO(String KM_MANUTENCAO) {
        this.KM_MANUTENCAO = KM_MANUTENCAO;
    }

    public String getDATA_VALIDADE() {
        return DATA_VALIDADE;
    }

    public void setDATA_VALIDADE(String DATA_VALIDADE) {
        this.DATA_VALIDADE = DATA_VALIDADE;
    }

    private String KM_VALIDADE;

    public Double getVALOR_PAGO() {
        return VALOR_PAGO;
    }

    public void setVALOR_PAGO(Double VALOR_PAGO) {
        this.VALOR_PAGO = VALOR_PAGO;
    }
}
