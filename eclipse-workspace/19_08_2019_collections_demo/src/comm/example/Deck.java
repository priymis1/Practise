package comm.example;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Deck {
	//to create  NEW deck
	/*private Suit suit;
	private Rank rank;
	*/
	private static List<Card> protoDeck=new ArrayList<Card>();
	
	static {
		for(Suit s:Suit.values())
		{
			for(Rank r:Rank.values())
			{
				protoDeck.add(new Card(s,r));
			}
		}
			
	}
	
	public static void main(String[] args)
	{
		System.out.println(protoDeck);
	}

}
