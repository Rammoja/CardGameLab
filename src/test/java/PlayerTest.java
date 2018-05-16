import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Texas Pete");
        card = new Card(SuitType.SPADES, RankType.ACE);
        card.add(card);
    }

    @Test
    public void hasName(){
        assertEquals("Texas Pete", player.getName());
    }

    @Test
    public void canGetCard(){
       player.getCard(card);
        assertEquals(1, player.cardCount());
    }
}
