package com.company;

public class Runner {

    public static void main(String[] args) {
        String[] ranks = {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        String[] suits = {"Bear","Unicorn","Panda","Koala"};
        int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Deck deckTester = new Deck(ranks, suits, pointValue);

        deckTester.shuffle();

        int deckSize = deckTester.size();
        for(int i = 0; i < deckSize;i++) {
            deckTester.deal();
        }
    }
}
