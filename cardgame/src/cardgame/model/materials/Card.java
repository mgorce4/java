package cardgame.model.materials;

import java.util.Objects;

public class Card {
	private Rank rank;
	private Suit suit;
	
	public Rank getRank() {
		return rank;
	}
	
	
	public Suit getSuit() {
		return suit;
	}
	
	
	
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toText() {
		return rank.symbole() + suit.symbole();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(suit,rank);
	}
	
	

}
