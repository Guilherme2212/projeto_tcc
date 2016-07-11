package com.example.android.imagebutton;

import java.util.Date;

/**
 * Created by U6031409 on 22/06/2016.
 */
public class Manutencoes {

    private String manutencaoName;
    private String imageName;
    private String manutencaoDate;


    public Manutencoes(String manutencaoName, String imageName, String manutencaoDate) {
        this.manutencaoName = manutencaoName;
        this.imageName = imageName;
        this.manutencaoDate = manutencaoDate;
    }

    public String getManutencaoDate() {
        return manutencaoDate;
    }

    public void setManutencaoDate(String manutencaoDate) {
        this.manutencaoDate = manutencaoDate;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getManutencaoName() {
        return manutencaoName;
    }

    public void setManutencaoName(String manutencaoName) {
        this.manutencaoName = manutencaoName;
    }

    public String toString() {
        return this.manutencaoName + "(Última Troca: " + this.manutencaoDate + ")";
    }

}