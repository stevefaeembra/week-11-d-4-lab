import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

	private Game game;
	private Deck deck;

	@Before
	public void setUp() {
		deck = new Deck();
		game = new Game(deck);
	}

	@Test
	public void hasDeck(){
		assertEquals(52, deck.countCards());
	}

	@Test
	public void canCompareCardsFirstHigher() {
		Card card1 = new Card(SuitType.DIAMONDS, RankType.FIVE);
		Card card2 = new Card(SuitType.SPADES, RankType.FOUR);
		assertEquals(1, game.compareCards(card1, card2));
	}

	@Test
	public void canCompareCardsFirstLower() {
		Card card1 = new Card(SuitType.DIAMONDS, RankType.TWO);
		Card card2 = new Card(SuitType.SPADES, RankType.FOUR);
		assertEquals(-1, game.compareCards(card1, card2));

	}

	@Test
	public void canCompareCardsSameValue() {
		Card card1 = new Card(SuitType.DIAMONDS, RankType.FIVE);
		Card card2 = new Card(SuitType.SPADES, RankType.FIVE);
		assertEquals(0, game.compareCards(card1, card2));

	}


}
