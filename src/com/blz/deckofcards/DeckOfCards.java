package com.blz.deckofcards;

import java.util.ArrayList;

public class DeckOfCards {

	public ArrayList<String> cardsDeck = new ArrayList<String>();

	public void deckofCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck is : " + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "-->" + suits[j]);
			}
		}
		toDisplay(cardsDeck); // displaying the cards
	}

	/*
	 * initializing the deck of card
	 */
	public static void toDisplay(ArrayList<String> cardsDeck) {
		// System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		DeckOfCards deckofCards = new DeckOfCards();
		deckofCards.deckofCards();

	}
}
