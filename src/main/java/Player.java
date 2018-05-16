import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> card;

    public Player(String name) {
        this.name = name;
        this.card = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public int cardCount() {
        return this.card.size();

    }

    public void getCard(Card card) {
        this.card.add(card);
    }
}
