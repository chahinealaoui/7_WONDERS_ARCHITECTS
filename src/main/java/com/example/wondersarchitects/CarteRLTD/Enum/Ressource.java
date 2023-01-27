package com.example.wondersarchitects.CarteRLTD.Enum;

public enum Ressource {

    Bois("Bois"), Brique("Brique"), Verre("Verre"), Papier("Papier"),Pierre("Pierre");

    private String ressource;

    private Ressource(String ressource){
        this.ressource = ressource;
    }

    public String getRessource(){
        return this.ressource;
    }

}