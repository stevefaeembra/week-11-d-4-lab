import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

	private Deck deck;



	@Before
	public void setUp() {
		deck = new Deck();
	}


	@Test
	public void has52Cards() {
		assertEquals(52, deck.countCards());
	}

	@Test
	public void canShuffle(){
		deck.shuffleCards();
		assertEquals(52, deck.countCards());
	}

	@Test
	public void canDealCard() {
		deck.dealCard();
		assertEquals(51, deck.countCards());
	}


}
