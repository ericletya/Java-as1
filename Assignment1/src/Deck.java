import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        for (int i = 1; i <= 54; i++){
            cards.add(new MineralCard(i, i));
        }
        for (int i =55; i<=60; i++){
            cards.add(new SuperTrumpCard(i, i));
        }
    }

    public ArrayList<Card> shuffle(){
        Collections.shuffle(cards);
        return cards;
    }

    public Card drawFromDeck(){
        return cards.remove(cards.size()-1);
    }

    public int getTotalCards(){
        return cards.size();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void display(){
        for (Card card: cards){
            System.out.printf("Card %d \n", card.getName());
        }
    }
}