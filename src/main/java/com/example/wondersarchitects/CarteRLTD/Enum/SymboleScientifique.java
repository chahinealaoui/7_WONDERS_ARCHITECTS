package com.example.wondersarchitects.CarteRLTD.Enum;

public enum SymboleScientifique {

    Tablette("Tablette"), Geometrie("geometrie"), Ingenieurie("Ingenieurie");

    private String symbolescientifique;

    private SymboleScientifique(String symbolescientifique){
        this.symbolescientifique = symbolescientifique;
    }

    public String getSymbolescientifique(){
        return this.symbolescientifique;
    }

}
