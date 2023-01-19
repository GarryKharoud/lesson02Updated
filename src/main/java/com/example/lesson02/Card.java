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
}