import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        addAllCardsToPack();
    }

    public void addAllCardsToPack(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                cards.add(new Card(suit,rank));
            }
        }
    }


    public int noOfCards() {
        return this.cards.size();
    }
}
