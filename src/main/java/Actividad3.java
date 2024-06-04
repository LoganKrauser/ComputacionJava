import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private String suit; // Palo: tréboles, corazones, picas o diamantes
    private String color; // Color: rojo o negro
    private String value; // Valor: 2 al 10, A, J, Q, K

    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    public String toString() {
        return suit + "," + color + "," + value;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String suit : suits) {
            for (String value : values) {
                String color = (suit.equals("tréboles") || suit.equals("picas")) ? "negro" : "rojo";
                cards.add(new Card(suit, color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            if (!cards.isEmpty()) {
                this.pick();
            }
        }
    }
}

public class Actividad3 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}
