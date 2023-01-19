package com.example.lesson02;

import java.util.Arrays;
import java.util.List;

public class Card
{
    // These are instance Variables
    private String faceName;
    private String suit;

    /**
     *
     This is a constructor. It is called when we want to instansiate
     (create an instance of our object)
     */
    public Card(String faceName,String suit)
    {
        setFaceName(faceName);
        setSuit(suit);
    }
    public String getFaceName()
    {
        return faceName;
    }

    /**
     *
     * this method returns face names for card objects
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }
    public static List<String> getValidSuit()
    {
        return Arrays.asList("diamonds","hearts","spades","clubs");
    }
    /**
     *
     * Validates if the argument (input) is a valid name
     * "2,3,4,5 ... "
     */
    public  void setFaceName(String faceName)
    {
        faceName = faceName.toLowerCase();
        //a little edit
        if(getValidFaceNames().contains(faceName))
        {
            this.faceName = faceName;
        }
        else
        {
            throw new IllegalArgumentException(faceName + "must be in the list of "+getValidFaceNames());
        }
    }
    public  String getSuit()
    {
        return suit;
    }
    public void setSuit(String suit)
    {
        suit = suit.toLowerCase();
        if(suit.charAt(suit.length()-1)!='s')
        {
            suit = suit+"s";
        }
        if (getValidSuit().contains(suit))
        {
            this.suit = suit;
        }
        else
        {
            throw new IllegalArgumentException(suit +"must be in list of the"+getValidSuit());
        }

    }

    public  String toString()
    {
        return faceName+" of "+suit;
    }

    /**
     * This Method returns the color of the card.
     * Red = hearts or diamonds
     * black = spades or clubs
     */

    public String getColor()
    {
        if(suit.equals("hearts") || suit.equals("diamonds"))
        {
            return "red";
        }
        else
        {
            return "black";
        }
    }
    /**
     * This method will return value of card
     */
    public int getCardValue()
    {
        List<String> faceNames = getValidFaceNames();
        int indexOfCard = faceNames.indexOf(faceName);
        return indexOfCard+2;
        //return  getValidFaceNames().indexOf(faceName+2);
    }
}