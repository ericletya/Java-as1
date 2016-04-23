import java.util.ArrayList;

public class Hand {
    private String name;
    private ArrayList<Card> cards;

    Hand(Deck deck, String name){
        cards = new ArrayList<>();
        for (int i = 1; i<=8; i++){
            cards.add(deck.drawFromDeck());
        }
        this.name = name;
    }

    public void draw(Deck deck){//draws card from deck into hand
        cards.add(deck.drawFromDeck());
    }

    public Card useCard(int cardNumber) {
        Card card_for_use = cards.get(cardNumber - 1);
        cards.remove(cardNumber - 1);
        return card_for_use;
    }.

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + "'s hand is:");
        int i = 1;
        for (Card card: cards){
            System.out.print(i + ")" + card.getName() + " ");
            i++;
            System.out.println();
        }
    }
}