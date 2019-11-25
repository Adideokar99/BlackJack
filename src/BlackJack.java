/*
* BlackJack.java
* Author: Aditya Deokar
* Submission Date: 12/04/2017
*
* Purpose: Class that instantiates the BlackJack gmae
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without
* written consent from the Department of Computer Science.
*/
/**
 * Class representing a single player blackjack game
 */
public class BlackJack {
 
 private Deck deck;
 private Dealer dealer;
 private Player player;


 /**
  * Constructs and prepares for a new game of BlackJack.
  * Creates player, dealer and deck objects then shuffles
  * the deck and gives both the dealer and player two cards.
  */
 public BlackJack() {
  this.player = new Player();
  this.dealer = new Dealer();
  this.deck = new Deck();
  this.deck.shuffle();
  player.getHand().addCard(deck.draw());
  player.getHand().addCard(deck.draw());
  dealer.getHand().addCard(deck.draw());
  dealer.getHand().addCard(deck.draw());
 }
 /**
  * Restarts in a few steps
  * 1. The Player and dealer return their cards to the deck.
  * 2. The deck is shuffled.
  * 3. Both the player and the dealer receive two cards drawn form the top of the deck.
  */
 public void restart() {
  player.returnCardstoDeck(this.deck);
  dealer.returnCardstoDeck(this.deck);
  deck.shuffle();
  player.getHand().addCard(deck.draw());
  player.getHand().addCard(deck.draw());
  dealer.getHand().addCard(deck.draw());
  dealer.getHand().addCard(deck.draw());
 }
 /**
  * Returns the value of a card in a standard game of Blackjack based on the type of the card
  * ex. An Ace would return 1, a 2 would return 2... 
  * @param c card whose value is extracted
  * @return value of the card
  */
 public static int getValueOfCard(Card c) {
  if (c.getType() == Card.Type.ACE) {
	  return 1;
  }
  if (c.getType() == Card.Type.TWO) {
	  return 2;
  }
  if (c.getType() == Card.Type.THREE) {
	  return 3;
  }
  if (c.getType() == Card.Type.FOUR) {
	  return 4;
  }
  if (c.getType() == Card.Type.FIVE) {
	  return 5;
  }
  if (c.getType() == Card.Type.SIX) {
	  return 6;
  }
  if (c.getType() == Card.Type.SEVEN) {
	  return 7;
  }
  if (c.getType() == Card.Type.EIGHT) {
	  return 8;
  }
  if (c.getType() == Card.Type.NINE) {
	  return 9;
  }
  if (c.getType() == Card.Type.TEN) {
	  return 10;
  }
  if (c.getType() == Card.Type.JACK) {
	  return 10;
  }
  if (c.getType() == Card.Type.QUEEN) {
	  return 10;
  }
  else {
	  return 10;
  }
 }
 /**
  * Returns the maximum value of the hand that does not result in a bust
  * @param h Hand whose value is returned
  * @return value of h
  */
 public static int getValueOfHand(Hand h) {
	 int sum = 0;
	for (int i = 0; i < h.getCards().length; i++) {
		sum = sum + getValueOfCard(h.getCards()[i]);
	}
	return sum;
	}
 

 /**
  * @return Deck used to play
  */
 public Deck getDeck() {
  return deck;
 }
 
 /**
  * @return Dealer of the game
  */
 public Dealer getDealer() {
  return dealer;
 }
 
 /**
  * @return Player playing the blackjack game
  */
 public Player getPlayer() {
  return player;
 }

}
