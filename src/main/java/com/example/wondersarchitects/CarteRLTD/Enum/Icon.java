package com.example.wondersarchitects.CarteRLTD.Enum;

public enum Icon {

    Corne("Corne"),Chat("Chat");

    private String icon;

    private Icon(String icon){
        this.icon = icon;
    }

    public String getIcon(){
        return this.icon;
    }

}