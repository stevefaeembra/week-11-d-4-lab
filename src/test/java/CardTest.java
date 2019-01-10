import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.FIVE, card.getRank());
    }

    @Test
    public void canGetCardValue() {
        assertEquals(5, card.getRank().getValue());
    }

    @Test
    public void canGetNumberCardValues() {
        assertEquals(13,RankType.getNumberValues());
    }
}