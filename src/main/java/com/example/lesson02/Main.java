package com.example.lesson02;

public class Main
{
    public static void main(String[] args)
    {
        Card card1 = new Card("ACE","HEART");
        System.out.println(card1.toString());
        System.out.println(card1+" color: "+card1.getColor());
        System.out.println(card1+" value: "+card1.getCardValue());

        DeckOfCards deck = new DeckOfCards();
    }
}