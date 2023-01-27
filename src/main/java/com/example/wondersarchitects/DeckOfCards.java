package com.example.wondersarchitects;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
    private Image backOfCardImage;


    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
        backOfCardImage = new Image("images/cards/card-back/card-back-question.png");
    }


    public DeckOfCards() {
        List<String> color = Card.getValidColor();

        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String couleur:color) {
            for (int i = 0; i<47; i++)
                for (String faceName:faceNames)
                    if (couleur.equals("jaune") && faceName.equals("piece"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("bleu") && faceName.equals("2pdv"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("bleu") && faceName.equals("3pdv"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("rouge") && faceName.equals("bouclier"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("rouge") && faceName.equals("bouclierSC"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("rouge") && faceName.equals("bouclierDC"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("vert") && faceName.equals("equerre"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("vert") && faceName.equals("engrenage"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("vert") && faceName.equals("tablette"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("gris") && faceName.equals("bois"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("gris") && faceName.equals("papier"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("gris") && faceName.equals("verre"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("gris") && faceName.equals("pierre"))
                        deck.add(new Card(faceName,couleur));
                    else if (couleur.equals("gris") && faceName.equals("brique"))
                        deck.add(new Card(faceName,couleur));
        }
        Collections.shuffle(deck);
        backOfCardImage = new Image("images/cards/card-back/card-back-question.png");
    }


    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Image getBackOfCardImage() {
        return backOfCardImage;
    }

    public void setBackOfCardImage(Image backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }

    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }


}