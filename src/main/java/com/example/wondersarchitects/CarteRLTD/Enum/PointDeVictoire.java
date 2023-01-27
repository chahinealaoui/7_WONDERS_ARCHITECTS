package com.example.wondersarchitects.CarteRLTD.Enum;

public enum PointDeVictoire {

    TWO_PDV("TWO_PDV"), THREE_PDV("THREE_PDV");

    private String pdv;

    private PointDeVictoire(String pdv){
        this.pdv = pdv;
    }

    public String getPointDeVictoire(){
        return this.pdv;
    }


}
