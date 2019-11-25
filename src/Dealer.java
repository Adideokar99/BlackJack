/*
* Dealer.java
* Author: Aditya Deokar
* Submission Date: 12/04/2017
*
* Purpose: Class that instantiates the Dealer object
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
 * The Dealer in your game of BlackJack. Draws until he/she gets 17 points or has 5 cards.
 *
 */
public class Dealer {
 /**
  * The dealers hand
  */
 Hand hand;
 
 /**
  * Construct a new dealer with an empty hand
  */
 public Dealer() {
  hand = new Hand();
  
 }
 
 /**
  * Dealer draws a card if his hand is worth less than 17 points and has less than 5 cards in in his hand.
  * 
  * @param deck
  * @return
  */
 public Card playTurn(Deck deck) {
  if (BlackJack.getValueOfHand(this.hand) < 17 && this.hand.size() < 5) {
	  Card temp = deck.draw();
	  this.hand.addCard(temp);
	  return temp;
  }
  else
  {
	  return null;
  }
  
 }
 
 /**
  * A method to check if the dealer has busted
  * @return boolean true if the dealer has busted
  */
 public boolean busted() {
  if (BlackJack.getValueOfHand(this.hand) > 21) {
	  return true;
  }
  return false;
 }
 
 /**
  * A method to check if the dealer will draw a card.
  * @return
  */
 public boolean isDone() {
  if (BlackJack.getValueOfHand(this.hand)>= 17 && this.hand.size() >= 5) {
	  return true;
  }
  else {
	  return false;
  }
 }
 
 /**
  * Returns the dealers cards to the deck
  * @param d Deck to return the cards to
  */
 public void returnCardstoDeck(Deck d) {
  Card[]temp = this.hand.emptyHand();
  for (int i = 0; i < temp.length; i++) {
	  d.addToBottom(temp[i]);
  }
 }
 /**
  * @return Hand the dealer's hand
  */
 public Hand getHand() {
  return hand;
 }
}
