package cardgame.application;

import cardgame.model.Card;
import cardgame.model.Rank;
import cardgame.model.Suit;

public class CardMain {
	
	private static void message(String text) {
		System.out.println(text);
	}
	
	public static void line() {
        System.out.println("--------------------------------------------------");
    }

	public static void main(String[] args) {
		
		createCard();
		transformEachSuitIntoRightCode();
		transformEachRankIntoRightCode();
	
	}

	private static void createCard() {
		Card aceOfHearts = new Card(Rank.ACE, Suit.HEARTS);
		Card kingOfDiamonds = new Card(Rank.KING, Suit.DIAMONDS);
		Card queenOfClubs = new Card(Rank.QUEEN, Suit.CLUBS);
		Card tenOfSpades = new Card(Rank.TEN, Suit.SPADES);
		
		message("Ace of hearts well created !");
		message("with " + aceOfHearts.getRank() + " as rank and " + aceOfHearts.getSuit().symbole() + " as suit.");
		message("the display of this car is " + aceOfHearts.toText());
		line();
		message("King of diamonds well created !");
		message("with " + kingOfDiamonds.getRank() + " as rank and " + kingOfDiamonds.getSuit().symbole() + " as suit.");
		message("the display of this car is " + kingOfDiamonds.toText());
		line();
		message("Queen of clubs well created !");
		message("with " + queenOfClubs.getRank() + " as rank and " + queenOfClubs.getSuit().symbole() + " as suit.");
		message("the display of this car is " + queenOfClubs.toText());
		line();
		message("Ten of spades well created !");
		message("with " + tenOfSpades.getRank() + " as rank and " + tenOfSpades.getSuit().symbole() + " as suit.");
		message("the display of this car is " + tenOfSpades.toText());
	}

	private static void transformEachRankIntoRightCode() {
		line();
		message("Transform each rank element into right code");
		line();
		message("The display of " + Rank.ACE + " is " + Rank.ACE.symbole());
		message("The display of " + Rank.TWO + " is " + Rank.TWO.symbole());
		message("The display of " + Rank.THREE + " is " + Rank.THREE.symbole());
		message("The display of " + Rank.FOUR + " is " + Rank.FOUR.symbole());
		message("The display of " + Rank.FIVE + " is " + Rank.FIVE.symbole());
		message("The display of " + Rank.SIX + " is " + Rank.SIX.symbole());
		message("The display of " + Rank.SEVEN + " is " + Rank.SEVEN.symbole());
		message("The display of " + Rank.EIGHT + " is " + Rank.EIGHT.symbole());
		message("The display of " + Rank.NINE + " is " + Rank.NINE.symbole());
		message("The display of " + Rank.TEN + " is " + Rank.TEN.symbole());
		message("The display of " + Rank.JACK + " is " + Rank.JACK.symbole());
		message("The display of " + Rank.QUEEN + " is " + Rank.QUEEN.symbole());
		message("The display of " + Rank.KING + " is " + Rank.KING.symbole());
	}

	
	private static void transformEachSuitIntoRightCode() {
		line();
		message("Transform each suit element into right code");
		line();
		message("The display of " + Suit.CLUBS + " is " + Suit.CLUBS.symbole());
		message("The display of " + Suit.DIAMONDS + " is " + Suit.DIAMONDS.symbole());
		message("The display of " + Suit.HEARTS + " is " + Suit.HEARTS.symbole());
		message("The display of " + Suit.SPADES + " is " + Suit.SPADES.symbole());
	}

}
