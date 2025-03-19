package cardgame.model;

public enum Suit {
	CLUBS ("\u2663"),
	DIAMONDS ("\u2666"),
	HEARTS ("\u2665"),
	SPADES ("\u2660");
	
	private String symbole;
	
	private Suit (String symbole) {
		this.symbole = symbole;
	}
	
	public String symbole() {
		return this.symbole;
	}
}
