

public class Deck {
	
	private Card[] deck = new Card[52];
	private int topCard;
	
	Deck() {
		
		topCard = 0;
		for (int i = 0; i < deck.length; i ++)
			deck[i] = new Card(i);
		
	}
			
public void shuffle() {

	topCard = 0;
	
	for (int i = 0; i < 1000; i++) {
		
		int l = (int)(Math.random()*52);
		
		int m = (int)(Math.random()*52);
		
			Card tempCard = deck[l];
		
			deck[l] = deck[m];
		
			deck[m] = tempCard;
	}
}

public Card draw() {
	
	return topCard = 0;
	
	if (topCard < deck.length) {
		
		 theCard = deck[topCard];
		
		 topCard++;
}
	else
		theCard = null;
	
	return theCard;
}
}