package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> unDealt = new ArrayList<Card>();
    List<Card> Dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suits, int[] pointValue){
        for(int i = 0; i < suits.length; i++){
            for(int j = 0 ; j < rank.length; j++){
                Card newCard = new Card(rank[j],suits[i],pointValue[j]);
                unDealt.add(newCard);
            }
        }
    }

    public boolean isEmpty(){
        if(unDealt.size()==0){
            return true;
        }
        return false;
    }

    public int size(){
        return unDealt.size();
    }

    public Card deal(){
        Card topCard = unDealt.get(0);
        if(topCard==null){
            return null;
        }
        unDealt.remove(0);
        Dealt.add(topCard);
        System.out.println(topCard.toString());
        return topCard;
    }

    public void shuffle(){
        unDealt.addAll(Dealt);
        Dealt.clear();
        for(int i = unDealt.size()-1; i >= 0; i--){
            int r = (int)(Math.random() * unDealt.size());
            swap(unDealt,i,r);
        }
    }
    public void swap(List<Card> list,int i, int j){
        Card temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    public String toString(){
        String result = "";
        for(int i =0 ; i< unDealt.size();i++){
            result+=unDealt.get(i).toString() + " ";
        }
        return result;
    }
}