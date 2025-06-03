package cardgame.model.materials.deck;

import java.util.ArrayList;
import java.util.Objects;

public class Deck {
	
	private ArrayList cards;

	public Deck() {
		this.cards = new ArrayList<>();
	}
	
	public Boolean isEmpty() {
		return cards.isEmpty();
	}

	@Override
	public int hashCode() {
		return Objects.hash(cards);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deck other = (Deck) obj;
		return Objects.equals(cards, other.cards);
	}
	
	

}
