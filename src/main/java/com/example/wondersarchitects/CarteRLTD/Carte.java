package com.example.wondersarchitects.CarteRLTD;

import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.List;

public class Carte extends BaseCarte{

    private String couleur;
    private String effet;

    private List<String> icon;



    public Carte(String couleur, String effet, String back, List<String> icon) {
        super(back);
        setCouleur(couleur);
        setEffet(effet);
        setBack(back);
        setIcon(icon);
    }

    public String getCouleur() {
        return couleur;
    }

    public static List<String> getValidCouleur(){
        return Arrays.asList("grise","jaune","rouge","bleue","verte");
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getEffet(String effet) {
        return this.effet;
    }

    public void setEffet(String effet){
        this.effet = effet;
    }

    public String toString(){
        if (icon != null)
            return String.format("%s %s '%s' '%s'",back, couleur,effet,icon.toString());
        else
            return String.format("%s %s '%s'",back, couleur,effet);
    }

    public List<String> getIcon() {
        return icon;
    }

    public void setIcon(List<String> icon) {
        this.icon = icon;
    }
}