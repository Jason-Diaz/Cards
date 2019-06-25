package lab4;

/**
 * <p>Title: The Lab4 Application class</p>
 *
 * <p>Description: This class test the various methods in the Card class to see what is returned and
 * determine if the methods work properly. </p>
 *
 * @author Jason Diaz
 */

public class Lab4App {
	public static void main(String[] args)
	{
		Card card1 = new Card(24);
		System.out.println("Card 1: " + card1.toString());
		System.out.println("Card 1's value is: " + card1.getValue());
		System.out.println("Card 1's suit is: " + card1.getSuit());
		System.out.println("card 1 is a face card: " + card1.isAFaceCard() + "\n");

	
		Card card2 = new Card(7);
		System.out.println("Card 2: " + card2.toString());
		System.out.println("card 2 is a face card: " + card2.isAFaceCard() + "\n");
		
		System.out.println("Card 1's value is: " + card1.determinePointValue());
		System.out.println("Card 2's value is: " + card2.determinePointValue() + "\n");
		
		Card card3 = new Card(50);
		Card card4 = new Card(7);
		Card card5 = new Card(38);
		System.out.println("Card 1 is " + card1.getSuit() + " - color is red: " + card1.isRed());
		System.out.println("Card 3 is " + card3.getSuit() + " - color is red: " + card3.isRed());
		System.out.println("Card 4 is " + card4.getSuit() + " - color is red: " + card4.isRed());
		System.out.println("Card 5 is " + card5.getSuit() + " - color is red: " + card5.isRed() + "\n");
		
		if(card2.equalValue(card4)) 
			System.out.println(card2.toString() + " and " + card4.toString() + " have the same value.");
				
		else System.out.println(card2.toString() + " and " + card4.toString() + " do not have the same value.");
		
		
		if(card1.equalValue(card5))
			System.out.println(card1.toString() + " and " + card5.toString() + " have the same value.");
				
		else System.out.println(card1.toString() + " and " + card5.toString() + " do not have the same value.");
	}

}
