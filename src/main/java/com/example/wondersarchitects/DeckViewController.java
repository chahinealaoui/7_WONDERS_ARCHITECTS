package com.example.wondersarchitects;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {

    @FXML private Button nextCardButton;
    @FXML private ImageView deckimageView;
    @FXML private ImageView activeCardimageView;
    private DeckOfCards deck;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new DeckOfCards();

        deckimageView.setImage(deck.getBackOfCardImage());
    }

    @FXML
    public void nextCardButtonPushed()
    {
        activeCardimageView.setImage(deck.dealTopCard().getImage());
    }


}
