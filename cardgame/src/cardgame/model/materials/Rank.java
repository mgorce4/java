package cardgame.model.materials;

public enum Rank {
	ACE("1"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("J"),
	QUEEN("Q"),
	KING("K");
	
	private String symbole;
	
	private Rank (String symbole) {
		this.symbole = symbole;
	}
	
	public String symbole() {
		return this.symbole;
	}
}
