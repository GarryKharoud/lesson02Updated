package com.example.lesson02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

//  Implements Initializable means CardHandViewcontroller is also an Initializable class
//  Initializable is an interface that defines we must have a method called Initialize
public class CardHandViewController implements Initializable
{

    @FXML
    private Label colourNameLabel;

    @FXML
    private Label faceNameLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label suitNameLabel;

    @FXML
    private Label valueNameLabel;

    private DeckOfCards deck;

    @FXML
    void dealNextCard()
    {
        faceNameLabel.setText("Booyah");
        Card cardSelected = deck.dealTopCard();
        faceNameLabel.setText("Face Name "+cardSelected.getFaceName());
        colourNameLabel.setText("Color "+cardSelected.getColor());
        suitNameLabel.setText("Suit "+cardSelected.getSuit());
        valueNameLabel.setText("Value "+cardSelected.getCardValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        deck = new DeckOfCards();
        dealNextCard();
    }
}
