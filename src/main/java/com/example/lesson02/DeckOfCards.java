package com.example.lesson02;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards
{
    private ArrayList<Card> deck;
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        //deck.add(new Card("2","hearts"));
        List<String> faceNames = Card.getValidFaceNames();
        List<String> suits = Card.getValidSuit();

        for(int i=0;i<suits.size();i++)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName,suits.get(i)));
        }
    }
}
