package com.company;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card (String suit, String symbol, int value){
        this.suit=suit;
        this.symbol=symbol;
        this.value=value;
    }
    public String toString(){
//        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
//        String [] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String cardDetail = this.suit + " of "+ this.symbol;
        return cardDetail;

    }
}
