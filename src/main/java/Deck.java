import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards;

	public Deck() {
		this.cards = new ArrayList<>();
		this.populateDeck();
	}

	public void populateDeck() {
		for (SuitType suit:
		     SuitType.values()) {
			for (RankType rank: RankType.values()) {
				Card addCard = new Card(suit,rank);
				cards.add(addCard);
//				System.out.println(String.format("%s : %s",rank.name(),suit.name()));
			}
		}
	}

	public int countCards() {
		return cards.size();
	}

	public void shuffleCards(){
		Collections.shuffle(cards);
		for (Card card: cards) {
//			System.out.println(String.format("%s : %s", card.getRank(), card.getSuit()));
		}
	}


	public Card dealCard() {
		shuffleCards();
		return cards.remove(0);
	}
}
