package com.example.lesson02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    /**
     * dealing the top card from deck
     */

    public  void shuffle()
    {
        Collections.shuffle(deck);
    }

    public  Card dealTopCard()
    {
        if(deck.size()>0)
        {
            return  deck.remove(0);
        }
        else
        {
            return null;
        }
    }
}
