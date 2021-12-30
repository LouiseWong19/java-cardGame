package com.company;

import java.util.ArrayList;

public class CardGame {
    // add number in?
    private ArrayList<Card> CardListArr;
    private String name;

    public CardGame (String name,ArrayList<Card> CardListArr){
        this.name=name;
        this.CardListArr=CardListArr;
    }

    public ArrayList<Card> getDeck(){
        return CardListArr;
    }
}
