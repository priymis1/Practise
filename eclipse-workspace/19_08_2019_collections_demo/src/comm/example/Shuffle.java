package comm.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Shuffle {
	
	//private Suit suit;
	//private Rank rank;
	
	private static List<Card> protoDeck = new ArrayList<Card>();
	
	Scanner k = new Scanner(System.in);
	private static int hands;
	private static int cardsineachhand;
	{
	hands = k.nextInt();
	cardsineachhand=k.nextInt();
	}
	
	static {
		Collections.shuffle(protoDeck);
		for(int i=0; i<hands;i++)
		{
			System.out.println("HAND" +i );
			{
				for (int j=0; j<cardsineachhand;j++)
				{
					for(Suit s:Suit.values())
					{
						for(Rank r:Rank.values())
						{
							protoDeck.add(new Card(s,r));
						}
					}
						
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(protoDeck);


	}

}
