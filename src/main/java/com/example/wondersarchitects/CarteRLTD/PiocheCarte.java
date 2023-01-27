package com.example.wondersarchitects.CarteRLTD;

import com.example.wondersarchitects.CarteRLTD.Enum.*;

import javax.swing.text.html.ImageView;
import java.util.*;


public class PiocheCarte {

    private ArrayList<Carte> pioche;

    public PiocheCarte(ArrayList<Carte> pioche){
        this.pioche = pioche;
    }

    public PiocheCarte(){
        List<String> couleurs = Carte.getValidCouleur();

        pioche = new ArrayList<>();
        for (String couleur: couleurs){
            for (int i = 0; i<47; i++) {
                if (couleur.equals("grise"))
                    pioche.add(new Carte(couleur, randomRessource(), Merveille.PtInt.getMerveille(), null));
                else if (couleur.equals("jaune"))
                    pioche.add(new Carte(couleur, "Piece",Merveille.PtInt.getMerveille(),null));
                else if (couleur.equals("bleue"))
                    pioche.add(new Carte(couleur, randomPointDeVictoire(),Merveille.PtInt.getMerveille(),randomBlueIcons()));
                else if (couleur.equals("rouge"))
                    pioche.add(new Carte(couleur, "Bouclier",Merveille.PtInt.getMerveille(),randomRedIcons()));
                else if (couleur.equals("verte"))
                    pioche.add(new Carte(couleur, randomSymboleScientifique(),Merveille.PtInt.getMerveille(),null));
            }
        }
        Collections.shuffle(pioche);
    }


    public String getMerveille(int i){
        switch(i){
            case 0:
                return Merveille.valueOf("Alexandrie").name();
            case 1:
                return Merveille.valueOf("Ephese").name();
            case 2:
                return Merveille.valueOf("Babylone").name();
            case 3:
                return Merveille.valueOf("Rhodes").name();
            case 4:
                return Merveille.valueOf("Halicarnasse").name();
            case 5:
                return Merveille.valueOf("Olympie").name();
            case 6:
                return Merveille.valueOf("Gizeh").name();
            case 7:
                return Merveille.valueOf("PtInt").name();
            default:
                return null;
        }
    }

    public String randomMerveille(){
        Random a = new Random();
        int i = a.nextInt(8);
        return getMerveille(i);
    }

    public String getPointDeVictoire(int i){
        switch(i){
            case 0:
                return PointDeVictoire.valueOf("TWO_PDV").name();
            case 1:
                return PointDeVictoire.valueOf("THREE_PDV").name();
            default:
                return null;
        }
    }

    public String randomPointDeVictoire(){
        Random a = new Random();
        int i = a.nextInt(2);
        return getPointDeVictoire(i);
    }

    public String getRessource(int i){
        switch(i){
            case 0:
                return Ressource.valueOf("Bois").name();
            case 1:
                return Ressource.valueOf("Brique").name();
            case 2:
                return Ressource.valueOf("Verre").name();
            case 3:
                return Ressource.valueOf("Papier").name();
            case 4:
                return Ressource.valueOf("Pierre").name();
            default:
                return null;
        }
    }
    public String randomRessource(){
        Random a = new Random();
        int i = a.nextInt(5);
        return getRessource(i);
    }


    public List<String> randomRedIcons(){
        List<String> redIcon = new ArrayList<>();
        Random b = new Random();
        int listSize = b.nextInt(3);
        for(int j =0;j< listSize;j++){
            redIcon.add(Icon.valueOf("Corne").name());
        }
        return redIcon;
    }

    public List<String> randomBlueIcons(){
        List<String> blueIcon = new ArrayList<>();
        Random b = new Random();
        int listSize = b.nextInt(2);
        for(int j =0;j< listSize;j++){
            blueIcon.add(Icon.valueOf("Chat").name());
        }
        return blueIcon;
    }

    public String getSymboleScientifique(int i){
        switch(i){
            case 0:
                return SymboleScientifique.valueOf("Tablette").name();
            case 1:
                return SymboleScientifique.valueOf("Geometrie").name();
            case 2:
                return SymboleScientifique.valueOf("Ingenieurie").name();
            default:
                return null;
        }
    }

    public String randomSymboleScientifique(){
        Random a = new Random();
        int i = a.nextInt(3);
        return getSymboleScientifique(i);
    }


}