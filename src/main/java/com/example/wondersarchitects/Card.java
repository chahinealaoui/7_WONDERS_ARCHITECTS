package com.example.wondersarchitects;

import javafx.scene.image.Image;


import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, color;
    private Image image;

    /* Constructeur de la classe Card, permet de definir une carte par sa couleur (color), ainsi que par son facename qui correspond à l'effet de la carte (pierre, piece, etc)*/
    public Card(String faceName, String color) {
        setFaceName(faceName);
        setColor(color);
        String fileName = faceName + "_" + color +".png";
        image = new Image("images/cards/card-back/"+fileName);
    }

    public String getFaceName() {
        return faceName;
    }

    public Image getImage() { return image; }

    public void setImage(Image image) {
        this.image = image;
    }

    /* permet d'établir une liste d'effet valide qui nous servira pour réaliser le deck de carte*/
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("brique","verre","piece","papier","pierre","bois","3pdv","2pdv","equerre","tablette",
                "engrenage","bouclier","bouclierSC","bouclierDC");
    }

    public void setFaceName(String faceName) {
            this.faceName = faceName;
    }

    public String getColor() {
        return color;
    }

    /* permet d'établir une liste de couleur qui nous servira pour réaliser le deck de carte */

    public static List<String> getValidColor()
    {
        return Arrays.asList("rouge","vert","bleu","jaune","gris");
    }

    public void setColor(String color) {
            this.color = color;
    }
}