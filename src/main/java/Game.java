public class Game {
	private Deck deck;

	public Game(Deck deck) {
		this.deck = deck;
	}

	public int compareCards(Card card1, Card card2) {
		if (card1.getRank().getValue() > card2.getRank().getValue()) {
			return 1;
		}
		if (card1.getRank().getValue() < card2.getRank().getValue()) {
			return -1;
		} else {
			return 0;
		}
	}
}