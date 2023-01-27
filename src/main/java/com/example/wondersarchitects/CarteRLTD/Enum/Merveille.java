package com.example.wondersarchitects.CarteRLTD.Enum;

public enum Merveille {

    Alexandrie("Alexandrie"), Ephese("Ephese"), Babylone("Babylone"), Rhodes("Rhodes"), Halicarnasse("Halicarnasse"),Olympie("Olympie"), Gizeh("Gizeh"), PtInt("PtInt");

    private String merveille;
    private Merveille(String merveille){
        this.merveille =merveille;
    }

    public String getMerveille() {
        return this.merveille;
    }





}