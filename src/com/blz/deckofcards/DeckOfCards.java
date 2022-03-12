/*
 * Write a Program to initialize deck of cards having suit("Clubs","Diamonds","Hearts","Spades")
 * & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print 
 * the Cards thereceived by the 4 Players.
 *
 * 1. Ability to work with GIT
 * 2. Expected to have OOPs
 * 3. Expected to have Data Structures
 *
 * UC3 : Add the method to sequence the Players order and how they should receive 
 *       the cards and further order for play. 
*/

package com.blz.deckofcards;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {

	public static final Scanner scanner = new Scanner(System.in);
	public ArrayList<String> cardsDeck = new ArrayList<String>();

	/*
	 * @purpose : initializing the 52 DeckOfCards to suits and ranks
	 */
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
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	/*
	 * @purpose : we need to have more than 2 players and Max 4 Players
	 */
	public void noOfPlayers() {
		System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println("\n" + player + " players will play the game");
			sequenceOfPlay(player);
		} else {
			System.out.println("Please enter number of players in the Range");
			noOfPlayers();
		}
		scanner.close();
	}

	/*
	 * @purpose: Add the method to sequence the Players
	 */
	public void sequenceOfPlay(int player) {
		System.out.println("\nSequence of cards are below : ");
	}

	public static void main(String[] args) {

		DeckOfCards deckofCards = new DeckOfCards();
		deckofCards.deckofCards();
		deckofCards.noOfPlayers();
	}
}
