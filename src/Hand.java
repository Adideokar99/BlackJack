/*
* Hand.java
* Author: Aditya Deokar
* Submission Date: 12/04/2017
*
* Purpose: Class that instantiates the Hand object
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
 * 
 * @author ghyzel
 *
 */
public class Hand {
 
 /**
  * The cards in the hand
  */
 private Card [] cards;
 
 /**
  * Creates an empty hand
  */
 public Hand() {
  //Initializing an empty array. 
  //Calling cards.length on this array would return 0
  cards = new Card[0];  
 }

 /**
  * Adds Card c to the hand
  * 
  * @param c card to be added
  */
 public void addCard(Card c) {
	 Card [] temp = this.cards;
  this.cards = new Card[temp.length + 1];
  for (int i = 0; i < temp.length; i++) {
	  this.cards[i] = temp[i];
  }
  this.cards[cards.length - 1] = c;
 }
 
 /**
  * @return number of cards in the hand
  */
 public int size() {
  return this.cards.length;
 }
 
 /**
  * Returns an array of all the cards in the hand
  * 
  * @return the cards in the hand
  */
 public Card[] getCards() {
  // Ensure you return reference to the copy of the cards array
  // and not a reference actual cards array!
	 Card [] temp = new Card[this.cards.length];
	 for (int i = 0; i < cards.length; i++) {
		 temp[i] = this.cards[i];
	 }
	 return temp;
}
 
 /**
  * Empties the hand, and returns an array containing the discarded cards.
  * 
  * @return the discarded cards
  */
 public Card[] emptyHand() {
	 Card[]temp = this.cards;
	 this.cards = new Card[0]; 
	 return temp;
	 }
 
 /**
  * Returns a String representation of the hand
  * 
  * E.g.
  * 
  * "Empty Hand"
  * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
  * 
  * @return a String representing the hand
  */
 @Override
 public String toString() {
  // HINT: Use the toString() method of the card class
	 if (this.cards.length == 0) {
		return "Empty hand";
	 }
	 
	 else {
  String s = "";
  for (int i = 0; i < this.cards.length; i++) {
	  s = "\n" + (i + 1) + this.cards[i].getType() + " OF " + this.cards[i].getSuit() + "S";
  }
  return s;
	 }
 }
}